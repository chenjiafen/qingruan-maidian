package com.wolaidai.testcase;
import org.openqa.selenium.By;

import com.wolaidai.util.WoLaiDaiUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class HomePageClick {
	static AndroidDriver<AndroidElement> driver;

	public HomePageClick(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void bannerClick() throws Exception {
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("(//android.widget.ImageView)[2]")).click();
			driver.pressKeyCode(AndroidKeyCode.BACK);
			Thread.sleep(2000);
			WoLaiDaiUtil.swipToLeft(driver);

		}
	}

	public void toolsClick() throws InterruptedException {

		if (driver.getPageSource().contains("福利中心")) {
			driver.findElement(By.xpath("//*[@text='福利中心']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
			driver.findElement(By.xpath("//*[@text='公司介绍']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
			driver.findElement(By.xpath("//*[@text='息费计算']"));
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);

		} else {
			for (int i = 0; i < 3; i++) {
				WoLaiDaiUtil.swipToUp(driver);
				Thread.sleep(2000);
				if(driver.getPageSource().contains("息费计算")){
					try {
						driver.findElement(By.xpath("//*[@text='福利中心']")).click();
						Thread.sleep(3000);
						driver.pressKeyCode(AndroidKeyCode.BACK);
						driver.findElement(By.xpath("//*[@text='公司介绍']")).click();
						Thread.sleep(3000);
						driver.pressKeyCode(AndroidKeyCode.BACK);
						driver.findElement(By.xpath("//*[@text='息费计算']"));
						Thread.sleep(3000);
						driver.pressKeyCode(AndroidKeyCode.BACK);
					} catch (Exception e) {
						System.out.println("元素未知道");
					}
				}
			}
			
		}
	}

	public void click_application() throws Exception {
		if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭身份证申请']"))) {
			driver.findElement(By.xpath("//*[@text='凭身份证申请']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
		} else {
			System.out.println("没有找到凭身份证申请====================");
			WoLaiDaiUtil.swipToUp(driver);
			if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭身份证申请']"))) {
				driver.findElement(By.xpath("//*[@text='凭身份证申请']")).click();
				Thread.sleep(3000);
				driver.pressKeyCode(AndroidKeyCode.BACK);
			}
		}

		if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭信用卡申请']"))) {
			driver.findElement(By.xpath("//*[@text='凭信用卡申请']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
		} else {
			System.out.println("没有找到凭信用卡申请================");
			WoLaiDaiUtil.swipToUp(driver);
			if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭信用卡申请']"))) {
				driver.findElement(By.xpath("//*[@text='凭信用卡申请']")).click();
				Thread.sleep(3000);
				driver.pressKeyCode(AndroidKeyCode.BACK);
			}

		}
		if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭微信申请']"))) {
			driver.findElement(By.xpath("//*[@text='凭微信申请']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
		} else {
			System.out.println("没有找到凭微信申请");
			WoLaiDaiUtil.swipToUp(driver);
			if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭微信申请']"))) {
				driver.findElement(By.xpath("//*[@text='凭微信申请']")).click();
				Thread.sleep(3000);
				driver.pressKeyCode(AndroidKeyCode.BACK);
			}
		}
		if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭社保申请']"))) {
			driver.findElement(By.xpath("//*[@text='凭社保申请']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
		} else {
			System.out.println("没有找到凭社保申请====================");
			WoLaiDaiUtil.swipToUp(driver);
			if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭社保申请']"))) {
				driver.findElement(By.xpath("//*[@text='凭社保申请']")).click();
				Thread.sleep(3000);
				driver.pressKeyCode(AndroidKeyCode.BACK);
			}
		}
		
		if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭公积金申请']"))) {
			driver.findElement(By.xpath("//*[@text='凭公积金申请']")).click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
		} else {
			System.out.println("没有找到凭身份证申请====================");
			WoLaiDaiUtil.swipToUp(driver);
			if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭公积金申请']"))) {
				driver.findElement(By.xpath("//*[@text='凭公积金申请']")).click();
				Thread.sleep(3000);
				driver.pressKeyCode(AndroidKeyCode.BACK);
			}
		}

	}

}
