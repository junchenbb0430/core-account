package com.egf.financial.account.mapper;

import com.egf.financial.account.entity.AccountEntity;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(AccountEntity record);

    int insertSelective(AccountEntity record);

    AccountEntity selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(AccountEntity record);

    int updateByPrimaryKey(AccountEntity record);

    AccountEntity  selectEntityByCustomerIdAndAcctType(@Param("customerId")Integer customerId,
                                                       @Param("accountType")String accountType);

    List<AccountEntity> queryAccountInfoByDate(@Param("beginDate") LocalDateTime beginDate,
                                               @Param("endDate") LocalDateTime endDate);
}