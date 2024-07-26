package com.rakesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String configlocation="/com/rakesh/resources/applicationContext.xml";
    	ApplicationContext context =new ClassPathXmlApplicationContext(configlocation);
    	
    	Student std=context.getBean(Student.class);
    	std.display();
    	
    }
}
