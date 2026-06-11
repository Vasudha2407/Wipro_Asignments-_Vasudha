package Day23;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class textBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://demoqa.com/text-box");
       driver.manage().window().maximize();
       driver.findElement(By.id("userName")).sendKeys("Raghav");
       Thread.sleep(2000);
       driver.findElement(By.id("userEmail")).sendKeys("raghav@gmail.com");
       Thread.sleep(2000);
       
       driver.findElement(By.id("currentAddress")).sendKeys("Vijay Sai Kiran Residency");
       Thread.sleep(2000);
       
       driver.findElement(By.id("permanentAddress")).sendKeys("Vijay Sai Kiran Residency");
       Thread.sleep(2000);
       
       driver.findElement(By.id("submit")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("userName")).clear();
      driver.findElement(By.id("userEmail")).clear();
      driver.findElement(By.id("currentAddress")).clear();
      driver.findElement(By.id("permanentAddress")).clear();      
      
	}

}
