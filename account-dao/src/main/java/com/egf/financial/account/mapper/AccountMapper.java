package com.egf.financial.account.mapper;

import com.egf.financial.account.entity.AccountEntity;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(AccountEntity record);

    int insertSelective(AccountEntity record);

    AccountEntity selectByPrimaryKey(Integer accountId);

    int updateByPrimaryKeySelective(AccountEntity record);

    int updateByPrimaryKey(AccountEntity record);

    AccountEntity  selectEntityByCustomerIdAndAcctType(@Param("customerId")String customerId,
                                                       @Param("accountType")String accountType);
}