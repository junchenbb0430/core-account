package com.egf.financial.account.domain.impl;

import com.egf.financial.account.bo.query.AccountQueryDomainReqBo;
import com.egf.financial.account.bo.query.AccountQueryDomainResBo;
import com.egf.financial.account.domain.AccountInfoQueryDomain;
import com.egf.financial.account.resp.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoQueryDomainImpl implements AccountInfoQueryDomain {

    private  final Logger logger = LoggerFactory.getLogger(AccountInfoQueryDomainImpl.class);

    @Override
    public ResponseResult<AccountQueryDomainResBo> queryAccountOpenInfoByAcctId(Long accountId) {
        return null;
    }

    @Override
    public ResponseResult<AccountQueryDomainResBo> queryAccountTransferInfoByAcctNoAndRangDate(AccountQueryDomainReqBo acctQueryReqBo) {
        return null;
    }

    @Override
    public ResponseResult<AccountQueryDomainResBo> queryAccountFreezingInfoByAccount(AccountQueryDomainReqBo acctQueryReqBo) {
        return null;
    }

    @Override
    public ResponseResult<AccountQueryDomainResBo> queryAccountCloseInfoByAcctNo(String accountNo) {
        return null;
    }
}
