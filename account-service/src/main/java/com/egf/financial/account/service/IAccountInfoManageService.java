package com.egf.financial.account.service;


import com.egf.financial.account.bo.AccounInfoReqBo;
import com.egf.financial.account.bo.AccountInfoResBo;
import com.egf.financial.account.bo.AccountTransferReqBo;
import com.egf.financial.account.bo.AccountTransferResBo;

/**
 * 账户信息查询服务
 */
public interface IAccountInfoManageService {

    /**
     *
     * @param acctNo
     * @return
     */
    public AccounInfoReqBo queryAccountDetailByAcctNo(String acctNo);

    /**
     *
     * @param acctInfo
     */
    public AccountInfoResBo openAccount(AccounInfoReqBo acctInfo);

    /**
     *
     * @param debtAcctNo
     * @param creditAcctNo
     * @param amount
     */
    public AccountTransferResBo transferInAccount(AccountTransferReqBo acctTransReq);
}
