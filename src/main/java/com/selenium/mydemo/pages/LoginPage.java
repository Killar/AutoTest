package com.selenium.mydemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

/**
 * @author jean 测试场景：打开页面输入手机号、密码点击登录
 */
public class LoginPage extends GeneralPage {
	@FindBy(id = "nickName0")
	private WebElement nickName;
	@FindBy(id = "logPsw")
	private WebElement passWord;
	@FindBy(css = "button.ant-btn.ant-btn-primary.login-btn")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage nameInput() throws InterruptedException {
		nickName.sendKeys("XXXXXXXXXXX");
		Thread.sleep(3000);
		return this;
	}

	public LoginPage passWordInput() throws InterruptedException {
		passWord.sendKeys("XXXXXXXXX");
		Thread.sleep(3000);
		return this;
	}

	public LoginPage buttonClick() throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
		return this;
	}
}