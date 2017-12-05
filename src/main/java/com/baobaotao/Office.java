package com.baobaotao;

import org.springframework.stereotype.Component;

@Component
public class Office {
	private String officeNo = "001";
	
	@Override
	public String toString() {
		return "officeNo:" + officeNo;
	}
}
