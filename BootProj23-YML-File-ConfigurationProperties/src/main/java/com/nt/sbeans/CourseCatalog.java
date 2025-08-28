package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cat")
@Data
@ConfigurationProperties(prefix = "org.nt")
public class CourseCatalog {
	
	
	private double cjFee;
	
	private double ajFee;
	
	private double spbmsFee;
	
	private double reactFee;
	
	private double devopsFee;
	
	private double awsFee;
	
	
	
}
