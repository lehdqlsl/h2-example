package com.example.h2example.repository;

import com.example.h2example.entity.RecentTransaction;
import com.example.h2example.repository.mapper.TransactionsMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisTransactionsRepository implements TransactionsRepository {
    private final TransactionsMapper transactionsMapper;

    public MybatisTransactionsRepository(TransactionsMapper transactionsMapper) {
        this.transactionsMapper = transactionsMapper;
    }

    @Override
    public List<RecentTransaction> findAll() {
        return transactionsMapper.findAll();
    }
}
