package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicaçcao(){
        driver.get("https://qazando.com.br/curso.html");
        espearElementoEstarPresente(By.id("btn-ver-cursos"),10);
        Assert.assertEquals("Não acessou a aplicação",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 10000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Erro no tenpo de espera...");
            e.printStackTrace();
        }
    }
    public void preencherEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void clicarEmGanharDesconto(){
        driver.findElement(By.cssSelector("#button")).click();
    }

    public void verificarCupomDesconto(String cupom){
        String cupom1 = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("Cupom não é o esperado!",cupom,cupom1);
    }
}
