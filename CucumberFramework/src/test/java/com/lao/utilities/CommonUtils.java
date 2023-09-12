package com.lao.utilities;

import java.util.Properties;


import com.lao.constants.Constants;

public class CommonUtils {
//config file loader
	public   void loadProperties()  {
	

		Properties properties = new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Constants.APP_URL = properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.USERNAME=	properties.getProperty("UserName");
		Constants.PASSWORD=properties.getProperty("Password");
	}

}
