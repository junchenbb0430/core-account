package com.egf.financial.account.enums;

public enum ChannelIdEnum {

    CHANNEL_ID_NETBANK("NETBANK","网银"),
    CHANNEL_ID_PHONE("PHONEBANK","手机银行"),
    CHANNEL_ID_COUNTER("COUNTER","柜面");

    private String channelId;

    private String  channelIdInfo;

    ChannelIdEnum(String channelId, String channelIdInfo) {
        this.channelId = channelId;
        this.channelIdInfo = channelIdInfo;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getChannelIdInfo() {
        return channelIdInfo;
    }
}
