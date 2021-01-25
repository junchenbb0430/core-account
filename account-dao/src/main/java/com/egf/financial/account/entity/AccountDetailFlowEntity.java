package com.egf.financial.account.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDetailFlowEntity {
    private Integer accountDetailId;

    private Integer customerId;

    private String accountNo;

    private String accountName;

    private String accountType;

    private String channelId;

    private String transFlow;

    private String bizType;

    private Date transDate;

    private String transType;

    private BigDecimal accountAmount;

    private String currency;

    private String oppositeAccountNo;

    private String oppositeAccountName;

    private Date transTime;

    private String transStatus;

    private Date createTime;

    private Date updateTime;

    public Integer getAccountDetailId() {
        return accountDetailId;
    }

    public void setAccountDetailId(Integer accountDetailId) {
        this.accountDetailId = accountDetailId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getTransFlow() {
        return transFlow;
    }

    public void setTransFlow(String transFlow) {
        this.transFlow = transFlow == null ? null : transFlow.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getOppositeAccountNo() {
        return oppositeAccountNo;
    }

    public void setOppositeAccountNo(String oppositeAccountNo) {
        this.oppositeAccountNo = oppositeAccountNo == null ? null : oppositeAccountNo.trim();
    }

    public String getOppositeAccountName() {
        return oppositeAccountName;
    }

    public void setOppositeAccountName(String oppositeAccountName) {
        this.oppositeAccountName = oppositeAccountName == null ? null : oppositeAccountName.trim();
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}