package com.jdk.explore.java.github_a18.controller;

import com.jdk.explore.java.github_a18.service.ExpenseService;
import com.jdk.explore.java.github_a18.service.IncomeService;
import com.jdk.explore.java.github_a18.utils.Calculations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class SoldController {

    @Autowired
    private IncomeService incomeService;

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/sold")
    public String showSoldPage(Model model) {
        BigDecimal totalIncome = incomeService.findAll().stream()
                .map(income -> income.getAmount())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalExpense = expenseService.findAll().stream()
                .map(expense -> expense.getAmount())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal sold = Calculations.calculateSold(totalIncome, totalExpense);
        model.addAttribute("sold", sold);
        return "sold";
    }
}