import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver","G:\\work\\Ana_test_180903\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.top10bestdatingsites.co.uk/");
//      driver.wait.until(
//      );


        WebElement SiteLogoComponent = driver.findElement(By.cssSelector("[data-ni-auto-type=SiteLogoComponent]"));
        List<WebElement> rowList = driver.findElements(By.tagName("tr"));
//       WebElement FreeImageFeature = rowList.get(0).findElement(By.cssSelector("[data-ni-auto-type=FreeImageFeature]"));
        //remove table header
        rowList.remove(0);
        for (WebElement freeImageFeature : rowList) {
            freeImageFeature.findElement(By.cssSelector("[data-ni-auto-type=FreeImageFeature]"));
            System.out.println(freeImageFeature.getTagName());
        }


        driver.quit();
    }
}
