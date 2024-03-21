package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Base {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //    @FindBy(css = "input[value='tshirt']")
//    private WebElement selectTshirtFromCategory;
    @FindBy(css = "input[value='bags']")
    private WebElement selectBagsFromCategory;

    @FindBy(xpath = ("//*[contains(text(), 'T-Shirts')]"))
    private WebElement selectTShirt;
    @FindBy(css ="input[type= 'checkbox']")
    private WebElement selectTypeOfWomen;
    @FindBy(xpath = ("//span[contains(text(), \"Men's\")]"))
    private WebElement selectTypeOfMens;
    @FindBy(xpath = ("//*[contains(text(), 'Unisex')]"))
    private WebElement selectedItemsWithUnisex;
    @FindBy(css = ".css-gvhiif")
    private WebElement clickViewMoreProductsButton;
    @FindBy(css = ".ProductCard_root__HqXTt")
    private List<WebElement> productInfo;
    @FindBy(css = "#filter-panel-header-category")
    private WebElement filterCategoryList;
    @FindBy(css = "#filter-panel-header-type")
    private WebElement filterTypeList;





//    @FindBy(xpath = "(//span[normalize-space()=\"Men's\"])[1]")
//    private WebElement
//    List<WebElements> elementsList =  driver.findElements(By.cssSelector(".facetContainerDiv"));
//for(WebElement checkBox:elementsList) {
//        int i=0;
//        checkBox = elementsList.get(i);

    //    public void selectTShirtFromCategory(){
//        selectTshirtFromCategory.click();
//    }
    public void selectBagsFromCategory() {
        selectBagsFromCategory.click();
    }

    public void selectTShirt() {
        selectTShirt.click();
    }

    public boolean isTshirtDisplayed() {
        return selectTShirt.isDisplayed();
    }

    public boolean isBagsDisplayed() {
        return selectBagsFromCategory.isDisplayed();
    }
    public void selectTypeOfWomen1(){
        selectTypeOfWomen.click();
    }
    public void selectTypeOfMENS(){
        selectTypeOfMens.click();
    }
    public boolean isSelectedItemsWithUnisexDisplayed(){
        return selectedItemsWithUnisex.isDisplayed();
    }
    public void clickViewMoreProductsButton(){
        clickViewMoreProductsButton.click();
    }
    public int getProductInfoCount(){
        return productInfo.size();
    }
    public void clickProductInfo(int numberOfProduct){
        productInfo.get(numberOfProduct - 1).click();
    }
    public void selectFilterCategoryList(){
        filterCategoryList.click();
    }
    public String reduceExtendFilterCategoryList(){
        return filterCategoryList.getAttribute("aria-expanded");
    }
    public void selectFilterTypeList(){
        filterTypeList.click();
    }
    public String reduceExtendFilterTypeList(){
        return filterTypeList.getAttribute("aria-expanded");
    }

}