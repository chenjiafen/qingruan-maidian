package com.wolaidai.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.wolaidai.util.WoLaiDaiUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PredictcreditCard {
	AndroidDriver<AndroidElement> driver;

	public PredictcreditCard(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		
	}
	public void PredictcreditCardClick(){
		if(WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='填写资料,提升额度']"))){
				try {
					driver.findElement(By.xpath("//*[@text='填写资料,提升额度']")).click();
				} catch (Exception e) {
//					driver.takeScreen("images/", "jdderror");
					
					Assert.fail("簡單貸進件失敗 ----->" + e.getMessage());
				}
				
		}else{
			for(int i=0;i<2;i++){
				WoLaiDaiUtil.swipToDown(driver);
			}
		}
	}
	

}
