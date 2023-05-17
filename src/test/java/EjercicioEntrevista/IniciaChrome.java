package EjercicioEntrevista;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class IniciaChrome {

	public static WebDriver driver;
	
	@BeforeSuite
	public void instanciaChrome(){
		
		System.setProperty("webdriver.chrome.driver", Variables.rutaChrome);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver=new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
	}
	
	@AfterSuite
	public void cierraChrome(){
		
		//driver.close();
		
	}
	
}
