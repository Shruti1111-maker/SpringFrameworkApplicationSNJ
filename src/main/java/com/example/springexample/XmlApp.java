package com.example.springexample;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class XmlApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx =
                 new ClassPathXmlApplicationContext("beans.xml")) {
            Calculator calc = ctx.getBean("calculator", Calculator.class);
            System.out.println("XML-config: 2 + 3 = " + calc.add(2, 3));
        }
    }
}
