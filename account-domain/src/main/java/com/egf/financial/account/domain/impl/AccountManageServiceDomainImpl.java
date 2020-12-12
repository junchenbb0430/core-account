package com.egf.financial.account.domain.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.egf.financial.account.bo.AccountDomainReqBo;
import com.egf.financial.account.bo.AccountDomainResBo;
import com.egf.financial.account.codes.BizErrorCodeEnum;
import com.egf.financial.account.domain.AccountManageServiceDomain;
import com.egf.financial.account.entity.AccountEntity;
import com.egf.financial.account.flow.SequenceFlowGenerator;
import com.egf.financial.account.mapper.AccountMapper;
import com.egf.financial.account.resp.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class AccountManageServiceDomainImpl implements AccountManageServiceDomain {

    private Logger logger = LoggerFactory.getLogger(AccountManageServiceDomainImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 同一个客户号下，同一个币种同一个账户类型下只能有一个账户
     * @param acctDomainBo
     * @return
     */
    @Override
    @Transactional
    public ResponseResult<AccountDomainResBo> openAccount(AccountDomainReqBo acctDomainBo) {
        ResponseResult<AccountDomainResBo> responseResult = new ResponseResult<AccountDomainResBo>();
        AccountDomainResBo accountDomainRes = new AccountDomainResBo();
        responseResult.setData(accountDomainRes);
        logger.info("开户请求信息为:{}",JSON.toJSONString(acctDomainBo));
        // 1. 查询当前客户开立账户是否已经存在
        AccountEntity dbAcctEntity = accountMapper.selectEntityByCustomerIdAndAcctType(acctDomainBo.getCustomerId(),acctDomainBo.getAccountType());
        if(Objects.nonNull(dbAcctEntity)){
            logger.info("当前客户号{}下已经存在当前账户类型:{}的账户，不能再开通!",
                    acctDomainBo.getCustomerId(),acctDomainBo.getAccountType());
            accountDomainRes.setTransFlow(acctDomainBo.getTransFlow());
            accountDomainRes.setCustomerId(acctDomainBo.getCustomerId());
            accountDomainRes.setAccountName(acctDomainBo.getAccountName());
            responseResult.setBizErrorCode(BizErrorCodeEnum.DOMAIN_ACCT_IS_EXIST);
            return responseResult;
        }

        // 设置账号
        acctDomainBo.setAccountNo(SequenceFlowGenerator.generateFixedLengthDigitalFlow());

        // 1. 调用开户服务
        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(acctDomainBo,accountEntity);

        accountMapper.insertSelective(accountEntity);

        // 2. 查询开户信息
        AccountEntity  accountEntityResult = accountMapper.selectByPrimaryKey(accountEntity.getAccountId());
        BeanUtils.copyProperties(accountEntityResult,accountDomainRes);
        accountDomainRes.setAccountId(accountEntityResult.getAccountId());
        accountDomainRes.setAccountName(accountEntityResult.getAccountName());
        accountDomainRes.setAccountType(accountEntityResult.getAccountType());
        accountDomainRes.setAccountStatus(accountEntityResult.getAccountStatus());
        accountDomainRes.setChannelId(accountEntityResult.getChannelId());
        // 应答结果
        logger.info("客户号{}开户成功{}!",accountEntityResult.getAccountNo(), JSONObject.toJSONString(accountDomainRes));
        return responseResult;
    }

    @Override
    public ResponseResult<AccountDomainResBo> fireAccount(AccountDomainReqBo acctDomainBo) {
        // 1.
        return null;
    }

    @Override
    public ResponseResult<AccountDomainResBo> closeAccount(AccountDomainReqBo acctDomainBo) {

        //1. 检查当前账户状态,是否已经销户，是否司法冻结。

        // 2.检查当前账户余额

        // 3.如果当前账户有余额，不能销户，需要调用其他交易将金额转出
        return null;
    }
}
