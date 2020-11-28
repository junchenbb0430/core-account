package com.egf.financial.account.service.impl;

import com.egf.financial.account.bo.AccountInfoBo;
import com.egf.financial.account.entity.AccountEntity;
import com.egf.financial.account.mapper.AccountMapper;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoManageServiceImpl implements IAccountInfoManageService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountInfoBo queryAccountDetailByAcctNo(String acctNo) {

        return null;
    }

    @Override
    public AccountInfoBo openAccount(AccountInfoBo acctInfo) {
        AccountEntity  accountEntity = new AccountEntity();
        BeanUtils.copyProperties(acctInfo,accountEntity);
        accountMapper.insert(accountEntity);
        return null;
    }

    @Override
    public void transferIn2Acconts(String debtAcctNo, String creditAcctNo, Double amount) {

    }
}
