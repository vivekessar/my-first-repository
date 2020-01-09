package org.nea.project;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WeKay\\Documents\\Eclipse Path\\NewProjectReposiory\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	driver.quit();
	
	}

}
