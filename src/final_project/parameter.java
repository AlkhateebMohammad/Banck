package final_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameter {
	
	public WebDriver driver;
	String url="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	SoftAssert assertprocess=new SoftAssert();
	
	@BeforeTest()
	public void Before_test()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}

}
