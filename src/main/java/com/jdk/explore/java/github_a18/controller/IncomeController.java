package com.jdk.explore.java.github_a18.controller;
import com.jdk.explore.java.github_a18.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @GetMapping("/income")
    public String showIncomePage(Model model) {
        model.addAttribute("incomes", incomeService.findAll());
        return "income";
    }

    @PostMapping("/income")
    public String addIncome(@RequestParam("amount") BigDecimal amount) {
        incomeService.save(amount);
        return "redirect:/income";
    }
}