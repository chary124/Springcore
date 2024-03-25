package com.springcore2;

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
    ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore2/web.xm1");
    Emp e = (Emp)context.getBean("emp");
    System.out.println(e.getName());
    System.out.println(e.getPhno());
    System.out.println(e.getAdd());
    System.out.println(e.getCourse());
     }
}
