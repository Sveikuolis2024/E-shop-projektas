package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Base {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[value='bags']")
    private WebElement CategoryBags;
    @FindBy(css = "[data-testid='base-product']")
    private List<WebElement> itemsNamesList;

    @FindBy(xpath = ("//*[contains(text(), 'T-Shirts')]"))
    private WebElement CategoryTShirt;
    @FindBy(xpath = "//*[contains(text(), 'Classic Unisex T-Shirt')]")
    private WebElement classicUnisexTShirtText;
    @FindBy(css ="input[type= 'checkbox']")
    private WebElement TypeOfWomenFilter;
    @FindBy(xpath = ("//span[contains(text(), \"Men's\")]"))
    private WebElement TypeOfMensFilter;
    @FindBy(xpath = ("//*[contains(text(), 'Unisex')]"))
    private WebElement ItemsWithUnisexText;
    @FindBy(css = ".css-gvhiif")
    private WebElement ViewMoreProductsButton;
    @FindBy(css = ".ProductCard_root__HqXTt")
    private List<WebElement> productInfo;
    @FindBy(css = "#filter-panel-header-category")
    private WebElement filterCategoryList;
    @FindBy(css = "#filter-panel-header-type")
    private WebElement filterTypeList;


    public void selectBagsFromCategory() {
        CategoryBags.click();
    }

    public void selectTShirt() {
        CategoryTShirt.click();
    }

    public String getTshirtText() {
        return classicUnisexTShirtText.getText();
    }

    public String getBagsText(int numberOfText) {
        return itemsNamesList.get(numberOfText -1).getText();
    }
    public void selectTypeOfWomen(){
        TypeOfWomenFilter.click();
    }
    public void selectTypeOfMENS(){
        TypeOfMensFilter.click();
    }
    public String isSelectedItemsWithUnisexDisplayed(int numberOfText){
        return itemsNamesList.get(numberOfText -1).getText();
    }
    public void clickViewMoreProductsButton(){
        ViewMoreProductsButton.click();
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