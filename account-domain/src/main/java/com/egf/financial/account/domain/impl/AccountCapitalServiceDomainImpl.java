package com.egf.financial.account.domain.impl;

import com.egf.financial.account.bo.AccountPayDomainReqBo;
import com.egf.financial.account.bo.AccountPayDomainResBo;
import com.egf.financial.account.bo.AccountTransferDomainReqBo;
import com.egf.financial.account.bo.AccountTransferDomainResBo;
import com.egf.financial.account.domain.AccountCapitalServiceDomain;
import org.springframework.stereotype.Service;

@Service
public class AccountCapitalServiceDomainImpl implements AccountCapitalServiceDomain {
    @Override
    public AccountTransferDomainResBo transferBetweenAccounts(AccountTransferDomainReqBo acctDomainReq) {
        return null;
    }

    @Override
    public AccountPayDomainResBo payAccount(AccountPayDomainReqBo acctPayDomainReq) {
        return null;
    }
}
