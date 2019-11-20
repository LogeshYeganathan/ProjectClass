package org.Jav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class News {

	public void name() {
		System.out.println("Logesh");
	}
		 public static void main(String[] args){
	News ne=new News();
	ne.name();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LOGESH KANNA\\eclipse-workspace\\org.Jav\\src\\lib\\chromedriver.exe");
	WebDriver drive= new ChromeDriver();
	drive.get("https://www.google.com/");
	
	
	}
}
