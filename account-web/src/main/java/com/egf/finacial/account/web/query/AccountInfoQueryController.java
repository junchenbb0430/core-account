package com.egf.finacial.account.web.query;

import com.alibaba.fastjson.JSONObject;
import com.egf.finacial.account.vo.query.AccountQueryReq;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/query")
@RestController
public class AccountInfoQueryController {

    private Logger logger = LoggerFactory.getLogger(AccountInfoQueryController.class);

    @Autowired
    private IAccountInfoManageService accountInfoService;

    /**
     * 查询单个账户明细
     * @param acctReq
     * @return
     */
    @RequestMapping("/acctDetail")
    public String  queryAccountDetail(AccountQueryReq acctReq){
        logger.info("根据账号:{}查询账户明细", JSONObject.toJSONString(acctReq));
        accountInfoService.queryAccountDetailByAcctNo(acctReq.getAccountNo());
        return null;
    }
}
