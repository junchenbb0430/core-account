package com.egf.financial.account.bo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountDomainResBo {

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

    /**
     * 账户金额
     */
    private BigDecimal accountAmount;

    /**
     * 可用金额
     */
    private BigDecimal availableAmount;

    /**
     * 冻结金额
     */
    private BigDecimal freezingAmount;

    private BigDecimal withdrawAmount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 开户日期
     */
    private Date openDate;

    /**
     * 销户日期
     */
    private Date closeDate;

    /**
     * 创建时间
     */
    private Date createTime;


}
