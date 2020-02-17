Feature: User journey from placing order to payment

  Background:
    Given User is on Homepage
    And logged into their account using their credentials

@Test

    Scenario: Verify the placement of order and the correct payment
      When User clicks on Women Tab
      And clicks on Quick View for the "Blouse"
      And changes the size of the dress to "M"
      And Adds it to the Cart
      And clicks on Continue shopping
      And User clicks on Quick View for the "Faded Short Sleeve T-shirts"
      And Adds it to the cart and closes the Quick View
      And User clicks on Cart
      Then User should be directed to Cart summary page
      And User should see the selected dresses with correct sizes and prices in the cart
      And the total amount for the two dresses should be correct
      And Total amount to be paid should equals Total Products amount plus Shipping charges
      When User clicks on Proceed to Checkout
      And Confirms the address and agrees to the Terms of Service on Address and Shipping page
      And User clicks on Pay by Bank Wire on Payment page
      And clicks on I Confirm my order
      Then Order confirmation page should be displayed
      And User Signs Out
@Test
  Scenario: Verify the colour of the dress purchased
    Given User clicks on Women Tab
    And User clicks on Quick View for the "Faded Short Sleeve T-shirts"
    And selects the "Orange" colour
    And Adds it to the Cart
    Then User should see the dress with the selected colour








