import org.example.Base;
import org.example.CheckoutPage;
import org.example.HomePage;
import org.example.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingCheckoutPage extends Setup {
    Base base;
    HomePage homePage;
    ProductPage productPage;
    CheckoutPage checkoutPage;
    @BeforeEach
    void setup2() throws InterruptedException{
        base = new Base(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        checkoutPage= new CheckoutPage(driver);
        homePage.selectTShirt();
        homePage.clickProductInfo(1);
        productPage.selectProductType();
        productPage.selectProductTypeOfLadies();
        Thread.sleep(1000);
        productPage.selectProductColor();
        productPage.selectSizeFromList(2);
        Thread.sleep(1000);
        productPage.clickProductQuantity(3);
        productPage.clickBuyNowButton();
        Thread.sleep(2000);
        productPage.clickProceedToSecureCheckoutButton();
        Thread.sleep(2000);
    }
    @Test
    void userSeeOrderSummaryOnTheCheckoutPage() throws InterruptedException {
        base = new Base(driver);
        checkoutPage= new CheckoutPage(driver);
        Assertions.assertEquals("The cool couple", checkoutPage.productTittleText());
        Assertions.assertEquals("Ladies Slim T-Shirt", checkoutPage.productNameText());
        Assertions.assertEquals("M", checkoutPage.productSizeMText());
    }
}
