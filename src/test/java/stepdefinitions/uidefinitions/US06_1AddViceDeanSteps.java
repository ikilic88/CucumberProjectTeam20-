
package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ViceDeanManagement;


public class US06_1AddViceDeanSteps {
    ViceDeanManagement viceDeanManagement;
    Faker faker=new Faker();


    @Given("Kullanici  Name kismina valid deger girer")
    public void kullanici_name_kismina_valid_deger_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.name.sendKeys(faker.name().firstName());


    }

    @Then("Kullanici basariyla Vice Dean ekleyebildigini dogrular.")
    public void kullanici_basariyla_vice_dean_ekleyebildigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.saveSuccesfullyMessage.isDisplayed();


    }


















}
