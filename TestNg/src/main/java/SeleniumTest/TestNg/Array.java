package SeleniumTest.TestNg;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.core.env.Profiles;
import org.springframework.fu.jafu.ApplicationDsl;

import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class Array {

	public static void main(String[] args) {

		/* String Reverse */
		/*
		 * int i =10; int j = 10; String a= "aditya"; String c=""; char ch;
		 * StringBuilder b =new StringBuilder(a); for(int k=a.length()-1; k>=0; k--) {
		 * System.out.println(a.charAt(k) + " is the char at " + k); ch=a.charAt(k);
		 * c=c+ch; }
		 * 
		 * //System.out.println(b.reverse());
		 * 
		 * System.out.println(c);
		 */
		
		
		/* Selenium Webdriver hit the Chromebrowser */
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Aditya\\Automation\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://www.amazon.in/");
		 */
		 
		/* Selenium Webdriver hit the Edge browser */
		
		  System.setProperty("webdriver.edge.driver", "E:\\Aditya\\Automation\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver(); 
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("books");
		  driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
		  driver.findElement(By.xpath("//*[@class = 'rush-component s-latency-cf-section']/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/span/a/div/img")).click();
		  //driver.close();
		   
	}
}
