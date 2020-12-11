import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");


        WebElement name = driver.findElement(By.id("name"));

        // to scroll to the element we have to create an object actions to move to "name" element
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Paulina WOW");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("09.12.2020");

        driver.quit();
    }
}
