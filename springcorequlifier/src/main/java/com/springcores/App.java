package com.springcores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
       TestEmp emp= (TestEmp)context.getBean("emp");
             System.out.println(emp);
    }
}
