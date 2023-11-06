
package com.Aa10iii_Boolean_type_with_spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Aa10iii_Boolean_type_with_spel/config.xml");
		
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		
	
	}
	
}
