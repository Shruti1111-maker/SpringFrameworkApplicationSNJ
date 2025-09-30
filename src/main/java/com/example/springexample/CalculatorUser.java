package com.example.springexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CalculatorUser {
    private final Calculator calculator;

    @Autowired
    public CalculatorUser(Calculator calculator) {
        this.calculator = calculator;
    }

    public void doWork() {
        System.out.println("Annotation-config via component-scan: 10 + 20 = " + calculator.add(10, 20));
    }
}
