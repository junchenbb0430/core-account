package com.egf.financial.account.service.impl;

import com.egf.financial.account.bo.AccountDomainBo;
import com.egf.financial.account.bo.AccountInfoBo;
import com.egf.financial.account.domain.AccountManageServiceDomain;
import com.egf.financial.account.entity.AccountEntity;
import com.egf.financial.account.mapper.AccountMapper;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoManageServiceImpl implements IAccountInfoManageService {


    private AccountManageServiceDomain  accountManageServiceDomain;

    @Override
    public AccountInfoBo queryAccountDetailByAcctNo(String acctNo) {

        return null;
    }

    @Override
    public AccountInfoBo openAccount(AccountInfoBo acctInfo) {
        //1. 调用开户领域服务
        AccountDomainBo acctDomainBo = new AccountDomainBo();
        accountManageServiceDomain.openAccount( acctDomainBo);


        return null;
    }

    @Override
    public void transferInAccount(String debtAcctNo, String creditAcctNo, Double amount) {

    }
}
