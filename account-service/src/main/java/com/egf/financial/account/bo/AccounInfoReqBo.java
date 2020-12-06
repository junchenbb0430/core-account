package com.egf.financial.account.bo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccounInfoReqBo {

    /**
     *账号
     */
    private   String  accountNo;

    /**
     * 账户姓名
     */
    private    String  accountName;

    /**
     * 账户状态
     */
    private   String accountStatus;

    /**
     * 账户类型
     */
    private   String  accountType;

    /***
     * 客户号
     */
    private   String  customerId;

    /**
     * 可用余额
     */
    private BigDecimal  availableBalance;

    /**
     * 账户金额
     */
    private  BigDecimal  accountAmount;

    /**
     * 冻结金额
     */
    private   BigDecimal  freezeAmount;
}
