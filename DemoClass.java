package Day23;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/checkbox");
	     driver.findElement(By.className("rc-tree-checkbox")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.className("rc-tree-checkbox")).click();
	     	}

}
