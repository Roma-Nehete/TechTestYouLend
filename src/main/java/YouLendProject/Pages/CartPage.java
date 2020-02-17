package YouLendProject.Pages;

import YouLendProject.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.DecimalFormat;


public class CartPage extends Utils {

    private static DecimalFormat df2 = new DecimalFormat("#.##");


    private By _cartPageHeading = By.xpath("//*[@id=\"columns\"]/div[1]/span[2]");
    private By _cart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    private By _blouseAttHover = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/div/div[2]/a");
    private By _blousePriceHover = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/div/span");
    private By _blouseAttSummary = By.xpath("//*[@id=\"product_2_9_0_270822\"]/td[2]/small[2]/a");
    private By _blousePriceSummary = By.id("total_product_price_2_9_270822");
    private By _tShirtAttHover = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[2]/div/div[2]/a");
    private By _tShirtPriceHover = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt[2]/div/span");
    private By _tShirtAttSummary = By.xpath("//*[@id=\"product_1_1_0_270822\"]/td[2]/small[2]/a");
    private By _tShirtPriceSummary = By.id("total_product_price_1_1_270822");
    private By _totalProductSummary = By.id("total_product");
    private By _shippingPrice = By.id("total_shipping");
    private By _totalPriceToPaySummary = By.id("total_price");
    private By _proceedToCheckoutButton = By.linkText("Proceed to checkout");

    public void verifyCartPage() {

        String ExpectedCartPageHeading = getText(_cartPageHeading);
        String cartPageHeading = "Your shopping cart";
        Assert.assertEquals(ExpectedCartPageHeading, cartPageHeading);

    }


    public void verifyTheFirstItemPriceAndSelectedSize(){
        hoverOverElement(_cart);
        String ExpectedBlouseAttCart = getText(_blouseAttHover);
        String ExpectedBlousePriceCart = getText(_blousePriceHover);
        String ActualBlouseAttSummary = getText(_blouseAttSummary).replace("Color : ","").replace(" Size :","");
        String ActualBlousePriceSummary = getText(_blousePriceSummary);
        Assert.assertEquals(ActualBlousePriceSummary,ExpectedBlousePriceCart);
        Assert.assertEquals(ActualBlouseAttSummary,ExpectedBlouseAttCart);

     }

     public void verifyTheSecondItemPriceAndSize(){
         hoverOverElement(_cart);
         String ExpectedTshirtAttCart = getText(_tShirtAttHover);
         String ExpectedTshirtPriceCart = getText(_tShirtPriceHover);
         String ActualTshirtAttSummary = getText(_tShirtAttSummary).replace("Color : ","").replace(" Size :","");
         String ActualTshirtPriceSummary = getText(_tShirtPriceSummary);
         Assert.assertEquals(ActualTshirtPriceSummary,ExpectedTshirtPriceCart);
         Assert.assertEquals(ActualTshirtAttSummary,ExpectedTshirtAttCart);

     }

     public void verifyTotalPriceOfTheTwoItems(){
        String PriceOfBlouse = getText(_blousePriceSummary).replace("$","");
        double PriceOfBlouseNum = Double.parseDouble(PriceOfBlouse);
        String PriceOfTshirt = getText(_tShirtPriceSummary).replace("$","");
         double PriceOfTshirtNum = Double.parseDouble(PriceOfTshirt);

         double TotalProductPriceNum = Double.parseDouble(df2.format(PriceOfBlouseNum + PriceOfTshirtNum ));
         String TotalProduct = ("$"+(TotalProductPriceNum));
         String TotalProductSummary = getText(_totalProductSummary);
         Assert.assertEquals(TotalProduct,TotalProductSummary);
     }

     public void verifyTotalAmountToBePaid(){
        scrollIntoView(_totalProductSummary);
        String TotalProduct = getText(_totalProductSummary).replace("$","");
        double TotalProductNum = Double.parseDouble(TotalProduct);
        String ShippingPrice = getText(_shippingPrice).replace("$","");
        double ShippingPriceNum = Double.parseDouble(ShippingPrice);
        double TotalPriceToPayNum = Double.parseDouble(df2.format(TotalProductNum + ShippingPriceNum));
        String TotalPriceToPay = ("$"+(TotalPriceToPayNum));
        String TotalPriceToPaySummary = getText(_totalPriceToPaySummary);
         Assert.assertEquals(TotalPriceToPay,TotalPriceToPaySummary);

     }

     public void clickOnProceedToCheckout(){
        clickOnElement(_proceedToCheckoutButton);
     }


}
