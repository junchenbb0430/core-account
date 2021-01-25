package com.egf.financial.account.web.manage;

import com.alibaba.fastjson.JSONObject;
import com.egf.financial.account.bo.AccountInfoResBo;
import com.egf.financial.account.resp.ResponseResult;
import com.egf.financial.account.vo.openAccount.AccountOpenReq;
import com.egf.financial.account.bo.AccounInfoReqBo;
import com.egf.financial.account.service.IAccountInfoManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/acctManage")
@RestController
public class AccountManageController {

    private Logger logger = LoggerFactory.getLogger(AccountManageController.class);
    @Autowired
    private IAccountInfoManageService acctManageService;

    /**
     * 开户接口
     *
     * @param openAcctInfo
     * @return
     */
    @RequestMapping(path = "/openAcct",method = RequestMethod.POST)
    public String openAcctNo(@RequestBody String openAcctInfo) {
        logger.info("账户开户请求报文是{}",openAcctInfo);
        // 解析报文对象
        AccountOpenReq accountOpenReq = JSONObject.parseObject(openAcctInfo, AccountOpenReq.class);
        AccounInfoReqBo acctInfo = new AccounInfoReqBo();
        BeanUtils.copyProperties(accountOpenReq,acctInfo);
        acctInfo.setCustomerId(Integer.valueOf(accountOpenReq.getCustomerId()));
        ResponseResult<AccountInfoResBo> accountInfoResp =  acctManageService.openAccount(acctInfo);

        return JSONObject.toJSONString(accountInfoResp);
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
