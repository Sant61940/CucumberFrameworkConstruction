package com.lao.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lao.constants.Constants;
import com.lao.utilities.CommonUtils;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Step_definition {

	//launchBrowser
	public static WebDriver driver;

	private static final Logger LOGGER = LogManager.getLogger(Common_Step_definition.class);
	
	@Before

	public void BeforeScenario() {
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Instantiating the COmmonUtils");
			CommonUtils commonUtils = new CommonUtils();
			LOGGER.info("Loading the properties file");
			commonUtils.loadProperties();
			LOGGER.info("Checking the driver is null or not?");
			if (driver==null) {
				LOGGER.info("Driver is NULL. Instatiating it");
				launchBrowser();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void launchBrowser() {
		try {
			switch (Constants.BROWSER) {

			case "Chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			case "FireFox":

				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;

			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching " + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}



}



