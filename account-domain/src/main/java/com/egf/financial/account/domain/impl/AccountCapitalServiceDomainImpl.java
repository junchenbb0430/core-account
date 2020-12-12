package com.egf.financial.account.domain.impl;

import com.egf.financial.account.bo.AccountPayDomainReqBo;
import com.egf.financial.account.bo.AccountPayDomainResBo;
import com.egf.financial.account.bo.AccountTransferDomainReqBo;
import com.egf.financial.account.bo.AccountTransferDomainResBo;
import com.egf.financial.account.domain.AccountCapitalServiceDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class AccountCapitalServiceDomainImpl implements AccountCapitalServiceDomain {

    private Logger logger = LoggerFactory.getLogger(AccountCapitalServiceDomainImpl.class);
    @Override
    public AccountTransferDomainResBo transferBetweenAccounts(AccountTransferDomainReqBo acctDomainReq) {
        // 1. 校验付款账户账号和姓名，金额大小

        // 2.校验收款账号，姓名，金额大小

        // 3.获取事务，执行转账操作
        return null;
    }

    @Override
    public AccountPayDomainResBo payAccount(AccountPayDomainReqBo acctPayDomainReq) {
        return null;
    }

    @Override
    public void refundFromAccount() {

    }

    @Override
    public void reverseOfAccount() {

    }
}
