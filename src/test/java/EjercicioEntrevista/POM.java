package EjercicioEntrevista;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class POM {
	
	static WebDriver driver;
	
	public POM(WebDriver driver) { 
        POM.driver = driver; 
    }
	
	public WebElement findElement(By locator){		
		return driver.findElement(locator);		
	}
	
	public void urlPagina(String URL){
		driver.get(URL);
	}
	
	public void ingresaTexto(String inputText,By locator){
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator){
		driver.findElement(locator).click();
	}
	
	public String obtenerTexto(By locator){
		return (driver.findElement(locator).getText());		
	}
	
	public Boolean esMastrado(By locator){
		try{
			return (driver.findElement(locator).isDisplayed());
		}catch (org.openqa.selenium.NoSuchElementException e){
			return false;			
		}
	}
}
