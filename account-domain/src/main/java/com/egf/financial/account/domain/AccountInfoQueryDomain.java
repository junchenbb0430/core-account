package com.egf.financial.account.domain;

import com.egf.financial.account.bo.query.AccountQueryDomainReqBo;
import com.egf.financial.account.bo.query.AccountQueryDomainResBo;
import com.egf.financial.account.resp.ResponseResult;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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

    /**
     * 根据日期查询账户信息
     * @param beginDate
     * @param endDate
     * @return
     */
    ResponseResult<List<AccountQueryDomainResBo>>  queryAccountInfoByDate(LocalDateTime beginDate, LocalDateTime endDate);
}
