package com.egf.financial.account.test;

import com.egf.finacial.account.AccountApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;
/**
 * spring-boot-starter-test包含如下功能：
 * Junit4,Mockito,SpringTest,AssertJ,JsonPath,JSONassert
 * junit4需要添加@RunWith(SpringRunner.class)注解
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= AccountApplication.class)

public class AccountApplicationBaseTest {


    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;


    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    /**
     * 请求数据为json格式
     * @param data
     * @param path
     * @return
     * @throws Exception
     */
    public String postForRest(String data,String path) throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post(path);
        builder.content(data);
        MvcResult mvcResult = mvc.perform(builder.accept(MediaType.parseMediaType("application/json;charset=UTF-8"))
                                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        return result;
    }

    /**
     * 普通的请求格式
     * @param reqMap
     * @param path
     * @return
     * @throws Exception
     */
    public String plainPost(Map<String,String> reqMap,String path) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post(path);
        for(Map.Entry<String,String> entry:reqMap.entrySet()){
            builder.param(entry.getKey(), entry.getValue());
        }
        MvcResult mvcResult = mvc.perform(builder.accept("text/plain")
                .characterEncoding("UTF-8")).andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        return result;
    }
}

