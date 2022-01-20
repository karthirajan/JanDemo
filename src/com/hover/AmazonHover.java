package com.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHover {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selinium\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			
			driver.manage().window().maximize();
			
			WebElement signIn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			
			Actions ok= new Actions(driver);
			ok.moveToElement(signIn).perform();
			
			WebElement prime=driver.findElement(By.xpath("//span[text()='Your Prime Membership']"));
			prime.click();

	}

}
