package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cat")
@Data
public class CourseCatalog {
	
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
	
	
	
}
