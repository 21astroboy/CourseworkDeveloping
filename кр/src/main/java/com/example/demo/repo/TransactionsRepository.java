package com.example.demo.repo;

import com.example.demo.Entity.Transactions;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transactions, Integer > {
}
