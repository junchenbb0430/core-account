package com.egf.financial.account.bo;

import java.math.BigDecimal;

public class AccountPayDomainBo {

    private  String  payerAcctNo;

    private  String  payerAcctName;

    private String  payeeAcctNo;

    private String  payeeAcctName;

    /**
     *交易金额
     */
    private BigDecimal  transAmount;
}
