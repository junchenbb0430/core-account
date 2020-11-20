package com.egf.finacial.account.web.openacct;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/acct")
@RestController
public class AccountOpenController {

    /**
     * 开户接口
     * @param openAcctInfo
     * @return
     */
    @RequestMapping(name = "/openAcct")
    public  String   openAcctNo(@RequestBody  String  openAcctInfo){

        return null;
    }

    /**
     * 冻结接口
     * @param acctNo
     * @return
     */
    @RequestMapping(name="/freeze",method = RequestMethod.POST)
    public  String  freezeAccountNo(@RequestBody String  acctNo){
        return null;
    }

    @RequestMapping(name="closeAcct" ,method = RequestMethod.POST)
    public String  closeAcctount(@RequestBody String acctNo){

        return null;
    }

}
