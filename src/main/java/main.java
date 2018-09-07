import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.top10bestdatingsites.co.uk/");

        //div[@data-ni-auto-type="FreeImageFeature"]
        //div[@data-ni-auto-type="FreeTextFeature"]
        //div[@class="user-ratings-wrapper"]//input
        //div[@class="partner-score"]
        //div[@data-ni-auto-type="ProductLinkFeature"]//a
        //span[@class="bb-ribbon-content"]
        //div[@data-ni-auto-type="LatestArticlesWidgetComponent"]
        //div[@data-ni-auto-type="TitleComponent"]
        //div[@data-ni-auto-type="PromotionWidgetComponent"]//a[contains(@data-product-id,.)]

//        find elements on page:
//        driver.get("http://boost.qa03.corp.naturalint.com/sites/15/widgets");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //input[@type="search"]                     //widget name drop down box
        //li[@class="ui-select-choices-group"]      //items in drop down box (the options)
        //button[@data-ni-auto-id="open-editor-btn"]//"click to edit " button
        //button[@class="btn btn-sm red"]           //"delete Widget" button
        //button[@class="btn btn-sm green-haze"] and //i[contains("Add Widget",.)] // ?????? "add widget" button

//        create new Cross site widget and in the editor find the elements:
        //input[@data-ni-auto-id="widget-title"]    // title text box
        //input[@type="checkbox"]and //label[contains("Link Odd Boxes to Product Links:",.)]// enable tracking checkbox //??????
        //li//a[contains(.,"Settings")]// settings tab (OR //li//a[contains(text(),"Settings")])
        //input[@id="componentName"]// widget name


        WebElement SiteLogoComponent = driver.findElement(By.cssSelector("[data-ni-auto-type=SiteLogoComponent]"));
        List<WebElement> rowList = driver.findElements(By.xpath("//tr[not(contains(@class, 'head')) and //div[@data-ni-auto-type='FreeImageFeature']]"));
        for (WebElement element:rowList ) {
            List<WebElement> elements = element.findElements(By.tagName("td"));
            for (WebElement tdEement : elements ) {
                System.out.println(tdEement.getAttribute("title"));
                System.out.println(tdEement.getText());
                System.out.println(tdEement.getAttribute("data-score"));
            }

        }
//        List<WebElement> freeTextFeatureList = driver.findElements(By.xpath("//tr[not(contains(@class, 'head')) and //div[@data-ni-auto-type='FreeTextFeature']]"));
//        List<WebElement> ratingValue = driver.findElements(By.xpath("//div[@itemprop='aggregateRating'] and //div[@class='rankit']"));
//        System.out.println(ratingValue);


        driver.quit();
    }
}
