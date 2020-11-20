package com.egf.finacial.account.response;

import lombok.Data;

/**
 * 定义通用的 数据返回对象报文
 * @param <T>
 */
@Data
public class ReponseResult <T>{

    private   String code;

    private String info;

    private  T  data;
}
