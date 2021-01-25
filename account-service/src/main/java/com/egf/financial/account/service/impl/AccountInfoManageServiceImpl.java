package com.egf.financial.account.service.impl;

import com.egf.financial.account.bo.*;
import com.egf.financial.account.bo.acctmanage.AccountDomainReqBo;
import com.egf.financial.account.bo.acctmanage.AccountDomainResBo;
import com.egf.financial.account.date.EgfDateUtils;
import com.egf.financial.account.domain.AccountInfoQueryDomain;
import com.egf.financial.account.domain.AccountManageServiceDomain;
import com.egf.financial.account.enums.AccountStatusEnum;
import com.egf.financial.account.resp.ResponseResult;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class AccountInfoManageServiceImpl implements IAccountInfoManageService {

    @Autowired
    private AccountManageServiceDomain  accountManageServiceDomain;

    @Autowired
    private AccountInfoQueryDomain  acctInfoQueryDomain;

    @Override
    public ResponseResult<AccountInfoResBo> queryAccountDetailByAcctNo(String acctNo) {

        return null;
    }

    @Override
    public ResponseResult<AccountInfoResBo> openAccount(AccounInfoReqBo acctInfo) {
        AccountInfoResBo accountResBo = new AccountInfoResBo();
        ResponseResult<AccountInfoResBo> acctInfoResp = new ResponseResult<AccountInfoResBo>(accountResBo);
        //1. 参数校验及检查
        AccountDomainReqBo acctDomainBo = new AccountDomainReqBo();
        BeanUtils.copyProperties(acctInfo,acctDomainBo);
        acctDomainBo.setCustomerId(acctInfo.getCustomerId());
        acctDomainBo.setAccountStatus(AccountStatusEnum.ACCT_STATUS_OPENED.getAcctStatus());//开户状态
        BigDecimal  initAmount = new BigDecimal("0.00");
        acctDomainBo.setAccountAmount(initAmount);// 开户时默认金额为0
        acctDomainBo.setAvailableAmount(initAmount);
        acctDomainBo.setFreezingAmount(initAmount);
        acctDomainBo.setOpenDate(EgfDateUtils.getCurrentDate());
        acctDomainBo.setCreateTime(new Date());
        // 2. 调用领域开户服务
        ResponseResult<AccountDomainResBo> respAcctDomain = accountManageServiceDomain.openAccount( acctDomainBo);
        AccountDomainResBo acctDomainRes =respAcctDomain.getData();
        accountResBo.setAccountNo(acctDomainRes.getAccountNo());
        accountResBo.setAccountName(acctDomainRes.getAccountName());
        accountResBo.setAccountStatus(acctDomainRes.getAccountStatus());
        accountResBo.setAvailableBalance(acctDomainRes.getAvailableAmount());
        acctInfoResp.setBizErrorCode(respAcctDomain.getCode(),respAcctDomain.getInfo());
        return acctInfoResp;
    }

    @Override
    public ResponseResult<AccountTransferResBo> transferInAccount(AccountTransferReqBo acctTransReq) {

        //调用转账领域服务
        return null;
    }
}
