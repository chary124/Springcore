package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     ApplicationContext context = new ClassPathXmlApplicationContext("web1.xml");
     Student std1 = (Student)context.getBean("student1");
     Student std2 = (Student)context.getBean("student2");
		System.out.println(std1);
		System.out.println(std2);

     
        
    }
}
