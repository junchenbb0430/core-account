package com.egf.financial.account.bo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class AccountPayDomainReqBo {

    /**
     * 付款人账号
     */
    private  String  payerAcctNo;

    /**
     * 付款人姓名
     */
    private  String  payerAcctName;

    /**
     * 收款人账号
     */
    private String  payeeAcctNo;

    /**
     * 收款人姓名
     */
    private String  payeeAcctName;

    /**
     *交易金额
     */
    private BigDecimal  transAmount;
}
