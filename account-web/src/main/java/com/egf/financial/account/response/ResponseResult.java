package com.egf.financial.account.response;

import lombok.Data;

/**
 * 定义通用的 数据返回对象报文
 * @param <T>
 */
@Data
public class ResponseResult<T>{

    private   String code;

    private String info;

    private  T  data;
}
