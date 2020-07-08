package com.egf.finacial.account.web.transfer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/transfer")
public class AccountTransferController {
    private static final Logger logger  = LoggerFactory.getLogger(AccountTransferController.class);

    @RequestMapping("/inBank")
    public String  transferInBank(@RequestBody String transferReq){

        return null;
    }


    /**
     * 跨行转账请求
     * @param transferReq
     * @return
     */
    @RequestMapping("/crossBank")
    public String transferCrossBank(@RequestBody String transferReq){

        return  null;
    }
}
