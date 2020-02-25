package com.epam.loggingDemo;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App1
{
	private static final Logger LOGGER = LogManager.getLogger(App1.class);
	public static void main(String[] args) 
	{

		LOGGER.info("Hello World!!!");
	}

}
