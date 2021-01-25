package com.egf.financial.account.bo.transfer;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class AccountTransferDomainReqBo {
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
     * 交易流水
     */
    private  String  transFlow;

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
}
