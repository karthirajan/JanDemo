package com.hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettyImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selinium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/editorial-images");
		
		
		driver.manage().window().maximize();
		
		WebElement editor=driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
		Actions ok=new Actions(driver);
		ok.moveToElement(editor).perform();

		WebElement entertainment=driver.findElement(By.xpath("//a[text()='Entertainment']"));
		entertainment.click();
		
	}

}
