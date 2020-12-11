import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        // define new variable
        String originalHandle = driver.getWindowHandle();

        //  focus on the second tab that's open
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        // switching back to the original window
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
