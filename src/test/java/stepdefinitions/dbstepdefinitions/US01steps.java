package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utilities.DBUtils.insertDataIntoTable;

public class US01steps {
    List<Object> userNameList = new ArrayList<>();



    @Then("Database ile bağlantı kesilir.")
    public void database_ile_baglanti_kesilir() {
      DBUtils.closeConnectionAndStatement();
    }

    @Given("Database icin contact saglanir")
    public void database_icin_contact_saglanir() {
        DBUtils.createConnection();
    }



   }
