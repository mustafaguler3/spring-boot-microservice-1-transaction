package com.example.demo.service;

import com.example.demo.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);
    void deleteTransaction(Long transactionId);
    List<Transaction> findAllTransactionsOfUser(Long userId);

}
