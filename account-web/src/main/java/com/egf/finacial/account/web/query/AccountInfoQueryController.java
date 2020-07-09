package com.egf.finacial.account.web.query;

import com.egf.financial.account.service.IAccountInfoQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/query")
@RestController
public class AccountInfoQueryController {

    @Autowired
    private IAccountInfoQueryService accountInfoService;

    /**
     * 查询单个账户明细
     * @param acctReq
     * @return
     */
    @RequestMapping("/acctDetail")
    public String  queryAccountDetail(@RequestBody  String  acctReq){
        String   acctNo = null;
        accountInfoService.queryAccountDetailByAcctNo(acctNo);
        return null;
    }
}
