package com.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selinium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/");
		
		driver.manage().window().maximize();
		
		WebElement allow=driver.findElement(By.xpath("//button[text()='Allow']"));
		allow.click();
		
		WebElement sports=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions ok= new Actions(driver);
		ok.moveToElement(sports).perform();
		
		WebElement weight=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weight.click();
		
		
		

	}

}
