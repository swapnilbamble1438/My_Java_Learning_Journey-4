
package com.Aa10_Spring_expression_language;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Aa10_Spring_expression_language/config.xml");
		
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		System.out.println("--------------------------------------------------------");
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = (Expression) temp.parseExpression("22+44");
		
		System.out.println(expression.getValue());
		
	
	}
	
}
