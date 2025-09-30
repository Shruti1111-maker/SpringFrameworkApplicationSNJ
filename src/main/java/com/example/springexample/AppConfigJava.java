package com.example.springexample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfigJava {
    @Bean
    public Calculator calculator() {
        return new CalculatorImplJavaCfg();
    }
}
