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
public enum AccountStatusEnum {

    ACCT_STATUS_OPENED("10","开户"),
    ACCT_STATUS_NORMAL("11","正常"),
    ACCT_STATUS_FREEZE("12","冻结"),
    ACCT_STATUS_NOT_IN("13","禁止转入"),
    ACCT_STATUS_NOT_OUT("14","禁止转出"),
    ACCT_STATUS_NOT_INOUT("15","司法冻结"),
    ACCT_STATUS_CLOSED("16","销户");

    private String  acctStatus;

    private String  statusInfo;

    AccountStatusEnum(String acctStatus, String statusInfo) {
        this.acctStatus = acctStatus;
        this.statusInfo = statusInfo;
    }

    /**
     * 根据key获取value值
     * @param acctStatus
     * @return
     */
    public static  String  getAccountStatusInfo(String acctStatus){
        AccountStatusEnum[]  acctStatusEnums = AccountStatusEnum.values();
        for(AccountStatusEnum statusEnum:acctStatusEnums){
            if(statusEnum.getAcctStatus().equals(acctStatus)){
                return statusEnum.getStatusInfo();

            }
        }
        return null;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public String getStatusInfo() {
        return statusInfo;
    }
}
