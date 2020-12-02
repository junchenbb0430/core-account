package com.egf.financial.account.test.web.manage;

import com.alibaba.fastjson.JSONObject;
import com.egf.finacial.account.vo.openAccount.AccountOpenReq;
import com.egf.financial.account.enums.AccountTypeEnum;
import com.egf.financial.account.enums.ChannelIdEnum;
import com.egf.financial.account.enums.CurrencyTypeEnum;
import com.egf.financial.account.flow.SequenceFlowGenerator;
import com.egf.financial.account.test.AccountApplicationBaseTest;
import org.junit.Test;

public class AccountManageControllerTest extends AccountApplicationBaseTest {

    private String  baseDir = "/acctManage";

    @Test
    public  void  testOpenAcctNo(){

        String reqPath = baseDir+"/openAcct";
        String jsonData = JSONObject.toJSONString(this.createAccountOpenReq());
        try {
            String respJson = this.postForRest(jsonData,reqPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private AccountOpenReq createAccountOpenReq() {
        AccountOpenReq acctOpenReq = new AccountOpenReq();
        acctOpenReq.setAccountName("张三");
        acctOpenReq.setAccountType(AccountTypeEnum.ACCT_SETTLE_I.getAcctType());

        acctOpenReq.setCustomerId( SequenceFlowGenerator.generateCustomerId());//客户编号，唯一不变。
        //acctOpenReq.setChannelDate();//渠道日期
        acctOpenReq.setChannelFlow(SequenceFlowGenerator.generateFixedLengthDigitalFlow());//渠道流水
        acctOpenReq.setChannelId(ChannelIdEnum.CHANNEL_ID_NETBANK.getChannelId());//渠道标识
        acctOpenReq.setCurrency(CurrencyTypeEnum.CURRENCY_TYPE_CNY.getCurrency());//币种
        return acctOpenReq;
    }
}
