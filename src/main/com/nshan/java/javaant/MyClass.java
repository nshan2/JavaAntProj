package com.nshan.java.javaant;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MyClass {

	static Logger logger = Logger.getLogger(MyClass.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		System.out.println("Welcome!!");
		logger.info("Successfully configured Log4j in project");
	}

}
