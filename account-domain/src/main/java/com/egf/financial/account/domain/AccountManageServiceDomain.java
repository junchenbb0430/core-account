package com.egf.financial.account.domain;

import com.egf.financial.account.bo.AccountDomainReqBo;
import com.egf.financial.account.bo.AccountDomainResBo;
import com.egf.financial.account.resp.ResponseResult;

/**
 *开户，销户，冻结账户，解冻账户服务，账户信息查询功能
 */
public interface AccountManageServiceDomain {


    /**
     * 开户领域服务，开户成功后，返回开户的账户信息
     * @param acctDomainBo
     * @return
     */
    public ResponseResult<AccountDomainResBo> openAccount(AccountDomainReqBo acctDomainBo);

    /**
     * 激活新开立当前账户
     * @param acctDomainBo
     * @return
     */
    public ResponseResult<AccountDomainResBo> fireAccount(AccountDomainReqBo acctDomainBo);

    /**
     * 销户服务
     * @param acctDomainBo
     * @return
     */
    public ResponseResult<AccountDomainResBo> closeAccount(AccountDomainReqBo acctDomainBo);


}
