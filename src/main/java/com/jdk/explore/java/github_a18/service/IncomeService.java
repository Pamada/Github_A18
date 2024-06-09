package com.jdk.explore.java.github_a18.service;
import com.jdk.explore.java.github_a18.model.Income;
import com.jdk.explore.java.github_a18.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> findAll() {
        return incomeRepository.findAll();
    }

    public void save(BigDecimal amount) {
        Income income = new Income();
        income.setAmount(amount);
        incomeRepository.save(income);
    }
}