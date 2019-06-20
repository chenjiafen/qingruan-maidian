
package com.wolaidai.testcase;

import java.util.List;
import org.openqa.selenium.By;
import com.wolaidai.util.WoLaiDaiUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author tyler.chen
 *
 */
public class WoLaiDaiLogin {
	static AndroidDriver<AndroidElement> driver;

	public WoLaiDaiLogin(AndroidDriver<AndroidElement> driver) {
		WoLaiDaiLogin.driver = driver;
	}
	public void loginTest(String phone, String codes) throws Exception {
		driver.findElement(By.xpath("//*[@text='账户']")).click();
		MobileElement login = driver.findElement(By.xpath("//*[@text='登录/注册']"));
		login.click();
		List<AndroidElement> inputName = driver.findElements(By.className("android.widget.EditText"));
		inputName.get(0).click();
		WoLaiDaiUtil.sendKeyss(driver, phone);
		MobileElement code = driver.findElement(By.xpath("//*[@text='获取验证码']"));
		code.click();
		inputName.get(1).click();
		WoLaiDaiUtil.sendKeyss(driver, codes);
		Thread.sleep(2000);
		MobileElement finish = driver.findElement(By.xpath("//*[@text='完 成']"));
		finish.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='首页']")).click();

	}

}
