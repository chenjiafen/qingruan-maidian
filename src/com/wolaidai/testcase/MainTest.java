package com.wolaidai.testcase;

import java.util.concurrent.TimeUnit;

import com.wolaidai.appiumservices.AppiumServices;
import com.wolaidai.com.init.InitDriver;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainTest {

	public static void main(String[] args) throws Exception {
		AppiumServices.StartAppiumService();
		AndroidDriver<AndroidElement> driver = InitDriver.AlreadyInstalled("GWY0217117000560", "co.welab.wolaidai",
				"co.welab.wolaidai.MainActivity");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(8000);
//		WoLaiDaiLogin logintest = new WoLaiDaiLogin(driver);
//		HomePageClick jdd = new HomePageClick(driver);
//		logintest.loginTest("18520190526", "888888");
//		Thread.sleep(2000);
//		jdd.bannerClick();
//
//		jdd.click_application();
//		jdd.toolsClick();
//		System.out.println("測試完成================================");
//		Activity activity = new Activity("co.welab.wolaidai", "co.welab.wolaidai.MainActivity");
//		 driver.startActivity(activity);
		 JddAction jdd=new JddAction(driver);
		 jdd.login("18520190526", "888888");
		 jdd.choiceProduct();
		 jdd.intro("8000");
		 
	}

}
