
package com.Aa10ii_invoke_static_method_n_variables_n_creating_object;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Aa10ii_invoke_static_method_n_variables_n_creating_object/config.xml");
		
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		
	
	}
	
}
