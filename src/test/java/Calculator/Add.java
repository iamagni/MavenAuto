package Calculator;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.Test;

public class Add {

@Test
public static void Test() throws InterruptedException, IOException {
	DesktopOptions option = new DesktopOptions();
	  System.setProperty("webdriver.winium.desktop.driver","E:\\Winnium\\Winium.Desktop.Driver");
	option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
	//WiniumDriver driver = new WiniumDriver(option);
	Thread.sleep(5000);
	System.out.println("hiii");
	driver.findElement(By.name("7")).click();
	driver.findElement(By.name("Add")).click();
	driver.findElement(By.name("7")).click();
	driver.findElementByName("Equals").click();;
/*	DesktopOptions option = new DesktopOptions();
	option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	WiniumDriverService service = new WiniumDriverService.Builder()
			.usingDriverExecutable(new File("E:\\Winnium\\Winium.Desktop.Driver.exe"))
			.usingPort(9999)
			.withVerbose(true)
			.withSilent(false)
			.buildDesktopService();
			
			WiniumDriver driver = new WiniumDriver(service,option);
			Thread.sleep(5000);
			
			driver.findElement(By.name("7")).click();
			//service.stop();

			//service.start();
*/
	
	
   
}
	
}

