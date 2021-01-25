package com.egf.financial.account.domain;

import com.egf.financial.account.bo.query.AccountQueryDomainReqBo;
import com.egf.financial.account.bo.query.AccountQueryDomainResBo;
import com.egf.financial.account.resp.ResponseResult;

/**
 * 账户查询领域服务
 */
public interface AccountInfoQueryDomain {

    /**
     *
     * @param accountId
     * @return
     */
    ResponseResult<AccountQueryDomainResBo>  queryAccountOpenInfoByAcctId(Long  accountId);

    /**
     *
     * @param acctQueryReqBo
     * @return
     */
    ResponseResult<AccountQueryDomainResBo> queryAccountTransferInfoByAcctNoAndRangDate(AccountQueryDomainReqBo acctQueryReqBo);

    /**
     *
     * @param acctQueryReqBo
     * @return
     */
    ResponseResult<AccountQueryDomainResBo>  queryAccountFreezingInfoByAccount(AccountQueryDomainReqBo acctQueryReqBo);

    /**
     *
     * @param accountNo
     * @return
     */
    ResponseResult<AccountQueryDomainResBo>  queryAccountCloseInfoByAcctNo(String  accountNo);
}
