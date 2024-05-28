package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junit.calculater.Calculater;

@SpringBootApplication
public class CalculaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculaterApplication.class, args);
		
		
		Calculater calculater=new Calculater();
		
	int sum=	calculater.add(10, 20);
	int sub=	calculater.sub(20, 3);
	int multi=	calculater.multi(50, 2);
	int div= 	calculater.div(20, 2);
	
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(multi);
	System.out.println(div);
	}

}
