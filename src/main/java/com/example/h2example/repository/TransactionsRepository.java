package com.example.h2example.repository;

import com.example.h2example.entity.RecentTransaction;

import java.util.List;

public interface TransactionsRepository {
    List<RecentTransaction> findAll();
}
