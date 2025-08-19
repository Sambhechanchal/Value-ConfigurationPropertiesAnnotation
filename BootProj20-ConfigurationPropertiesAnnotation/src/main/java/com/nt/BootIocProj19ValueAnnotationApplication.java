package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.CourseDetails;

@SpringBootApplication
public class BootIocProj19ValueAnnotationApplication {

	public static void main(String[] args) {
		try(
				
				ConfigurableApplicationContext ctx =SpringApplication.run(BootIocProj19ValueAnnotationApplication.class, args);
				){
			// get spring bean class object ref
			
			CourseDetails catalog = ctx.getBean("catDetails" ,CourseDetails.class);
			System.out.println(catalog);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
