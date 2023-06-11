package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WikiResultadoPage {
	WebDriver driver;

	public WikiResultadoPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	// @FindBy(id = "firstHeading")
	@FindBy(xpath = "//h1[@id='firstHeading']")

	private WebElement lblTitulo;

	public String ObtenerTitulo() {
		Reporter.log("Localizar y comprobar que el titulo este disponible");
		return lblTitulo.getText();
	}

	public String ObtenerTituloDriver(String dato) throws Exception {
		
		return driver.getTitle().toString();

	}
}
