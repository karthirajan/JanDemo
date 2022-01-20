package com.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selinium\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.homedepot.com/");
			
			driver.manage().window().maximize();
			
			WebElement allDept=driver.findElement(By.xpath("//a[text()='All Departments']"));
			Actions ok= new Actions(driver);
			ok.moveToElement(allDept).perform();
			
			WebElement heat=driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
			Actions heatOpn= new Actions(driver);
			heatOpn.moveToElement(heat).perform();
			
			WebElement airCond=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
			Actions ac= new Actions(driver);
			ac.moveToElement(airCond).perform();
			
			WebElement portAC=driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
			Actions port= new Actions(driver);
			port.moveToElement(portAC).perform();
			
			
	}

}
