package com.egf.financial.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author
 * @create 2020-06-23 11:53
 * 需要配置profile，才能执行
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.egf.financial.account"})
@MapperScan(basePackages="com.egf.financial.account.mapper")
@EnableTransactionManagement
public class AccountApplication {

    public static void main(String[] args){

        SpringApplication.run(AccountApplication.class,args);
        System.out.println("dadfadfd");
    }

}

