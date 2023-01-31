Feature: Login Test


  Scenario: Getir Login Test
    Given The user open the getir application and enters "hello@getir.com" and "hello"
    Then  The user login successfully


  #Go to basket and verify that it is empty
  #go to items list and print all list and verify that size is 12
  #Go to second category and add two different items
  #Go back the hope page
  #Go to basket again
  #Verify that how many items in the basket
  @wip
  Scenario: Getir basket test
    Given The user open the getir application and enters "hello@getir.com" and "hello"
    Then  The user login successfully
    And   The user verify that basket is empty and able to see "There is no result"
    And   The user able to see all menu list in console and verify that ise size is 12
    And   The user clicks second category which is "Atıştırmalık"
    And   The user add two items
    And   The user scroll down to "Ürün 13"
    And   The user add two items
    And   The user go to basket
    Then  The user verify that "Total Amount : 84 ₺"




