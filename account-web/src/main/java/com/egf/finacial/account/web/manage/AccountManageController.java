package com.egf.finacial.account.web.manage;

import com.egf.financial.account.bo.AccountInfoBo;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/acctManage")
@RestController
public class AccountManageController {

    @Autowired
    private IAccountInfoManageService acctManageService;

    /**
     * 开户接口
     *
     * @param openAcctInfo
     * @return
     */
    @RequestMapping(name = "/openAcct")
    public String openAcctNo(@RequestBody String openAcctInfo) {

        AccountInfoBo acctInfo = new AccountInfoBo();
        acctManageService.openAccount(acctInfo);
        return null;
    }

    /**
     * 强制冻结账户
     *
     * @param acctReq
     * @return
     */
    @RequestMapping("/forceFreeze")
    public String forceFreezeAccount(@RequestBody String acctReq) {
        return null;
    }

    /**
     * 账户解冻接口
     *
     * @param acctReq
     * @return
     */
    @RequestMapping("/unfreeze")
    public String unfreezeAccount(@RequestBody String acctReq) {
        return null;
    }

    @RequestMapping(value = "/acctDetail")
    public String queryAccountDetailInfo(@RequestBody String acctReq) {
        return null;
    }
}
