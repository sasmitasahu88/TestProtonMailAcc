package com.mail;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
    	//Set Chrom driver
    	 System.setProperty("webdriver.chrome.driver", "C:/Users/sasmita/Downloads/chromedriver_win32/chromedriver.exe");

    	    ChromeDriver driver = new ChromeDriver();
    	    
    	    //Login page
    	    driver.get("https://account.proton.me");
    	   
    	    
    	    //Input Username
    	    driver.findElement(By.id("username")).sendKeys("sasmitasahu@proton.me");
    	    
			
    	    //driver.quit();
    	
    	    System.out.println( "Hello World!" );
       
       
        
    }
}
