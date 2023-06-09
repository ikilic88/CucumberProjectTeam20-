@us12
Feature: Vice Dean öğretmene ders atayabilmelidir.

Background:
  Given Kullanici viceDean olarak login olur.
  And Basariyla viceDean girisi yaptigini dogrular.


  Scenario: TC-1 Ders programı oluşturulmalıdır. (US_10)


    Given Kullanici Menu butonuna tiklar
    And Kullanici Lesson Program Bolumune tiklar
    And Kullanıcı Choose Lesson bölümünden ders seçer.
    And  Kullanıcı Chose Lesson yazısının altındaki listeden bir ders seçer
    And  Kullanıcı Choose Date yazısının altındaki takvimden bir gün seçer
    And Kullanıcı Choose Education Term kısmından bir dönem seçer
    And  Kullanıcı Start Time alanına bir saat girer
    And Kullanıcı Stop Time alanına bir saat girer
    And   Kullanici submit tusuna tiklarf
    And Kullanici giriş yaptığını doğrulamak için Created Lesson Program yazısını ekranda görür
    Then close driver

  Scenario: TC-2 Lesson Program Assignment altında TC-1'de oluşturulan dersin geldiği görülmelidir.


    Given Kullanici Menu butonuna tiklar
    And Kullanici Lesson Program Bolumune tiklar
    And Kullanıcı Lesson Program Assignment başlığının altında ilhanlılar tarihi yazısını görür
    And Kullanıcı day altında FRIDAY yazısını görür
    And Kullanıcı Start Time altında 01:00 yazısını görür
    And Kullanıcı 02:00 yazısını görür.
    Then close driver

    Scenario: TC-3 Ders için öğretmen seçilebilmelidir.


     Given Kullanici Menu butonuna tiklar
      And Kullanici Lesson Program Bolumune tiklar
      And Kullanıcı Lesson Program Assignment başlığının altında ilhanlılar tarihi yazısını görür
      And Kullanıcı day altında FRIDAY yazısını görür
      And Kullanıcı Start Time altında 01:00 yazısını görür
      And Kullanıcı 02:00 yazısını görür.
      And Kullanıcı bu bilgilerin olduğu satırdaki kutucuğa tıklar
      And Kullanıcı Choose Teacher bölümüne tıklar ve öğretmenini seçer
      And Kullanıcı submit butonuna tıklarf
      And Lesson Added the Teacher yazısı ekranda çıkar
      Then close driver

  Scenario: TC-4 Ders seçilemeden öğretmene ders atanamaz.


    Given Kullanici Menu butonuna tiklar
    And Kullanici Lesson Program Bolumune tiklar
    And Kullanıcı Choose Teacher bölümüne tıklar ve öğretmenini seçer
    And Kullanıcı submit butonuna tıklarf
    And Lesson Added the Teacher yazısı ekranda çıkmaz
    Then close driver

    Scenario: TC-5 Öğretmen seçilmeden öğretmene ders atanamaz.


      Given Kullanici Menu butonuna tiklar
      And Kullanici Lesson Program Bolumune tiklar
    And Kullanıcı Lesson Program Assignment başlığının altında ilhanlılar tarihi yazısını görür
    And Kullanıcı day altında FRIDAY yazısını görür
    And Kullanıcı Start Time altında 01:00 yazısını görür
    And Kullanıcı 02:00 yazısını görür.
    And Kullanıcı bu bilgilerin olduğu satırdaki kutucuğa tıklar
     And Kullanıcı submit butonuna tıklarf
     And Lesson Added the Teacher yazısı ekranda çıkmaz
      Then close driver


