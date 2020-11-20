package com.egf.financial.account.service.impl;

import com.egf.financial.account.bo.AccountInfoBo;
import com.egf.financial.account.service.IAccountInfoQueryService;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoQueryServiceImpl implements IAccountInfoQueryService {

    @Override
    public AccountInfoBo queryAccountDetailByAcctNo(String acctNo) {

        return null;
    }

    @Override
    public void openAccount(AccountInfoBo acctInfo) {

    }

    @Override
    public void transferIn2Acconts(String debtAcctNo, String creditAcctNo, Double amount) {

    }
}
