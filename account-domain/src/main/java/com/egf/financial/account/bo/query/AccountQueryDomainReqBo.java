package com.egf.financial.account.bo.query;

import lombok.Data;

import java.util.Date;

@Data
public class AccountQueryDomainReqBo {

    /**
     * 账户表主键
     */
    private Long   accountId;

    /**
     * 客户号
     */
    private Integer customerId;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 账号
     */
    private String accountNo;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 账户状态
     */
    private String accountStatus;

    /**
     * 开始日期
     */
    private Date  beginDate;

    /**
     * 结束日期
     */
    private Date endDate;
}
