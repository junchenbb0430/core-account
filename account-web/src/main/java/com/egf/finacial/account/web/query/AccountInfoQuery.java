package com.egf.finacial.account.web.query;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/query")
@RestController
public class AccountInfoQuery {

    /**
     * 查询单个账户明细
     * @param acctReq
     * @return
     */
    @RequestMapping("/acctDetail")
    public String  queryAccountDetail(@RequestBody  String  acctReq){
        return null;
    }
}
