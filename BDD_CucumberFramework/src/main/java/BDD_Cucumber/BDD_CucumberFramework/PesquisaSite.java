package BDD_Cucumber.BDD_CucumberFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.searchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PesquisaSite {

	WebDriver driver = null;
	searchPage search;

	@SuppressWarnings("deprecation")
	@Given("Usuário está na página principal")
	public void usuário_está_na_página_principal() {

		System.out.println("Teste OK");
		String path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", path + "\\src\\main\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.soc.com.br/");

	}

	@When("Usuário clica na lupa de pesquisa")
	public void usuário_clica_na_lupa_de_pesquisa() {

		driver.findElement(By.xpath("//i[@class='fas fa-search']")).click();

		System.out.println("Teste OK");
	}

	@And("Digita o desejado na barra de busca")
	public void digita_o_desejado_na_barra_de_busca() {

		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("SOC");
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys(Keys.ENTER);

		System.out.println("Teste OK");
	}

	@Then("O resultado é mostrado na tela")
	public void o_resultado_é_mostrado_na_tela() {
		System.out.println("Teste OK");
	}

}