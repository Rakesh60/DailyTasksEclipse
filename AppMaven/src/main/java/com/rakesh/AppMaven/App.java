package com.rakesh.AppMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.rakesh.context.ConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
            JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
            String query = "CREATE DATABASE adit_db";
            jT.update(query);
          
            System.out.println("Connected & created database");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
