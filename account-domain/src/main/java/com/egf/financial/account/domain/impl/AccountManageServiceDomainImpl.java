package com.egf.financial.account.domain.impl;

import com.alibaba.fastjson.JSON;
import com.egf.financial.account.bo.AccountDomainBo;
import com.egf.financial.account.domain.AccountManageServiceDomain;
import com.egf.financial.account.entity.AccountEntity;
import com.egf.financial.account.mapper.AccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountManageServiceDomainImpl implements AccountManageServiceDomain {

    private Logger logger = LoggerFactory.getLogger(AccountManageServiceDomainImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountDomainBo openAccount(AccountDomainBo acctDomainBo) {

        logger.info("开户请求信息为:{}",JSON.toJSONString(acctDomainBo));

        AccountDomainBo accountDomain = new AccountDomainBo();
        // 1. 调用开户服务
        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(acctDomainBo,accountEntity);
        int  accountId = accountMapper.insert(accountEntity);
        // 2. 查询开户信息
        AccountEntity accountEntityResult = accountMapper.selectByPrimaryKey(accountId);
        accountDomain.setAccountId(accountEntityResult.getAccountId());
        accountDomain.setAccountName(accountEntityResult.getAccountName());
        accountDomain.setAccountType(accountEntityResult.getAccountType());
        accountDomain.setAccountStatus(accountEntityResult.getAccountStatus());
        accountDomain.setChannelId(accountEntityResult.getChannelId());
        // 应答结果
        logger.info("客户号{}开户成功!",accountEntityResult.getAccountNo());
        return accountDomain;
    }
}
