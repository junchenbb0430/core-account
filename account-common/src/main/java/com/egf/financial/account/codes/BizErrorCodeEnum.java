package com.egf.financial.account.codes;

/**
 * 统一定义错误码
 */
public enum BizErrorCodeEnum {

    RETURN_SUCCESS_CODE("200","SUCCESS"),
    DOMAIN_ACCT_IS_EXIST("300000","该类型账户已经存在"),
    DOMAIN_PAYER_ACCT_AMOUNT("300001","付款方余额不足"),
    DOMAIN_PAYEE_ACCT_AMOUNT("300002","收款方余额不足");

    private String code;

    private String info;

    BizErrorCodeEnum(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
