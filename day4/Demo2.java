package com.techment.log4j;

import java.io.IOException;
import org.apache.log4j.*;

//import org.apache.log4j.FileAppender;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;

public class Demo2 {

	static Logger logger =Logger.getLogger("Demo2.class");

	public static void main(String[] args) throws IOException {
		
		System.out.println("success");
		
		//FileAppender fileappender = new FileAppender(new PatternLayout(),"mylog.txt");
		FileAppender fileappender = new FileAppender(new HTMLLayout(),"myloghtml.html");
		logger.addAppender(fileappender);
		
		
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.error("This is error message");
	}
}