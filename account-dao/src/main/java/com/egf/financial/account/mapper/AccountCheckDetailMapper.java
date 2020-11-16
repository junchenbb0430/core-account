package com.egf.financial.account.mapper;

import com.egf.financial.account.entity.AccountCheckDetailEntity;

public interface AccountCheckDetailMapper {
    int deleteByPrimaryKey(Integer checkId);

    int insert(AccountCheckDetailEntity record);

    int insertSelective(AccountCheckDetailEntity record);

    AccountCheckDetailEntity selectByPrimaryKey(Integer checkId);

    int updateByPrimaryKeySelective(AccountCheckDetailEntity record);

    int updateByPrimaryKey(AccountCheckDetailEntity record);
}