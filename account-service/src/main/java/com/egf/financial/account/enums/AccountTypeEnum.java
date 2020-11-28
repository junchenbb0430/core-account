package com.egf.financial.account.enums;

/**
 * 账户类型枚举：
 * 1*代表人民币结算账户
 * 2*储蓄账户
 * 3*保证金账户
 * 4*信贷账户
 * 5*理财类账户
 */
public enum AccountTypeEnum {

    ACCT_SETTLE_I("11","一类活期结算户"),
    ACCT_SETTLE_II("12","二类结算户"),
    ACCT_SETTLE_III("13","三类结算户"),
    ACCT_DEPOSIT("21","个人储蓄账户"),
    ACCT_GUARANTEE("31","保证金账户"),
    ACCT_LOAN_HOUSE("41","住房贷款户"),
    ACCT_WEALTH_FUND("51","基金账户");


    private  String  acctType;

    private String   acctTypeInfo;

    AccountTypeEnum(String acctType, String acctTypeInfo) {
        this.acctType = acctType;
        this.acctTypeInfo = acctTypeInfo;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }
}
