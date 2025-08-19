//CourseDetails.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("catDetails")
@Data
public class CourseDetails {

	//direct value
	@Value("chanchal")
	private String username; 
	// value from application.properties files
	
	@Value("${cjFee}")
	private double cjFee;
	@Value("${ajFee}")
	private double ajFee;
	@Value("${spbmsFee}")
	private double spbmsFee;
	@Value("${reactFee}")
	private double reactFee;
	@Value("${devopsFee}")
	private double devopsFee;
	@Value("${awsFee}")
	private double awsFee;
	
	//system property value
	
	@Value("${os.name}")
	private String os_name;
	@Value("${user.name}")
	private String user;
	
	//environment variable
	
	@Value("${Path}")
	private String path;
	
	// spel expression using @Value annotation
	
	
	  @Value("#{${cjFee} + ${ajFee} + ${spbmsFee} + ${reactFee} + ${devopsFee} + ${awsFee}}") 
	  private double total;
	 
	
	  // cannot be calculated on the current spring bean class
//	@Value("#{this.total- this.total*0.2}")
//	private double discount;
//	
//	@Autowired
	  @Value("#{cat}")
	private CourseCatalog course;
	
}
