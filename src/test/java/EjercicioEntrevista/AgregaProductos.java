package EjercicioEntrevista;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AgregaProductos extends IniciaChrome{

	By menorPrecio=By.id(Variables.menorPrecio);
	By mayorPrecio=By.id(Variables.mayorPrecio);
	By textoMenor=By.xpath(Variables.etiquetaMenor);
	By textoMayor=By.xpath(Variables.etiquetaMayor);
	
	@Test
	public void agregarArticulos(){
		
		POM pom=PageFactory.initElements(driver, POM.class);
		
		pom.click(menorPrecio);
		pom.click(mayorPrecio);
		Variables.textoMen=pom.obtenerTexto(textoMenor);
		Variables.textoMay=pom.obtenerTexto(textoMayor);
		
	}
	
}
//*[@id="item_5_title_link"]/div-+