package EjercicioEntrevista;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidaArticulosCarrito extends IniciaChrome{
	
	By carrito=By.id(Variables.enlaceCarrito);
	By textoMenor=By.xpath(Variables.etiquetaMenor);
	By textoMayor=By.xpath(Variables.etiquetaMayor);
	By btnComprar=By.id(Variables.btnCompra);
	
	@Test
	public void carritoCompras(){
		
		POM pom=PageFactory.initElements(driver, POM.class);
		
		pom.click(carrito);
		Assert.assertEquals(pom.obtenerTexto(textoMenor), Variables.textoMen);
		Assert.assertEquals(pom.obtenerTexto(textoMayor), Variables.textoMay);
		pom.click(btnComprar);
		
	}

}
