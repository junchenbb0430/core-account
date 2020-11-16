package com.egf.financial.account.mapper;

import com.egf.financial.account.entity.AccountDetailFreezingEntity;

public interface AccountDetailFreezingMapper {
    int deleteByPrimaryKey(String freezingId);

    int insert(AccountDetailFreezingEntity record);

    int insertSelective(AccountDetailFreezingEntity record);

    AccountDetailFreezingEntity selectByPrimaryKey(String freezingId);

    int updateByPrimaryKeySelective(AccountDetailFreezingEntity record);

    int updateByPrimaryKey(AccountDetailFreezingEntity record);
}