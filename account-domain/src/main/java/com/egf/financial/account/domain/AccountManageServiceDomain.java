package com.egf.financial.account.domain;

import com.egf.financial.account.bo.*;

/**
 *开户，销户，冻结账户，解冻账户服务，账户信息查询功能
 */
public interface AccountManageServiceDomain {


    /**
     * 开户领域服务，开户成功后，返回开户的账户信息
     * @param acctDomainBo
     * @return
     */
    public AccountDomainResBo openAccount(AccountDomainReqBo acctDomainBo);


}
