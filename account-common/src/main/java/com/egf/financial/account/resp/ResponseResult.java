package com.egf.financial.account.resp;

import com.egf.financial.account.codes.BizErrorCodeEnum;
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

    public ResponseResult(){
        this.setBizErrorCode(BizErrorCodeEnum.RETURN_SUCCESS_CODE);
    }

    public ResponseResult(T data) {
        this.data = data;
        this.setBizErrorCode(BizErrorCodeEnum.RETURN_SUCCESS_CODE);
    }

    public void setBizErrorCode(BizErrorCodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.info = codeEnum.getInfo();
    }
}
