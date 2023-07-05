
package Page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchCredenciado {

	WebDriver driver;

	Actions action;

	@FindBy(xpath = "//a[contains(text(),'Funcionalidades')]")
	WebElement iconFuncionalidades;

	@FindBy(xpath = "//a[@href = \"https://www.soc.com.br/rede-credenciada-socnet/\"]")
	WebElement linkRede;

	@FindBy(xpath = "//span[@class = \"elementor-button-text\"][contains(text(),'Buscar credenciados')]")
	WebElement btnPesquisa;

	@FindBy(xpath = "//span[contains(text(),'Mostrar todas as conveniências')]")
	WebElement expandConveniencias;

	@FindBy(xpath = "//div[@class = 'elemento-filtro']//span[contains(text(), 'Coleta em domicílio')]")
	WebElement cbxConveniencia;

	@FindBy(xpath = "//input[@name = '1'][@class = 'filtro filtro-servico']")
	WebElement cbxServico;

	@FindBy(xpath = "//span[contains(text(),'Mostrar todos os serviços')]")
	WebElement expandServicos;

	@FindBy(xpath = "//div[@style = 'position: absolute; left: 0px; top: 0px; height: 115px; width: 100%;']//*[@class = 'nome-empresa']")
	WebElement resultadoPesquisa;

	@FindBy(xpath = "//div[@style = 'position: absolute; left: 0px; top: 0px; height: 115px; width: 100%;']//button[@type = 'button']")
	WebElement btnSaibaMais;

	@FindBy(id = "ipt-busca-credenciado-2")
	WebElement txtCEP;

	@FindBy(id = "botao-buscar")
	WebElement btnBuscar;

	public searchCredenciado(WebDriver driver) {

		action = new Actions(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectRede() {

		iconFuncionalidades.click();
		linkRede.click();
	}

	public void btnPesquisa() {

		btnPesquisa.click();

	}

	public void realizaPesquisa(String txt) {

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();

			WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(30))
					.until(ExpectedConditions.elementToBeClickable(txtCEP));

			txtCEP.sendKeys(txt);
			expandConveniencias.click();
			cbxConveniencia.click();
			btnBuscar.click();
			btnSaibaMais.click();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
