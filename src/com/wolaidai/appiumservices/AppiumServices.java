package com.wolaidai.appiumservices;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/**
 * @author tyler.chen
 *
 */
public class AppiumServices {
	static AppiumDriverLocalService service;
	public static void StartAppiumService(){
	AppiumServiceBuilder ab=new AppiumServiceBuilder();
	service=ab.build();
	service.start();
	}
	public static void stopAppiumService(){
		service.stop();
	}

}
