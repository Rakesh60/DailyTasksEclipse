package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Studentsc;

@Configuration
public class ConfigFile {
	@Bean
	public Studentsc patna() {
		Studentsc s1=new Studentsc();
		s1.setName("Rakesh");
		s1.setAge(30);
		s1.setMail("kumar@gmail.com");;
		return s1;
		
	}
	
}
