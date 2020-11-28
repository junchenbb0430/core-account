package com.egf.financial.account.service;


import com.egf.financial.account.bo.AccountInfoBo;

/**
 * 账户信息查询服务
 */
public interface IAccountInfoManageService {

    /**
     *
     * @param acctNo
     * @return
     */
    public AccountInfoBo queryAccountDetailByAcctNo(String acctNo);

    /**
     *
     * @param acctInfo
     */
    public  AccountInfoBo  openAccount(AccountInfoBo acctInfo);

    /**
     *
     * @param debtAcctNo
     * @param creditAcctNo
     * @param amount
     */
    public  void  transferIn2Acconts(String debtAcctNo,String creditAcctNo,Double  amount);
}
