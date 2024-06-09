package com.jdk.explore.java.github_a18.repository;
import com.jdk.explore.java.github_a18.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    }

