package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Company {
	
	private Integer id;
	private String name;
	private String addrs;
	private int size;

}

