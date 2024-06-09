package com.jdk.explore.java.github_a18.utils;



import java.math.BigDecimal;

public class Calculations {
    public static BigDecimal calculateSold(BigDecimal income, BigDecimal expense) {
        return income.subtract(expense);
    }
}