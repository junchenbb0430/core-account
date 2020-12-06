package com.egf.financial.account.web.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/typeManage")
@RestController
public class AccountTypeManageController {

    private static final Logger logger = LoggerFactory.getLogger(AccountTypeManageController.class);

    public String addAccountType(@RequestBody String acctTypeReq) {
        return null;
    }

    public String modifyAccountType(@RequestBody String acctTypeReq) {
        return null;
    }
}
