package com.egf.financial.account.enums;

/**
 *10-开户
 * 11-正常
 * 12-冻结
 * 13-禁止转入
 * 14-禁止转出
 * 15-司法冻结
 * 16-销户
 */
public enum AccountStatus {

    ACCT_STATUS_OPENED("10","开户"),
    ACCT_STATUS_NORMAL("11","正常"),
    ACCT_STATUS_FREEZE("12","冻结"),
    ACCT_STATUS_NOT_IN("13","禁止转入"),
    ACCT_STATUS_NOT_OUT("14","禁止转出"),
    ACCT_STATUS_NOT_INOUT("15","司法冻结"),
    ACCT_STATUS_CLOSED("16","销户");

    private String  acctStatus;

    private String  statusInfo;

    AccountStatus(String acctStatus, String statusInfo) {
        this.acctStatus = acctStatus;
        this.statusInfo = statusInfo;
    }
}
