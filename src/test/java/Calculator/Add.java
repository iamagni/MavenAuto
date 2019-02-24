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


public static void main(String[] args) throws InterruptedException, IOException {
	/*DesktopOptions option = new DesktopOptions();
	option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
	//WiniumDriver driver = new WiniumDriver(option);
	Thread.sleep(5000);
	
	driver.findElement(By.name("7")).click();
	driver.findElement(By.name("Add")).click();
	driver.findElement(By.name("7")).click();
	driver.findElementByName("Equals").click();;*/
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
	
	
    DesktopOptions options = new DesktopOptions();
    options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
    Thread.sleep(2000);
    
    WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(new File("E:/Winnium/Winium.Desktop.Driver.exe"))
        .usingPort(9999)
        .withVerbose(true)
        .withSilent(false)
        .buildDesktopService();

    WiniumDriver driver = new WiniumDriver(service, options);
    Thread.sleep(2000);
    
    service.start();

	driver = new WiniumDriver(service, options);

	Thread.sleep(3000);
	driver.findElement(By.id("num3Button")).click();

	boolean num4val = driver.findElement(By.id("num4Button")).isEnabled();

	System.out.println(num4val);

	driver.findElement(By.id("num4Button")).click();

	// driver.findElement(By.id("num5Button")).click();

	System.out.println("Test running");
   
}
	
}

