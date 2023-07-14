package com.example.h2example.repository;

import com.example.h2example.entity.RecentTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTransactionsRepository extends JpaRepository<RecentTransaction, Integer>, TransactionsRepository {

}
