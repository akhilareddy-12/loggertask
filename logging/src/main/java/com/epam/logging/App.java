package com.epam.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOGGER.debug("This is a DEBUG Logger");
    	LOGGER.info("This is a INFO Logger");
    	LOGGER.warn("This is a WARN Logger");
    	LOGGER.error("This is a ERRORLogger");
    	LOGGER.fatal("This is a fatal Logger");
    }
}