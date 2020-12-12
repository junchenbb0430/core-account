package com.egf.financial.account.domain;

import com.egf.financial.account.bo.AccountPayDomainReqBo;
import com.egf.financial.account.bo.AccountPayDomainResBo;
import com.egf.financial.account.bo.AccountTransferDomainReqBo;
import com.egf.financial.account.bo.AccountTransferDomainResBo;

/**
 * 转账，付款，退款，冲正，冻结余额，解冻余额服务
 */
public interface AccountCapitalServiceDomain {

    /**
     * 转账服务
     * @param acctDomainReq
     * @return
     */
    public AccountTransferDomainResBo transferBetweenAccounts(AccountTransferDomainReqBo acctDomainReq);


    /**
     * 付款服务
     * @param acctPayDomainReq
     * @return
     */
    public AccountPayDomainResBo payAccount(AccountPayDomainReqBo acctPayDomainReq);

    public  void  refundFromAccount();

    public  void  reverseOfAccount();
}
