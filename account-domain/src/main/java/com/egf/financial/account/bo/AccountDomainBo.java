package com.egf.financial.account.bo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountDomainBo {

    private Integer accountId;

    /**
     * 客户号
     */
    private String customerId;

    /**
     * 账号
     */
    private String accountNo;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 账户状态
     */
    private String accountStatus;

    /**
     * 渠道标志
     */
    private String channelId;

    /**
     * 业务流水号
     */
    private String transFlow;

    private BigDecimal accountAmount;

    private BigDecimal availableAmount;

    private BigDecimal freezingAmount;

    private BigDecimal withdrawAmount;

    private String currency;

    private Date openDate;

    private Date closeDate;

    private Date createTime;


}
