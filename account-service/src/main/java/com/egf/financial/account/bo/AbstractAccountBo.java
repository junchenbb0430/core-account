package com.egf.financial.account.bo;

import java.math.BigDecimal;

/**
 * 定义抽象的父类对象
 */
public abstract  class AbstractAccountBo {

    /**
     * 付款人账号
     */
    private String  payerAcctNo;

    /**
     * 付款人姓名
     */
    private String  payerAcctName;

    /**
     * 收款人账号
     */
    private String  payeeAcctNo;

    /**
     * 收款人姓名
     */
    private String  payeeAcctName;

    /**
     * 交易金额
     */
    private BigDecimal transAmount;

    /**
     * 账号
     */
    private  String  accountNo;

    private  String accountStatus;

    
}
