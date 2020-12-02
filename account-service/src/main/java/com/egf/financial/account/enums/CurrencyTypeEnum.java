package com.egf.financial.account.enums;

public enum CurrencyTypeEnum {

    CURRENCY_TYPE_CNY("CNY","人民币"),
    CURRENCY_TYPE_USD("USD","美元"),
    CURRENCY_TYPE_EUR("EUR","欧元"),
    CURRENCY_TYPE_GBP("GBP","英镑"),
    CURRENCY_TYPE_JPY("JPY","日元"),
    CURRENCY_TYPE_AUD("AUD","澳大利元"),
    CURRENCY_TYPE_CAD("CAD","加拿大元");

    CurrencyTypeEnum(String currency, String currencyInfo) {
        this.currency = currency;
        this.currencyInfo = currencyInfo;
    }

    private  String currency;

    private String  currencyInfo;

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyInfo() {
        return currencyInfo;
    }
}
