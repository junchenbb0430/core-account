package com.egf.financial.account.service;


import com.egf.financial.account.bo.AccountInfoBo;

/**
 * 账户信息查询服务
 */
public interface IAccountInfoQueryService {

    public AccountInfoBo queryAccountDetailByAcctNo(String acctNo);
}
