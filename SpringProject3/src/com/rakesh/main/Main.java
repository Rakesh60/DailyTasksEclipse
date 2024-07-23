package com.rakesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.beans.Employee;
//import com.rakesh.context.configFile;

public class Main {

	public static void main(String[] args) {
	String path="/com/rakesh/context/applicationContext.xml";
	
	ApplicationContext cxt=new ClassPathXmlApplicationContext(path);
	Employee e1=(Employee) cxt.getBean("emp1");
	e1.interview();
//	}

//	ApplicationContext cxt2=new AnnotationConfigApplicationContext(configFile.class);
//	Employee e1=(Employee) cxt2.getBean("emp1");
//	e1.interview();
		
		
		
		
	}
}
