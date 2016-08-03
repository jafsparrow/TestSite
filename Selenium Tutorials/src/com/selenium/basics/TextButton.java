package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextButton {

	
	public static void main(String[] args) throws Exception {
		

		WebElement userName;
		WebElement password;
		WebElement firstName;
		WebElement lastName;
		WebElement showDataButton;
		WebElement enabledButton;
		WebElement disabledButton;
		
		WebElement resultText1;
		
		//Starting Firefox
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/testsite/index.html");
		driver.manage().window().maximize();
		
		//navigating to lesson 1
		driver.findElement(By.id("topic1")).click();
		
		//finding elements.
		userName = driver.findElement(By.id("formText1"));
		password = driver.findElement(By.id("formText2"));
		firstName = driver.findElement(By.id("formText3"));
		lastName = driver.findElement(By.id("formText4"));
		showDataButton = driver.findElement(By.id("showButton"));
		enabledButton = driver.findElement(By.id("enabledButton"));
		disabledButton = driver.findElement(By.id("disabledButton"));
		
		//checking the result texts are displayed using .isDisplayed() method.
		if(!driver.findElement(By.id("resultText1")).isDisplayed()){
			System.out.println("result texts are not displayed.");
		}
		
		
		
		
		
		//test case will proceed based on two condition - display mode of the buttons.
		
		if(enabledButton.isEnabled() && !disabledButton.isEnabled()){
			
				userName.sendKeys("TestUser1");
				password.sendKeys("testpassword");
				firstName.sendKeys("Alex");
				lastName.sendKeys("theKing");
				
				showDataButton.click();
			
		}
		
		//cutting some slack here :)
		Thread.sleep(500);
		
		//checking if one of result text is displayed using .isDisplayed() method.
		//printing the text on console using .getText() method.
		if(driver.findElement(By.id("resultText1")).isDisplayed()){
			System.out.println("result texts are displayed.");
			resultText1 = driver.findElement(By.id("resultText1"));
			
			System.out.println(resultText1.getText());
		}
		
		
		
		
		//close and say bye bye to driver.
		driver.close();
		driver.quit();
		
		
		

	}

}






