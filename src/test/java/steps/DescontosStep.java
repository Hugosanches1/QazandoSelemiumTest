package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DescontosStep {

    WebDriver driver = new FirefoxDriver();

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws Throwable {
        //System.setProperty("webdriver.gecko.driver","geckodriver.exe");
       // driver = new FirefoxDriver();
        driver.get("https://qazando.com.br/curso.html");
    }

    @Quando("^preencho meu e-mail$")
    public void preencho_meu_e_mail() throws Throwable {

    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws Throwable {

    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() throws Throwable {

    }
}
