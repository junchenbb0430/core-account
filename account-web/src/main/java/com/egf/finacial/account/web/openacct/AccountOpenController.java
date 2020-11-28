package com.egf.finacial.account.web.openacct;

import com.egf.financial.account.bo.AccountInfoBo;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/acct")
@RestController
public class AccountOpenController {

    @Autowired
    private IAccountInfoManageService  acctManageService;

    /**
     * 开户接口
     * @param openAcctInfo
     * @return
     */
    @RequestMapping(name = "/openAcct")
    public  String   openAcctNo(@RequestBody  String  openAcctInfo){

        AccountInfoBo acctInfo = new AccountInfoBo();
        acctManageService.openAccount(acctInfo);
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
