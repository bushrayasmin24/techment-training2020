package com.techment.log4j;

import java.io.IOException;
import org.apache.log4j.*;



public class Assignment2 {

	static Logger logger =Logger.getLogger("Assignment2.class");

	public static void main(String[] args) throws IOException {
	
		
		FileAppender fileappender = new FileAppender(new PatternLayout(),"mylog.txt");
		
		logger.addAppender(fileappender);
		
		//file message
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.error("This is error message");

	    	System.out.println("Success");  //Console Message

	}
}
