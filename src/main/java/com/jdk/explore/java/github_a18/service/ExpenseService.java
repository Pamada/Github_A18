package com.jdk.explore.java.github_a18.service;

import com.jdk.explore.java.github_a18.model.Expense;
import com.jdk.explore.java.github_a18.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    public void save(BigDecimal amount) {
        Expense expense = new Expense();
        expense.setAmount(amount);
        expenseRepository.save(expense);
    }
}
