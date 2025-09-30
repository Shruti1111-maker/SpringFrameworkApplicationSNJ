package com.example.springexample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class JavaConfigApp {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =
                 new AnnotationConfigApplicationContext(AppConfigJava.class)) {
            Calculator calc = ctx.getBean(Calculator.class);
            System.out.println("Java-config: 7 + 8 = " + calc.add(7, 8));
        }
    }
}
