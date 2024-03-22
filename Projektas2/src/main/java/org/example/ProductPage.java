package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage extends Base{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//li[normalize-space()='Classic Unisex T-Shirt']")
    private WebElement productNameFromSelectedItem;
    @FindBy(xpath = "//h3[normalize-space()='The cool couple']")
    private WebElement h3TittleOfProduct;
    @FindBy(css = "span[data-testid='product-price']")
    private WebElement productPrice;
    @FindBy(css = "button[title='White']")
    private WebElement colorWhiteButton;
    @FindBy(css = "button[title='Sport Grey']")
    private WebElement colorSportGreyButton;
    @FindBy(xpath = "//p[normalize-space()='Select size']")
    private WebElement productShowsSize;
    @FindBy(css = ".gap-4 .Button_root__G_l9X")
    private List<WebElement> chooseSizeFromList;
    @FindBy(css = ".MuiFormControl-root.css-13sljp9")
    private WebElement productQuantity;
    @FindBy(xpath = "//li[normalize-space()='3']")
    private WebElement productQuantity3;
    @FindBy(xpath = "//button[normalize-space()='Buy now']")
    private WebElement buttonBuyNow;
    @FindBy(css = ".css-paipmi")
    private WebElement productType;
    @FindBy(xpath = "//li[normalize-space()='Ladies Slim T-Shirt']")
    private WebElement productTypeOfLadies;
    @FindBy(xpath = "//*[contains(text(), 'Ladies Slim T-Shirt')] ")
    private WebElement productTypeOfLadiesByText;
    @FindBy(css = "img[alt='Product Image']")
    private WebElement productImage;
    @FindBy(css = "button[aria-label='Add to cart']")
    private WebElement buyNowButton;
    @FindBy(xpath = "//a[normalize-space()='Proceed to Secure Checkout']")
    private WebElement proceedToSecureCheckoutButton;
    @FindBy (css = ".text-red")
    private WebElement textComesRedWhenSizeIsEmpty;

    public String getTittleOfProduct(){
        return h3TittleOfProduct.getText();
    }
    public String getProductPrice(){
        return productPrice.getText();
    }
    public String getButtonWhiteColor(){
        return colorWhiteButton.getCssValue("background-color");
    }
//    String buttonColor = driver.findElement(By.name("submit")).getCssValue("background-color");
    public String getButtonSportGreyColor(){
        return colorSportGreyButton.getCssValue("background-color");
    }
    public String getProductShowsSize(){
        return productShowsSize.getText();
    }
    public String getChooseSizeFromList(int numberOfSize){
       return chooseSizeFromList.get(numberOfSize - 1).getText();
    }
    public void selectSizeFromList(int numberOfSize){
        chooseSizeFromList.get(numberOfSize -1).click();
    }
    public boolean isProductQuantityDisplayed(){
        return productQuantity.isDisplayed();
    }
    public boolean isButtonBuyNowDisplayed(){
        return buttonBuyNow.isDisplayed();
    }
    public void selectProductType(){
        productType.click();
    }
    public void selectProductTypeOfLadies(){
        productTypeOfLadies.click();
    }
    public String getProductTypeOfLadiesByText(){
        return productTypeOfLadiesByText.getText();
    }
    public void selectProductColor(){
        colorWhiteButton.click();
    }
    public void clickProductQuantity(){ //clickProductQuantity() ir  selectProductQuantity3() sujungti i viena
        productQuantity.click();
    }
    public void selectProductQuantity3(){
        productQuantity3.click();
    }
    public boolean productImageDisplayed(){
        return productImage.isDisplayed();
    }
    public void clickBuyNowButton(){
        buyNowButton.click();
    }
    public void clickProceedToSecureCheckoutButton(){
        proceedToSecureCheckoutButton.click();
    }
    public boolean proceedToSecureCheckoutButtonDisplayed(){
        return proceedToSecureCheckoutButton.isDisplayed();
    }
    public boolean textComesRedWhenSizeIsEmptyIsDisplayed(){
        return textComesRedWhenSizeIsEmpty.isDisplayed();
    }
}
