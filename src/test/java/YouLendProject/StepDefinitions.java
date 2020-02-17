package YouLendProject;

import YouLendProject.Pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    WomenShoppingPage womenShoppingPage = new WomenShoppingPage();
    CartPage cartPage = new CartPage();
    AddressTabPage addressTabPage = new AddressTabPage();
    ShippingTabPage shippingTabPage = new ShippingTabPage();
    PaymentPageTab paymentPageTab = new PaymentPageTab();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();

    @Given("^User is on Homepage$")
    public void user_is_on_Homepage(){

        homePage.goToLoginPage();
    }

    @Given("^logged into their account using their credentials$")
    public void logged_into_their_account_using_their_credentials(){
        loginPage.inputLoginCredentials();
        loginPage.clickOnSignInButton();

    }

    @When("^User clicks on Women Tab$")
    public void user_clicks_on_Women_Tab() {
        myAccountPage.goToWomenSection();
    }

    @When("^clicks on Quick View for the \"([^\"]*)\"$")
    public void clicks_on_Quick_View_for_the(String arg1) {
        womenShoppingPage.getBlouseDress(arg1);
    }

    @When("^changes the size of the dress to \"([^\"]*)\"$")
    public void changes_the_size_of_the_dress_to(String arg1) {
        womenShoppingPage.changeSize(arg1);
    }

    @When("^Adds it to the Cart$")
    public void adds_it_to_the_Cart() {
        womenShoppingPage.addToCartFirstItem();

    }

    @When("^clicks on Continue shopping$")
    public void clicks_on_Continue_shopping(){
        womenShoppingPage.continueShopping();

    }

    @When("^User clicks on Quick View for the \"([^\"]*)\"$")
    public void user_clicks_on_Quick_View_for_the(String arg1) {
        womenShoppingPage.getTshirt(arg1);

    }

    @When("^Adds it to the cart and closes the Quick View$")
    public void adds_it_to_the_cart_and_closes_Quick_View() {
        womenShoppingPage.addToCartSecondItemAndCloseQuickView();

    }

    @When("^User clicks on Cart$")
    public void user_clicks_on_Cart(){
        womenShoppingPage.clickOnCart();

    }

    @Then("^User should be directed to Cart summary page$")
    public void user_should_be_directed_to_Cart_summary_page(){
        cartPage.verifyCartPage();

    }

    @Then("^User should see the selected dresses with correct sizes and prices in the cart$")
    public void user_should_see_the_selected_dresses_with_correct_sizes_and_prices_in_the_cart() {
        cartPage.verifyTheFirstItemPriceAndSelectedSize();
        cartPage.verifyTheSecondItemPriceAndSize();


    }

    @Then("^the total amount for the two dresses should be correct$")
    public void the_total_amount_for_the_two_dresses_should_be_correct() {
        cartPage.verifyTotalPriceOfTheTwoItems();

    }

    @Then("^Total amount to be paid should equals Total Products amount plus Shipping charges$")
    public void total_amount_to_be_paid_should_equals_Total_Products_amount_plus_Shipping_charges() {
        cartPage.verifyTotalAmountToBePaid();

    }

    @When("^User clicks on Proceed to Checkout$")
    public void user_clicks_on_Proceed_to_Checkout() {
        cartPage.clickOnProceedToCheckout();

    }

    @When("^Confirms the address and agrees to the Terms of Service on Address and Shipping page$")
    public void confirms_the_address_and_agrees_to_the_Terms_of_Service_on_Address_and_Shipping_page()  {
        addressTabPage.clickOnProceedToCheckOut();
        shippingTabPage.clickOnTermsOfService();
        shippingTabPage.clickOnProceedToCheckout();

    }

    @When("^User clicks on Pay by Bank Wire on Payment page$")
    public void user_clicks_on_Pay_by_Bank_Wire_on_Payment_page() {
        paymentPageTab.clickOnPayByBankWire();

    }

    @When("^clicks on I Confirm my order$")
    public void clicks_on_I_Confirm_my_order() {
        paymentPageTab.clickOnConfirmOrder();

    }

    @Then("^Order confirmation page should be displayed$")
    public void order_confirmation_page_should_be_displayed() {
        orderConfirmationPage.verifyOrderIsSuccessful();

    }

    @Then("^User Signs Out$")
    public void user_Signs_Out() {
        orderConfirmationPage.clickOnSignOut();

    }

    @Given("^selects the \"([^\"]*)\" colour$")
    public void selects_the_colour(String arg1)  {
        womenShoppingPage.selectBlueColour(arg1);

    }

    @Then("^User should see the dress with the selected colour$")
    public void user_should_see_the_dress_with_the_selected_colour(){
        womenShoppingPage.verifyTshirtAtt();
        womenShoppingPage.closeQuickView();


    }


}
