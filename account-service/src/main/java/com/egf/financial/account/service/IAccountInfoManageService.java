package com.egf.financial.account.service;


import com.egf.financial.account.bo.AccounInfoReqBo;
import com.egf.financial.account.bo.AccountInfoResBo;
import com.egf.financial.account.bo.AccountTransferReqBo;
import com.egf.financial.account.bo.AccountTransferResBo;
import com.egf.financial.account.resp.ResponseResult;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 账户信息查询服务
 */
public interface IAccountInfoManageService {

    /**
     *
     * @param acctNo
     * @return
     */
    public ResponseResult<AccountInfoResBo> queryAccountDetailByAcctNo(String acctNo);

    /**
     *
     * @param acctInfo
     */
    public ResponseResult<AccountInfoResBo> openAccount(AccounInfoReqBo acctInfo);


    public ResponseResult<AccountTransferResBo> transferInAccount(AccountTransferReqBo acctTransReq);

    /**
     *
     * @param beginTime
     * @param endDateTime
     * @return
     */
    public   ResponseResult<List<AccountInfoResBo>> queryAccountInfoByDate(LocalDateTime beginTime,LocalDateTime endDateTime);
}
