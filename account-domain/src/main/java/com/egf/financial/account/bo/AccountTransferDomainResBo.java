package com.egf.financial.account.bo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class AccountTransferDomainResBo {
    /**
     * 付款人账号
     */
    private   String  payerAcctNo;

    /**
     * 付款人姓名
     */
    private String  payerAcctName;

    /**
     * 渠道标识
     */
    private   String  channelId;

    /**
     * 交易日期
     */
    private Date transDate;

    /**
     * 渠道流水
     */
    private  String  channelFlow;

    /**
     * 收款人账号
     */
    private  String  payeeAcctNo;

    /**
     * 收款人姓名
     */
    private   String  payeeAcctName;

    /**
     * 交易金额
     */
    private BigDecimal transAmount;

    /**
     * 交易成功流水
     */
    private   String  transFlow;

    /**
     * 交易状态
     */
    private   String  transStatus;

}
