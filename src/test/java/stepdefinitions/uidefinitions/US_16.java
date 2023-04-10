package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_16 {
    ContactPage contactPage = new ContactPage();
    @Given("Kullanici viceDean olarak login olur")
    public void kullanici_vice_dean_olarak_login_olur() {
        ReusableMethods.login(ConfigReader.getProperty("viceDeanUserName"), ConfigReader.getProperty("viceDeanPassword"));
    }

    @Given("Kullanici Contact butonuna tiklar")
    public void kullanici_contact_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
        ReusableMethods.doubleClick(contactPage.contactButton);
    }

    @And("Kullanici Your Name textboxini  gecerli yourname bilgisini girer")
    public void kullaniciYourNameTextboxiniGecerliYournameBilgisiniGirer() {
        Faker faker=new Faker();
        String name = faker.name().name();
        contactPage.yourNameTextbox.sendKeys(name);
    }

    @And("Kullanici Your Mail textboxini  gecerli mailini girer")
    public void kullaniciYourMailTextboxiniGecerliMailiniGirer() {
        Faker faker1=new Faker();
        String lastName = faker1.internet().emailAddress();
        contactPage.yourEmailTextbox.sendKeys(lastName);
    }


    @Given("Kullanici Subject textboxini doldurur")
    public void kullanici_subject_textboxini_doldurur() {
        contactPage.subjectTextbox.sendKeys("konumuz bu");
    }

    @Given("Kullanici Message textboxini doldurur")
    public void kullanici_message_textboxini_doldurur() {
        contactPage.messageTextbox.sendKeys("mesaj olarak bisey bulamadim");
    }

    @Given("Kullanici Send Message butonuna tiklar")
    public void kullanici_send_message_butonuna_tiklar() throws InterruptedException {
        ReusableMethods.JSEClickToElement(contactPage.sendMessageButton);
    }

    @Given("Kullanici basarili giris yapildigini dogrular")
    public void kullanici_basarili_giris_yapildigini_dogrular() {
        Assert.assertTrue("Successfully mesaji goruldu",contactPage.successfullyToastify.isDisplayed());
    }

    @Given("Kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        ReusableMethods.JSEClickToElement(contactPage.menuButton);
    }

    @Given("Kullanici Contact Get All butonuna tiklar.")
    public void kullanici_contact_get_all_butonuna_tiklar() {
        ReusableMethods.JSEClickToElement(contactPage.contactGetAllButton);
    }

    @Given("Kullanici gonderen kisi isminin Name sutununda goruntulendigini dogrular")
    public void kullanici_gonderen_kisi_isminin_name_sutununda_goruntulendigini_dogrular() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("document.body.style.zoom = '50%'");
        ReusableMethods.JSEClickToElement(contactPage.goToLastPage);
    }

    @Given("Kullanici gonderen kisinin mailinin Email sutununda goruntulendigini dogrular")
    public void kullanici_gonderen_kisinin_mailinin_email_sutununda_goruntulendigini_dogrular() {

    }

    @Given("Kullanici mesajin gonderilme tarinini Date sutununda goruntulendigini dogrular")
    public void kullanici_mesajin_gonderilme_tarinini_date_sutununda_goruntulendigini_dogrular() {

    }

    @Given("Kullanici mesajin konusunun Subject sutununda goruntulendigini dogrular")
    public void kullanici_mesajin_konusunun_subject_sutununda_goruntulendigini_dogrular() {

    }

    @Given("Kullanici mesajin Message sutununda goruntulendigini dogrular")
    public void kullanici_mesajin_message_sutununda_goruntulendigini_dogrular() {

    }


}