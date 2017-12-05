package com.baobaotao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String[] locations = { "beans.xml" };
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(locations);
		Boss boss = (Boss) ctx.getBean("boss");
		System.out.println(boss);
		ctx.close();

	}
}
