package EjercicioEntrevista;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompraTerminada extends IniciaChrome{

	
	By msjCompraTerminada=By.xpath(Variables.msjCompraTerminada);
	
	
	@Test
	public void compraConcluida(){
		
		POM pom=PageFactory.initElements(driver, POM.class);
		
		pom.esMastrado(msjCompraTerminada);
		Assert.assertEquals(pom.obtenerTexto(msjCompraTerminada), Variables.textoCompraCompletada);
		
	}
}
