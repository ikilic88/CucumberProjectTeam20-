@US07
Feature: Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir.Dean mesajları silebilmelidir.

Background: Dean get all sayfasina gider
Given Kullanici Dean olarak login olur.
Then Basariyla Dean girisi yaptigini  dogrular.
  When Kullanici acilan sayfada menu kismina tiklar
When Menuden contact get all u tiklar

  Scenario: TC01 Mesajlar Dean tarafindan gorulebilmeli
    Then Dean hesabiyla mesajlarin gorulebildigini dogrular


    Scenario: TC02 Mesaj gonderen kisiler gorulebilmeli
      Then Kullanici dean hesabiyla mesaj gonderen kisilerin goruldugunu dogrular


      Scenario: TC03 Mesaj gonderenlerin mailleri gorulebilmeli
        Then Kullanici dean hesabiyla mesaj gonderen kisilerin maillerinin goruldugunu dogrular


        Scenario: TC04 Mesajlarin tarihi gorulmeli
          Then Kullanici dean hesabiyla gonderilen mesajlarin tarihlerinin  goruldugunu dogrular


          Scenario: TC05 Mesajlarin subjecti gorulmeli
          Then Kullanici dean hesabiyla gonderilen mesajlarin subjectlerinin goruldugunu dogrular



