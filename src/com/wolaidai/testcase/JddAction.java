package com.wolaidai.testcase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.wolaidai.util.WoLaiDaiUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class JddAction implements JddApplication {

	AndroidDriver<AndroidElement> driver;

	public JddAction(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	@Override
	public void login(String phone, String codes) {
		Map<String, String> map=new HashMap<String,String>();
		map.put("账户", "//*[@text='账户']");
		map.put("登录/注册", "//*[@text='登录/注册']");
		map.put("获取验证码", "//*[@text='获取验证码']");
		map.put("完成", "//*[@text='完 成']");
		driver.findElement(By.xpath(map.get("账户"))).click();
		MobileElement login = driver.findElement(By.xpath(map.get("登录/注册")));
		login.click();
		List<AndroidElement> inputName = driver.findElements(By.className("android.widget.EditText"));
		inputName.get(0).click();
		WoLaiDaiUtil.sendKeyss(driver, phone);
		MobileElement code = driver.findElement(By.xpath(map.get("获取验证码")));
		code.click();
		inputName.get(1).click();
		WoLaiDaiUtil.sendKeyss(driver, codes);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement finish = driver.findElement(By.xpath(map.get("完成")));
		finish.click();
	}

	@Override
	/**
	 * 选择简单产品
	 */
	public void choiceProduct() {
		Map<String, String> map=new HashMap<String,String>();
		map.put("首页", "//*[@text='首页']");
		map.put("jdd", "//*[@text='凭身份证申请']");
		driver.findElement(By.xpath(map.get("首页"))).click();
		if (WoLaiDaiUtil.IsElementExit(driver, By.xpath(map.get("jdd")))) {
			driver.findElement(By.xpath(map.get("jdd"))).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("没有找到凭身份证申请====================");
			WoLaiDaiUtil.swipToUp(driver);
			if (WoLaiDaiUtil.IsElementExit(driver, By.xpath("//*[@text='凭身份证申请']"))) {
				driver.findElement(By.xpath("//*[@text='凭身份证申请']")).click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	/**
	 * 选择金额
	 *金额选择6000,6期
	 */
	public void intro(String money) {
		Map<String, String> map=new HashMap<String,String>();
		map.put("inputDiv", "android.widget.EditText");
		map.put("clear", "(//android.widget.ImageView)[2]");
		map.put("qixian", "//*[@text='6个月']");
		map.put("立即申请", "//*[@text='立即申请']");
		AndroidElement inputD=driver.findElement(By.className(map.get("inputDiv")));
		inputD.click();
		AndroidElement clear=	driver.findElement(By.xpath(map.get("clear")));
		clear.click();
		WoLaiDaiUtil.sendKeyss(driver, money);
		AndroidElement qixian=driver.findElement(By.xpath(map.get("qixian")));
		qixian.click();
		AndroidElement shenqi=driver.findElement(By.xpath(map.get("立即申请")));
		shenqi.click();
		
		
		
		
		
	}

	@Override
	public void identity() {
		// TODO Auto-generated method stub

	}

	@Override
	public void contact() {
		// TODO Auto-generated method stub

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub

	}

	@Override
	public void certification() {
		// TODO Auto-generated method stub

	}

}
