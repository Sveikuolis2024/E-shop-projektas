package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Base{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[contains(text(), 'The cool couple')] ")
    private WebElement productTittle;
    @FindBy(xpath = "//*[contains(text(), 'Ladies Slim T-Shirt')] ")
    private WebElement productName;

    @FindBy(xpath = "//*[@data-testid='cart-size' and text()='M']")
    private WebElement productSizeM;
//    private WebElement productSizeM;
//    pagal atributa ir teksta, kad tekste yra M.


    public String productTittleText(){
        return productTittle.getText();
    }
    public String productNameText(){
        return productName.getText();
    }
    public String productSizeMText(){
        return productSizeM.getText();
    }





}
