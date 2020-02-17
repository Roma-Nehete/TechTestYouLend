$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserJourney.feature");
formatter.feature({
  "line": 1,
  "name": "User journey from placing order to payment",
  "description": "",
  "id": "user-journey-from-placing-order-to-payment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8611628000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logged into their account using their credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Homepage()"
});
formatter.result({
  "duration": 2428728700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.logged_into_their_account_using_their_credentials()"
});
formatter.result({
  "duration": 1724633200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the placement of order and the correct payment",
  "description": "",
  "id": "user-journey-from-placing-order-to-payment;verify-the-placement-of-order-and-the-correct-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User clicks on Women Tab",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "clicks on Quick View for the \"Blouse\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "changes the size of the dress to \"M\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Adds it to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks on Continue shopping",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Quick View for the \"Faded Short Sleeve T-shirts\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Adds it to the cart and closes the Quick View",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on Cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be directed to Cart summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User should see the selected dresses with correct sizes and prices in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the total amount for the two dresses should be correct",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Total amount to be paid should equals Total Products amount plus Shipping charges",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User clicks on Proceed to Checkout",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Confirms the address and agrees to the Terms of Service on Address and Shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User clicks on Pay by Bank Wire on Payment page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "clicks on I Confirm my order",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Order confirmation page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Signs Out",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Women_Tab()"
});
formatter.result({
  "duration": 2465164700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 30
    }
  ],
  "location": "StepDefinitions.clicks_on_Quick_View_for_the(String)"
});
formatter.result({
  "duration": 543307200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 34
    }
  ],
  "location": "StepDefinitions.changes_the_size_of_the_dress_to(String)"
});
formatter.result({
  "duration": 1551376200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.adds_it_to_the_Cart()"
});
formatter.result({
  "duration": 1649184000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicks_on_Continue_shopping()"
});
formatter.result({
  "duration": 78853100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.user_clicks_on_Quick_View_for_the(String)"
});
formatter.result({
  "duration": 348123500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.adds_it_to_the_cart_and_closes_Quick_View()"
});
formatter.result({
  "duration": 3406124400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Cart()"
});
formatter.result({
  "duration": 2775934600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_should_be_directed_to_Cart_summary_page()"
});
formatter.result({
  "duration": 51904100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_should_see_the_selected_dresses_with_correct_sizes_and_prices_in_the_cart()"
});
formatter.result({
  "duration": 833961800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.the_total_amount_for_the_two_dresses_should_be_correct()"
});
formatter.result({
  "duration": 98596700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.total_amount_to_be_paid_should_equals_Total_Products_amount_plus_Shipping_charges()"
});
formatter.result({
  "duration": 141897500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Proceed_to_Checkout()"
});
formatter.result({
  "duration": 2273345100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.confirms_the_address_and_agrees_to_the_Terms_of_Service_on_Address_and_Shipping_page()"
});
formatter.result({
  "duration": 4902830500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Pay_by_Bank_Wire_on_Payment_page()"
});
formatter.result({
  "duration": 1193845200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicks_on_I_Confirm_my_order()"
});
formatter.result({
  "duration": 2427295700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.order_confirmation_page_should_be_displayed()"
});
formatter.result({
  "duration": 44897200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_Signs_Out()"
});
formatter.result({
  "duration": 2288884300,
  "status": "passed"
});
formatter.after({
  "duration": 279100,
  "status": "passed"
});
formatter.before({
  "duration": 7776629200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logged into their account using their credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Homepage()"
});
formatter.result({
  "duration": 1775841800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.logged_into_their_account_using_their_credentials()"
});
formatter.result({
  "duration": 1703045600,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify the colour of the dress purchased",
  "description": "",
  "id": "user-journey-from-placing-order-to-payment;verify-the-colour-of-the-dress-purchased",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User clicks on Women Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User clicks on Quick View for the \"Faded Short Sleeve T-shirts\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "selects the \"Orange\" colour",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Adds it to the Cart",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should see the dress with the selected colour",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_on_Women_Tab()"
});
formatter.result({
  "duration": 2159271000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.user_clicks_on_Quick_View_for_the(String)"
});
formatter.result({
  "duration": 399222200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Orange",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.selects_the_colour(String)"
});
formatter.result({
  "duration": 1491846800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.adds_it_to_the_Cart()"
});
formatter.result({
  "duration": 2175173500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_should_see_the_dress_with_the_selected_colour()"
});
formatter.result({
  "duration": 82092600,
  "error_message": "java.lang.AssertionError: expected [Orange, M] but found [Blue, S]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat YouLendProject.Pages.WomenShoppingPage.verifyTshirtAtt(WomenShoppingPage.java:69)\r\n\tat YouLendProject.StepDefinitions.user_should_see_the_dress_with_the_selected_colour(StepDefinitions.java:151)\r\n\tat ✽.Then User should see the dress with the selected colour(UserJourney.feature:34)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?id_category\u003d3\u0026controller\u003dcategory");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 912802300,
  "status": "passed"
});
});