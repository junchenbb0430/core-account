package com.egf.financial.account.test.web.query;

import com.egf.financial.account.test.AccountApplicationBaseTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AccountInfoQueryController extends AccountApplicationBaseTest {

    @Test
    public void testQueryAcctDetail() throws Exception {
        Map<String,String> reqMap = new HashMap<String,String>();
        reqMap.put("accountNo","123213");
        this.plainPost(reqMap,"/query/acctDetail");
    }
}
