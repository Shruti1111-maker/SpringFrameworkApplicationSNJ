package com.example.springexample;

public class CalculatorImplJavaCfg implements Calculator{
    public CalculatorImplJavaCfg() {
        System.out.println("CalculatorImplJavaCfg: constructor called");
    }
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
