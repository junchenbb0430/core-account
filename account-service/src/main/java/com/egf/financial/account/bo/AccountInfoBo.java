package com.egf.financial.account.bo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountInfoBo {

    /**
     *
     */
    private   String  acctNo;

    private    String  acctName;

    private   String acctStatus;

    private   String  acctType;

    private BigDecimal  acctBalance;

    private  BigDecimal  totalAmount;

    private   BigDecimal  freezeAmount;
}
