package com.egf.financial.account.test.web.manage;

import com.alibaba.fastjson.JSONObject;
import com.egf.financial.account.date.EgfDateUtils;
import com.egf.financial.account.enums.AccountTypeEnum;
import com.egf.financial.account.enums.ChannelIdEnum;
import com.egf.financial.account.enums.CurrencyTypeEnum;
import com.egf.financial.account.flow.SequenceFlowGenerator;
import com.egf.financial.account.test.AccountApplicationBaseTest;
import com.egf.financial.account.vo.openAccount.AccountOpenReq;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AccountManageControllerTest extends AccountApplicationBaseTest {

    private Logger logger  = LoggerFactory.getLogger(AccountManageControllerTest.class);

    private String  baseDir = "/coreAccount/acctManage";

    /**
     * 开户交易
     */
    @Test
    public  void  testOpenAcctNo(){
        try {
            for(int i=0;i<40;i++){

                String reqPath = "/acctManage/openAcct";
                String jsonData = JSONObject.toJSONString(this.createAccountOpenReq());
                System.out.println(jsonData);
                // jsonData = "{\"accountName\":\"张三\",\"accountType\":\"11\",\"channelDate\":\"20201206\",\"channelFlow\":\"0123451655787924\",\"channelId\":\"NETBANK\",\"currency\":\"CNY\",\"customerId\":\"0123456646142118\"}";

                    String respJson = this.postForRest(jsonData,reqPath);
                    logger.info("开户返回报文是:{}",respJson);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private AccountOpenReq createAccountOpenReq() {
        AccountOpenReq acctOpenReq = new AccountOpenReq();
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();

        String  randomStr = String.valueOf(randomDataGenerator.nextInt(10,1000));
        acctOpenReq.setAccountName("张三"+randomStr);
        acctOpenReq.setAccountType(AccountTypeEnum.ACCT_SETTLE_I.getAcctType());

        acctOpenReq.setCustomerId( SequenceFlowGenerator.generateCustomerId());//客户编号，唯一不变。
        acctOpenReq.setChannelDate(EgfDateUtils.formatCurrentDate());//渠道日期
        acctOpenReq.setTransFlow(SequenceFlowGenerator.generateFixedLengthDigitalFlow());//渠道流水
        acctOpenReq.setChannelId(ChannelIdEnum.CHANNEL_ID_NETBANK.getChannelId());//渠道标识
        acctOpenReq.setCurrency(CurrencyTypeEnum.CURRENCY_TYPE_CNY.getCurrency());//币种

        return acctOpenReq;
    }
    @Test
    public void testInteger(){
        Long aa = Long.valueOf("1234562095467854");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}
