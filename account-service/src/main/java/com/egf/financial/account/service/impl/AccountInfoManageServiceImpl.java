package com.egf.financial.account.service.impl;

import com.egf.financial.account.bo.AccounInfoReqBo;
import com.egf.financial.account.bo.AccountDomainReqBo;
import com.egf.financial.account.bo.AccountInfoResBo;
import com.egf.financial.account.domain.AccountManageServiceDomain;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoManageServiceImpl implements IAccountInfoManageService {

    @Autowired
    private AccountManageServiceDomain  accountManageServiceDomain;

    @Override
    public AccounInfoReqBo queryAccountDetailByAcctNo(String acctNo) {

        return null;
    }

    @Override
    public AccountInfoResBo openAccount(AccounInfoReqBo acctInfo) {
        AccountInfoResBo accountResBo = new AccountInfoResBo();
        //1. 调用开户领域服务
        AccountDomainReqBo acctDomainBo = new AccountDomainReqBo();
        BeanUtils.copyProperties(acctInfo,acctDomainBo);
        AccountDomainReqBo respAcctDomain = accountManageServiceDomain.openAccount( acctDomainBo);
        accountResBo.setAccountNo(respAcctDomain.getAccountNo());
        accountResBo.setAccountName(respAcctDomain.getAccountName());
        accountResBo.setAccountStatus(respAcctDomain.getAccountStatus());
        accountResBo.setAvailableBalance(respAcctDomain.getAvailableAmount());
        return accountResBo;
    }

    @Override
    public void transferInAccount(String debtAcctNo, String creditAcctNo, Double amount) {

    }
}
