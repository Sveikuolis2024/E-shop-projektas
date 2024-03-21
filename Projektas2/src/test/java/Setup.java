import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Setup {
    WebDriver driver;
    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://demostore.shop/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
    }
}
