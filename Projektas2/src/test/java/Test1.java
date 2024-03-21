import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    WebDriver driver;
    @BeforeEach
    void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://demostore.shop/");
    }
    @Test
    void firstTest(){
        driver.findElement(By.xpath("//h1[normalize-space()='Welcome']")).isDisplayed();
    }
}

