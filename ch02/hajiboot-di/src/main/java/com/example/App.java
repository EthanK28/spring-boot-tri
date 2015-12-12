package com.example;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.app.Calculator;

/**
 * Hello world!
 *
 */
@Configuration
@Import(AppConfig.class)
public class App 
{
    public static void main( String[] args )
    {
    	try (ConfigurableApplicationContext context = SpringApplication.run(App.class, args)){
    		
    		Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter 2 numbers like 'a b' : ");
    		int a = scanner.nextInt();
    		int b = scanner.nextInt();
    		
    		Calculator caculator = context.getBean(Calculator.class);
    		int result = caculator.calc(a, b);
    		System.out.println("result = " + result);
    		
    	}
        
    }

}
