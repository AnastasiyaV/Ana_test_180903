import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver","G:\\work\\Ana_test_180903\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.top10bestdatingsites.co.uk/");
        driver.quit();
    }
}
