package com.example.h2example.repository;

import com.example.h2example.entity.RecentTransaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTransactionsRepository implements TransactionsRepository {
    private final JdbcTemplate jdbcTemplate;

    public JdbcTransactionsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<RecentTransaction> findAll() {
        String sql = "select * from RecentTransactions";
        return jdbcTemplate.query(sql,(rs, rowNum) -> new RecentTransaction(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getDouble(6)
        ));
    }
}
