package BDD_Cucumber.BDD_CucumberFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.searchCredenciado;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PesquisaCredenciado {

	WebDriver driver;
	searchCredenciado search;

	@SuppressWarnings("deprecation")
	@Given("Usuário está na página Rede SOCNET")
	public void usuário_está_na_página_rede_socnet() {

		String path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", path + "\\src\\main\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.soc.com.br/");
		System.out.println("Teste OK");
	}

	@And("clicar no botão Buscar Credenciados")
	public void clicar_no_botão_buscar_credenciados() {
		
		search = new searchCredenciado(driver);

		search.selectRede();
		search.btnPesquisa();
	}

	@And("preencher os filtros para busca")
	public void preencher_os_filtros_para_busca() {

		search.realizaPesquisa("06330000");
	}

	@Then("deve ser mostrado os resultados")
	public void deve_ser_mostrado_os_resultados() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
