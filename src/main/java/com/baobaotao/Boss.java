package com.baobaotao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("boss")
public class Boss {
	@Autowired
	private Car car;
	@Autowired
	private Office office;
    @PostConstruct
    public void postConstruct1(){
        System.out.println("postConstruct1");
    }

    @PreDestroy
    public void preDestroy1(){
        System.out.println("preDestroy1"); 
    }
	@Override
	public String toString() {
		return "car:" + car + "\n" + "office:" + office;
	}
}
