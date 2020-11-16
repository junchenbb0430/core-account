package com.egf.financial.account.mapper;

import com.egf.financial.account.entity.AccountDetailFlowEntity;

public interface AccountDetailFlowMapper {
    int deleteByPrimaryKey(Integer accountDetailId);

    int insert(AccountDetailFlowEntity record);

    int insertSelective(AccountDetailFlowEntity record);

    AccountDetailFlowEntity selectByPrimaryKey(Integer accountDetailId);

    int updateByPrimaryKeySelective(AccountDetailFlowEntity record);

    int updateByPrimaryKey(AccountDetailFlowEntity record);
}