import org.example.Base;
import org.example.HomePage;
import org.example.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingHomeAndProductPage extends Setup {
    Base base;
    HomePage homePage;
    ProductPage productPage;

    @Test
    void userCanSelectOnly1ProductByCategory() {
        base = new Base(driver);
        homePage = new HomePage(driver);
//        homePage.selectTShirtFromCategory();
        homePage.selectTShirt();
        Assertions.assertTrue(homePage.isTshirtDisplayed());
        homePage.selectBagsFromCategory();
        Assertions.assertFalse(homePage.isBagsDisplayed());
    }

    @Test
    void userCanSelectProductsByType() {
        base = new Base(driver);
        homePage = new HomePage(driver);
        homePage.selectTypeOfWomen1();
        homePage.selectTypeOfMENS();
        Assertions.assertTrue(homePage.isSelectedItemsWithUnisexDisplayed());
    }

    @Test
    void userCanSeeMoreProductsOnASinglePage() throws InterruptedException {
        base = new Base(driver);
        homePage = new HomePage(driver);
        homePage.clickViewMoreProductsButton();
        Thread.sleep(1000);
        Assertions.assertEquals(24, homePage.getProductInfoCount());
    }

    @Test
    void userCanReduceAndExtendCategoryFilterList() {
        base = new Base(driver);
        homePage = new HomePage(driver);
        Assertions.assertEquals("true", homePage.reduceExtendFilterCategoryList());
        homePage.selectFilterCategoryList();
        Assertions.assertEquals("false", homePage.reduceExtendFilterCategoryList());
    }

    @Test
    void userCanReduceAndExtendTypeFilterList() {
        base = new Base(driver);
        homePage = new HomePage(driver);
        Assertions.assertEquals("true", homePage.reduceExtendFilterTypeList());
        homePage.selectFilterTypeList();
        Assertions.assertEquals("false", homePage.reduceExtendFilterTypeList());
    }

    @Test
    void userCanNavigateToProductDetailsPage() {
        base = new Base(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.selectTShirt();
        homePage.clickProductInfo(1);
        Assertions.assertEquals("The cool couple", productPage.getTittleOfProduct());
    }

    @Test
    void userCanSeeInformationAboutTheProduct() {
        base = new Base(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.selectTShirt();
        homePage.clickProductInfo(1);
        Assertions.assertEquals("€24.99", productPage.getProductPrice());
        Assertions.assertEquals("rgba(255, 255, 255, 1)", productPage.getButtonWhiteColor());
        Assertions.assertEquals("Select size", productPage.getProductShowsSize());
        Assertions.assertEquals("S", productPage.getChooseSizeFromList(1));
        Assertions.assertEquals("M", productPage.getChooseSizeFromList(2));
        Assertions.assertEquals("L", productPage.getChooseSizeFromList(3));
        Assertions.assertEquals("XL", productPage.getChooseSizeFromList(4));
        Assertions.assertEquals("2XL", productPage.getChooseSizeFromList(5));
        Assertions.assertTrue(productPage.isProductQuantityDisplayed());
        Assertions.assertTrue(productPage.productImageDisplayed());
        Assertions.assertTrue(productPage.isButtonBuyNowDisplayed());


    }

    //    maximize window
    @Test
    void userSeeSelectedInformationInProductDetailsPage() throws InterruptedException {
        base = new Base(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.selectTShirt();
        homePage.clickProductInfo(1);
        productPage.selectProductType();
        productPage.selectProductTypeOfLadies();
        Thread.sleep(1000);
        Assertions.assertEquals("Ladies Slim T-Shirt", productPage.getProductTypeOfLadiesByText());
        productPage.selectProductColor();
        Assertions.assertEquals("rgba(241, 241, 247, 1)", productPage.getButtonWhiteColor());
        productPage.selectSizeFromList(2);
        Thread.sleep(1000);
        Assertions.assertEquals("M", productPage.getChooseSizeFromList(2));
        productPage.clickProductQuantity();
        Thread.sleep(1000);
        productPage.selectProductQuantity3();
//        System.out.println(productPage.getChooseSizeFromList(2));
//
    }

    @Test
    void userAddProductToTheCart() throws InterruptedException {
        base = new Base(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.selectTShirt();
        homePage.clickProductInfo(1);
        productPage.selectProductType();
        productPage.selectProductTypeOfLadies();
        Thread.sleep(1000);
        productPage.selectProductColor();
        productPage.selectSizeFromList(2);
        Thread.sleep(1000);
        productPage.clickProductQuantity();
        Thread.sleep(1000);
        productPage.selectProductQuantity3();
        productPage.clickBuyNowButton();
        Thread.sleep(2000);
        Assertions.assertTrue(productPage.proceedToSecureCheckoutButtonDisplayed());

    }

    @Test
    void userDoesNotSelectSize() throws InterruptedException {
        base = new Base(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.selectTShirt();
        homePage.clickProductInfo(1);
        productPage.selectProductType();
        productPage.selectProductTypeOfLadies();
        Thread.sleep(1000);
        productPage.selectProductColor();
        Thread.sleep(1000);
        productPage.clickProductQuantity();
        Thread.sleep(1000);
        productPage.selectProductQuantity3();
        productPage.clickBuyNowButton();
        Assertions.assertTrue(productPage.textComesRedWhenSizeIsEmptyIsDisplayed());
    }
}