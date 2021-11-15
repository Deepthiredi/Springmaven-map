package com.testyanthra.map_type;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/testyanthra/map_type/config.xml");
		Country c1=(Country) context.getBean("country");
		System.out.println(c1);
		
		Map<String,String> c2=c1.getStateandlanguage();
		System.out.println(c2);
	}

}
