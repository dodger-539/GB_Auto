package HW_GB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("http://automationpractice.com");
        WebElement search = webDriver.findElement(By.name("search_query"));
        search.sendKeys("шуба");
        webDriver.findElement(By.name("submit_search")).click();
        webDriver.findElement(By.linkText("Women")).click();

        Actions actions = new Actions(webDriver);

       //actions.moveToElement(webDriver.findElement(By.linkText("Women")));
       actions.moveToElement(webDriver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']"))).click();



        Thread.sleep(20000);
        webDriver.quit();

    }
}
