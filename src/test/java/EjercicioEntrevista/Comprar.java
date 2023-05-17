package EjercicioEntrevista;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Comprar extends IniciaChrome{
	
	By nombre=By.id(Variables.nombre);
	By apellido=By.id(Variables.apellido);
	By codPostal=By.id(Variables.CP);
	By continuar=By.id(Variables.btnContinuar);
	By textoMenor=By.xpath(Variables.etiquetaMenor);
	By textoMayor=By.xpath(Variables.etiquetaMayor);
	By finCompra=By.id(Variables.finCompra);
	
	
	@Test
	public void aplicarCompra(){
		
		POM pom=PageFactory.initElements(driver,POM.class);
		
		pom.ingresaTexto(Variables.nombreCompra, nombre);
		pom.ingresaTexto(Variables.apellidoCompra, apellido);
		pom.ingresaTexto(Variables.compraCP, codPostal);
		pom.click(continuar);
		
		Assert.assertEquals(pom.obtenerTexto(textoMenor), Variables.textoMen);
		Assert.assertEquals(pom.obtenerTexto(textoMayor), Variables.textoMay);
		
		pom.click(finCompra);
		
	}

}
