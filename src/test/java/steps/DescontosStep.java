package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws Throwable {
        homePage.acessarAplicaçcao();
    }

    @Quando("^preencho meu e-mail$")
    public void preencho_meu_e_mail() throws Throwable {
        homePage.scrollDown();
        homePage.preencherEmail("hugosanches1@hotmail.com");
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws Throwable {
        homePage.clicarEmGanharDesconto();
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() throws Throwable {
        homePage.verificarCupomDesconto("QAZANDO15OFF");

    }

    @Dado("^que tenho cupom gerado$")
    public void que_tenho_cupom_gerado() throws Throwable {
        homePage.acessarAplicaçcao();
        homePage.scrollDown();
        homePage.preencherEmail("hugosanches1@hotmail.com");
        homePage.clicarEmGanharDesconto();

    }

    @Quando("^eu falho$")
    public void eu_falho() throws Throwable {
        driver.findElement(By.xpath("asasas")).click();
    }
}
