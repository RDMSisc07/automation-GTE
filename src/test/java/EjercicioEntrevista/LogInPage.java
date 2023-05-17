package EjercicioEntrevista;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInPage extends IniciaChrome{
	
	By mail=By.id(Variables.mail);
	By password=By.id(Variables.password);
	By btnLogin=By.id(Variables.btnLogin);
	
	@Test
	public void login(){
		
	POM pom= PageFactory.initElements(driver, POM.class);
	
	pom.ingresaTexto(Variables.user, mail);
	pom.ingresaTexto(Variables.pass, password);
	pom.click(btnLogin);
	
	}

}
