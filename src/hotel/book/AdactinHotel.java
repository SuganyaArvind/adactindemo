package hotel.book;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinHotel {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\SugiWorks\\workspace\\AdactinDemo\\driver\\chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("SugiArvindTMG");
	driver.findElement(By.id("password")).sendKeys("sugi@1");
	driver.findElement(By.id("login")).click();
	WebElement ddn = driver.findElement(By.id("location"));
	Select s = new Select(ddn);
	s.selectByIndex(7);
	
	WebElement hotelD1 = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotelD1);
	s1.selectByVisibleText("Hotel Sunshine");
		
	WebElement roomdd2 = driver.findElement(By.id("room_type"));
	Select s2 =new Select (roomdd2);
	s2.selectByValue("Super Deluxe");
	
	WebElement room_nosdd3 = driver.findElement(By.id("room_nos"));
	Select s3 =new Select (room_nosdd3);
	s3.selectByIndex(5);
	
	WebElement datecheckin = driver.findElement(By.id("datepick_in"));
	datecheckin.clear();
	datecheckin.sendKeys("05/05/2022");
	
	WebElement datecheckout = driver.findElement(By.id("datepick_out"));
	datecheckout.clear();
	datecheckout.sendKeys("07/05/2022");
	
	WebElement adult_roomdd4 = driver.findElement(By.id("adult_room"));
	Select s4 =new Select (adult_roomdd4);
	s4.selectByValue("3");
	
	WebElement child_roomdd5 = driver.findElement(By.id("child_room"));
	Select s5 =new Select (child_roomdd5);
	s5.selectByVisibleText("4 - Four");
	
	
	driver.findElement(By.id("Submit")).click();
	
	driver.findElement(By.id("radiobutton_0")).click();
	
	driver.findElement(By.id("continue")).click();
	
	driver.findElement(By.id("first_name")).sendKeys("Suganya");
	
	driver.findElement(By.id("last_name")).sendKeys("Arvind");
	
	driver.findElement(By.id("address")).sendKeys("No 136, srojini street",Keys.ENTER,"annanagar",Keys.ENTER, "Chennai");
	
	driver.findElement(By.id("cc_num")).sendKeys("1234567891011146");
	
	WebElement ccddn = driver.findElement(By.id("cc_type"));
	
	Select s7 = new Select(ccddn);
	
	s7.selectByVisibleText("VISA");
	
	WebElement expddn = driver.findElement(By.id("cc_exp_month"));
	
	Select s8 = new Select(expddn);
	
	s8.selectByValue("2");
	
	WebElement expyrddn = driver.findElement(By.id("cc_exp_year"));
	
	Select s9 = new Select(expyrddn);
	
	s9.selectByVisibleText("2022");
	
	driver.findElement(By.id("cc_cvv")).sendKeys("526");
	
	
	driver.findElement(By.id("book_now")).click();
	
//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)) ;
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
	WebElement orderid = driver.findElement(By.id("order_no"));
	String attribute = orderid.getAttribute("value");
	
	
	System.out.println(attribute);
	
	
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
