package com.example.springexample;

import org.springframework.stereotype.Component;
@Component("calculator")
public class CalculatorComponent implements Calculator{
    
    public CalculatorComponent() {
        System.out.println("CalculatorComponent: constructor called");
    }
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
