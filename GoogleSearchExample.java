import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchExample {

    public static void main(String[] args) {
        //=== Set the path to the ChromeDriver executable ===//
        System.setProperty("webdriver.chrome.driver", "D:\\Selvi\\Java Prac\\chromedriver_win32\\chromedriver.exe");

        //=== Create a new instance of the ChromeDriver ===//
        WebDriver driver = new ChromeDriver();

        try {
            //=== Open Google homepage ===//
            driver.get("https://www.google.com");

            //=== Find the search input field using its name attribute value ("q" is the name attribute for Google's search input) ===//
            WebElement searchBox = driver.findElement(By.name("q"));

            //=== Type "Selenium Browser Driver" into the search box ===//
            searchBox.sendKeys("Selenium Browser Driver");

            //=== Press Enter to perform the search ===//
            searchBox.sendKeys(Keys.RETURN);

            //=== Wait for a while to see the search results (you might need to implement a more robust waiting strategy) ===//
            Thread.sleep(5000); //=== Note: Using sleep for demonstration purposes, not recommended in real-world scenarios ===//

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
