package com.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHover {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selinium\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			
			driver.manage().window().maximize();
			
			WebElement appliances=driver.findElement(By.xpath("//div[text()='Home']"));
			appliances.click();
			
			

	}

}
