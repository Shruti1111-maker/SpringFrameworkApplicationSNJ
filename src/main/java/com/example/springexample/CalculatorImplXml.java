package com.example.springexample;

public class CalculatorImplXml implements Calculator {
    public CalculatorImplXml() {
        System.out.println("CalculatorImplXml: constructor called");
    }
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
