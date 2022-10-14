package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumberTeste;


public class DescontosStep extends RunCucumberTeste {

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws Throwable {

        driver.get("https://qazando.com.br/curso.html");

        Assert.assertEquals("Não acessou a aplicação",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    @Quando("^preencho meu e-mail$")
    public void preencho_meu_e_mail() throws Throwable {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("hugosanches1@hotmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws Throwable {
        driver.findElement(By.cssSelector("#button")).click();
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() throws Throwable {
        String cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();

        Assert.assertEquals("Cupom não é o esperado!","QAZANDO15OFF",cupom);

    }
}
