package com.selenium.mydemo.tests;

import org.testng.annotations.Test;

import com.selenium.mydemo.core.TestBase;
import com.selenium.mydemo.pages.LoginPage;
/**
 * @author baiya
 */
public class LoginTest extends TestBase {
    @Test(priority = 0)
    public void login1() {

        try {
            LoginPage logonPage = new LoginPage(driver)
                    .nameInput()
                    .passWordInput()
                    .buttonClick();
        } catch (Exception e) {
            e.printStackTrace();
        }
       logger.info("测试成功");
    }
}