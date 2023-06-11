package com.selenium.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.selenium.MetodosUtiles.Utiles;

public class WikiHomePage {
	WebDriver driver;

	/** Contructor que en este caso utiliza el driver enviado por parametro **/
	public WikiHomePage(WebDriver ldriver) {
		driver = ldriver;
	}

// ***** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH
	@FindBy(id = "js-link-box-es")
	//@FindBy(id= "jsLangLabel")
	private WebElement idiomaEspaniol;
	@FindBy(id = "searchInput")
	private WebElement caja;
	@FindBy(id = "searchLanguage")
	private WebElement languageCombo;

	public String getCaja() {
		Utiles.Escribir("Obtiene el contenido de la caja de busqueda");
		return caja.getText();
	}

	public boolean SeVisualizaCaja() {
		Utiles.Escribir("Validar que exista la caja de busqueda");
		return caja.isDisplayed();
	}

	public void IngresarDatoCajaBusqueda(String dato) {
		Utiles.Escribir("Localizar y comprobar que la caja de busqueda se muestra");
		Assert.assertTrue((caja.isDisplayed()), "La caja de busqueda no se visualiza");
		Utiles.Escribir("Ingresar la palabra " + dato);
		
		caja.sendKeys(dato);
		Utiles.Escribir("Presionar Enter");
		caja.sendKeys(Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
	}

	public void ClickEnEspaniol() throws Exception {
		Assert.assertTrue(idiomaEspaniol.isDisplayed(), "El Idioma no se visualiza");
		idiomaEspaniol.click();
	}
}