//CourseDetails.java
package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("catDetails")
@Data
@ConfigurationProperties(prefix="org.nt")
public class CourseDetails {

	//direct value
	@Value("Chanchal")
	private String username; 
	// value from application.properties files
	
	
	private double cjFee;
	
	private double ajFee;
	
	private double spbmsFee;

	private double reactFee;
	
	private double devopsFee;
	
	private double awsFee;
	
	private String[] favcolor;
	
	private List<String> friends;
	
	private Map<String , Object> details;
	
	private Set<Long> phones ;
	
	
//	@Autowired
	  @Value("#{cat}")
	private CourseCatalog course;
	
}
