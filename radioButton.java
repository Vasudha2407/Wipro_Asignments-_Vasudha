package Day23;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/radio-button");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement ele;
	    ele=driver.findElement(By.id("yesRadio"));
	    ele.click();
	    System.out.println("Yes clicked");
	    Thread.sleep(2000);
	    ele=driver.findElement(By.id("impressiveRadio"));
	    ele.click();
	    System.out.println("Impressive clicked");
	    
	}

}
