package com.myntra.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {

	public static boolean root = false;
	public static Logger takeLogger(Class cls)
	{
		if(root)
		{
			return Logger.getLogger(cls);
		}
		root=true;
		PropertyConfigurator.configure(ResourceHElper.getPath("./resources/configfile/log4j.properties"));
		return Logger.getLogger(cls);
	}

}
