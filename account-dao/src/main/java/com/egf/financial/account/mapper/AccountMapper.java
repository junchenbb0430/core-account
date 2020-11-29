package com.egf.financial.account.mapper;

import com.egf.financial.account.entity.AccountEntity;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(AccountEntity record);

    int insertSelective(AccountEntity record);

    AccountEntity selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(AccountEntity record);

    int updateByPrimaryKey(AccountEntity record);

}