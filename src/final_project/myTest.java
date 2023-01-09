package final_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.storage.model.UsageForType;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class myTest extends parameter {

	@Test(priority = 1)
	public void add_coustmer() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();

		Faker faker = new Faker();
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();

		int userid = (int) (Math.random() * 100);
		StringBuilder username = new StringBuilder();
		username.append(userid);
		String useridstring = username.toString();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys(firstname);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys(lastname);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"))
				.sendKeys(useridstring);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		String msg = driver.switchTo().alert().getText();
		boolean checkmsg = msg.contains("successfully");

		assertprocess.assertEquals(checkmsg, true);
		driver.switchTo().alert().accept();

		assertprocess.assertAll();

	}

	/*
	 * @Test(priority = 2) public void open_account() throws InterruptedException {
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")
	 * ).click(); Thread.sleep(3000);
	 * driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();
	 * List<WebElement> option = driver.findElements(By.tagName("option"));
	 * option.get(2).click(); Thread.sleep(3000);
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"currency\"]")).click();
	 * 
	 * List<WebElement> currency = driver.findElements(By.) currency.get(0).click();
	 * 
	 * 
	 * 
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	 * 
	 * String mumsg=driver.switchTo().alert().getText(); boolean
	 * chechcurrency=mumsg.contains("currency");
	 * 
	 * assertprocess.assertEquals(chechcurrency, true);
	 * 
	 * 
	 * assertprocess.assertAll();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	@Test(priority = 2)
	public void coustmer_login() {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();
		List<WebElement> option1 = driver.findElements(By.tagName("option"));
		option1.get(2).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
		String msg2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/strong")).getText();
		boolean checkmsgwelcome = msg2.contains("Welcome");

		assertprocess.assertEquals(checkmsgwelcome, true);

		assertprocess.assertAll();
	}

	@Test(priority = 3)
	public void Deposit() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();

		int id = (int) (Math.random() * 10000);
		StringBuilder uesrname = new StringBuilder();
		uesrname.append(id);
		String userid = uesrname.toString();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(userid);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		String despoitmsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/span")).getText();
		boolean checkdespoimsg = despoitmsg.contains("Successful");
		assertprocess.assertEquals(checkdespoimsg, true);
		assertprocess.assertAll();

	}
	
	@Test(priority = 4)
	public void wihthadraw() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")).click();
		int id1 = (int) (Math.random() * 10000);
		StringBuilder uesrname1 = new StringBuilder();
		uesrname1.append(id1);
		String userid1 = uesrname1.toString();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys(userid1);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		String msgwithdraw=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/span")).getText();
		String msgerr=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/span")).getText();
				boolean checkwh=msgwithdraw.contains("successful");
				assertprocess.assertEquals(checkwh, true);
				assertprocess.assertAll();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
