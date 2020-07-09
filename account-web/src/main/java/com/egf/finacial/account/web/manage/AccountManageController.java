package com.egf.finacial.account.web.manage;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/acctManage")
@RestController
public class AccountManageController {

    /**
     * 强制冻结账户
     * @param acctReq
     * @return
     */
    @RequestMapping("/forceFreeze")
    public  String  forceFreezeAccount(@RequestBody String acctReq){
        return  null;
    }

    @RequestMapping("/unfreeze")
    public String  unfreezeAccount(@RequestBody String acctReq){
        return null;
    }
}
