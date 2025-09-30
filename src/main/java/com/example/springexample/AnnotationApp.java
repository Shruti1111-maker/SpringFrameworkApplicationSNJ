package com.example.springexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =
                 new AnnotationConfigApplicationContext(AppConfigAnnotation.class)) {
            CalculatorUser user = ctx.getBean(CalculatorUser.class);
            user.doWork();
        }
    }
}
