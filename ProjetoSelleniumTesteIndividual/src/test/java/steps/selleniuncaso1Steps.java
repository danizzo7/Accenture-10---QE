package steps;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class  selleniuncaso1Steps {
	
	WebDriver driver;
	
	@Before
	
public void setup() {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Documents\\Accenture QA\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Driver navega = new Driver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}	
	

@Dado("que o usuário se encontra no site da Tricentris")
public void que_o_usuário_se_encontra_no_site_da_tricentris() {
	driver.get(" http://sampleapp.tricentis.com/101/app.php");
	
}

@Quando("preenche todos os dados do veículo de forma correta")
public void preenche_todos_os_dados_do_veículo_de_forma_correta() {
	Select marca = new Select(driver.findElement(By.id("make")));
	marca.selectByIndex(3);
	Select modelo = new Select(driver.findElement(By.id("model")));
	modelo.selectByIndex(2);
	driver.findElement(By.id("cylindercapacity")).sendKeys("200");
	driver.findElement(By.id("engineperformance")).sendKeys("500");
	driver.findElement(By.id("dateofmanufacture")).sendKeys("04/01/2019");
	//Select dtmanuf = new Select(driver.findElement(By.id("dateofmanufacture")));
	// dtmanuf.selectByIndex(-40);
	Select assentos = new Select(driver.findElement(By.id("numberofseats")));
	assentos.selectByIndex(3);
	 //driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[2]/input[@value='No']).click"));
	Select assentosmoto = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
	 assentosmoto.selectByIndex(2);
	 Select fuel = new Select(driver.findElement(By.id("fuel")));
	 fuel.selectByIndex(4);
	 driver.findElement(By.id("payload")).sendKeys("1000");
	 driver.findElement(By.id("totalweight")).sendKeys("300");
	 driver.findElement(By.id("listprice")).sendKeys("8000");
	 driver.findElement(By.id("licenseplatenumber")).sendKeys("WBA9910");
	 driver.findElement(By.id("annualmileage")).sendKeys("7200");
}

@Quando("clica no botão de Next")
public void clica_no_botão_de_next() {
	driver.findElement(By.id("nextenterinsurantdata")).click();
}

@Então("deve ir para a página de Informações do seguro")
public void deve_ir_para_a_página_de_informações_do_seguro() {
	String msgValidacao = driver.findElement(By.id("enterinsurantdata")).getText();		
	Assert.assertEquals("Enter Insurant Data",msgValidacao);
}

@Dado("que o usuário se encontra na aba de Informações de Seguro")
public void que_o_usuário_se_encontra_na_aba_de_informações_de_seguro() {
	driver.get(" http://sampleapp.tricentis.com/101/app.php");
	driver.findElement(By.id("enterinsurantdata")).click();
}

@Quando("preenche todos os dados do seguro de forma correta")
public void preenche_todos_os_dados_do_seguro_de_forma_correta() {
	
	driver.findElement(By.id("firstname")).sendKeys("Abelardo");
	driver.findElement(By.id("lastname")).sendKeys("Barbosa");
	driver.findElement(By.id("birthdate")).sendKeys("01/01/1991");
	//driver.findElement(By.cssSelector("span[class='ideal-radio´]")).click();
	driver.findElement(By.id("streetaddress")).sendKeys("Av. Paulista 900");		
	Select pais= new Select(driver.findElement(By.id("country")));
	pais.selectByIndex(31);
	driver.findElement(By.id("zipcode")).sendKeys("01310100");
	driver.findElement(By.id("city")).sendKeys("São Paulo");
	Select ocupacao= new Select(driver.findElement(By.id("occupation")));
	ocupacao.selectByIndex(3);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]")).click();
	driver.findElement(By.id("website")).sendKeys("https://github.com/danizzo7");
}

@Quando("clica no botão para ir para a aba de produto")
public void clica_no_botão_para_ir_para_a_aba_de_produto() {
   	driver.findElement(By.id("nextenterproductdata")).click();;
}

@Então("deve ir para a página de Informações do Produto")
public void deve_ir_para_a_página_de_informações_do_produto() {
   	String msgValidacao = driver.findElement(By.className("idealsteps-step-active")).getText();		
    Assert.assertEquals("Enter Product Data",msgValidacao);
}

@Dado("que o usuário se encontra na aba de Informações de Produto")
public void que_o_usuário_se_encontra_na_aba_de_informações_de_produto() {
    driver.get(" http://sampleapp.tricentis.com/101/app.php");
	driver.findElement(By.id("enterproductdata")).click();
}

@Quando("preenche todos os dados do produto de forma correta")
public void preenche_todos_os_dados_do_produto_de_forma_correta() {
	driver.findElement(By.id("startdate")).sendKeys("09/01/2021");
 	Select somaseguro= new Select(driver.findElement(By.id("insurancesum")));
 	somaseguro.selectByIndex(8);
 	Select merito= new Select(driver.findElement(By.id("meritrating")));
 	merito.selectByIndex(11);
 	Select dano= new Select(driver.findElement(By.id("damageinsurance")));
 	dano.selectByIndex(2);
 	//WebElement radio2 = driver.findElement(By.xpath("\"/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/input\""));
 	//radio2.click();
  	Select carrocortesia= new Select(driver.findElement(By.id("courtesycar")));
 	carrocortesia.selectByIndex(2);
}

@Quando("clica no botão para ir para a aba de preço")
public void clica_no_botão_para_ir_para_a_aba_de_preço() {
    driver.findElement(By.id("selectpriceoption")).click();
}

@Então("deve ir para a página de Seleção de Opções de Preços")
public void deve_ir_para_a_página_de_seleção_de_opções_de_preços() {
	String msgValidacao = driver.findElement(By.className("idealsteps-step-active")).getText();
	Assert.assertEquals("Select Price Option",msgValidacao  );
}

@Dado("que o usuário se encontra na aba de Informações de Seleção de Opções de Preço")
public void que_o_usuário_se_encontra_na_aba_de_informações_de_seleção_de_opções_de_preço() {
	driver.get(" http://sampleapp.tricentis.com/101/app.php");
	driver.findElement(By.id("selectpriceoption")).click();
}

@Quando("preenche todos os dados de opções de preço de forma correta")
public void preenche_todos_os_dados_de_opções_de_preço_de_forma_correta() {
	WebElement radio2 = driver.findElement(By.id("selectgold"));
	radio2.click();
}

@Quando("clica no botão ir para a pagina de informaçoes da cota")
public void clica_no_botão_ir_para_a_pagina_de_informaçoes_da_cota() {
	 driver.findElement(By.id("sendquote")).click();
}

@Então("deve ir para a página de Seleção de Cota")
public void deve_ir_para_a_página_de_seleção_de_cota() {
	String msgValidacao = driver.findElement(By.className("idealsteps-step-active")).getText();
	Assert.assertEquals("Send Quote",msgValidacao  );
}

@Dado("que o usuário se encontra na aba de Informações de Cota")
public void que_o_usuário_se_encontra_na_aba_de_informações_de_cota() {
    driver.get(" http://sampleapp.tricentis.com/101/app.php");
	driver.findElement(By.id("sendquote")).click();
    
}

@Quando("preenche todos os dados de cota de forma correta")
public void preenche_todos_os_dados_de_cota_de_forma_correta() {
	driver.findElement(By.id("email")).sendKeys("danizzo@uol.com.br");
	driver.findElement(By.id("phone")).sendKeys("991863230");
	driver.findElement(By.id("username")).sendKeys("testecase");
	driver.findElement(By.id("password")).sendKeys("feature10");
	driver.findElement(By.id("confirmpassword")).sendKeys("feAture10");
	driver.findElement(By.id("Comments")).sendKeys("Este é um caso de teste de Sellenium para o projeto individual");
}

@Quando("clica no botão de envio")
public void clica_no_botão_de_envio() {
	driver.findElement(By.id("sendemail")).click();
}

@Então("deve enviar com sucesso e mostrar a mensagem de confirmação")
public void deve_enviar_com_sucesso_e_mostrar_a_mensagem_de_confirmação() {
	String msgValidacao = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
	Assert.assertEquals("Sending e-mail success!",msgValidacao  );
	
	
}

@After
public void encerra() {
	driver.quit();
}

}