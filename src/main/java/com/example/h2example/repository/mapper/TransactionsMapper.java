package com.example.h2example.repository.mapper;

import com.example.h2example.entity.RecentTransaction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TransactionsMapper {
    @Select("SELECT * FROM RecentTransactions")
    List<RecentTransaction> findAll();
}
