package com.egf.finacial.account.vo.openAccount;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AccountOpenReq {

    /**
     * 渠道标志
     */
    @NotBlank
    private   String  channelId;

    /**
     * 渠道流水
     */
    @NotBlank
    private  String   channelFlow;

    /**
     * 渠道日期
     */
    @NotBlank
    private   String  channelDate;

    /**
     * 客户号
     */
    @NotBlank
    private   String customerId;

    /**
     * 开户姓名
     */
    @NotBlank
    private   String   accountName;

    /**
     * 账户类型
     */
    @NotBlank
    private   String   accountType;

    /**
     * 币种
     */
    @NotBlank
    private   String  currency;

    /**
     * 业务流水
     */
    private   String transFlow;
}
