package com.egf.financial.account.domain;

import com.egf.financial.account.bo.AccountDomainReqBo;
import com.egf.financial.account.bo.AccountDomainResBo;

/**
 *
 */
public interface AccountManageServiceDomain {


    /**
     * 开户领域服务，开户成功后，返回开户的账户信息
     * @param acctDomainBo
     * @return
     */
    public AccountDomainResBo openAccount(AccountDomainReqBo acctDomainBo);


}
