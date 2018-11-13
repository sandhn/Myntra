package com.myntra.helper;

public class ResourceHElper 
{

	public static String getPath(String path) {
		String base = System.getProperty("user.dir");
		return base +"/"+path;
	}
}
