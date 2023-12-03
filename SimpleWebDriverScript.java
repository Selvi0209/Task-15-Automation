import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebDriverScript {

    public static void main(String[] args) {
        //=== Set the path to the ChromeDriver executable ===//
        System.setProperty("webdriver.chrome.driver", "D:\\Selvi\\Java Prac\\chromedriver_win32\\chromedriver.exe");

        //=== Create a new instance of the ChromeDriver ===//
        WebDriver driver = new ChromeDriver();

        try {
            //=== Open Google
            driver.get("https://www.google.com");

            //=== Find the search input field using its name attribute value ("q" is the name attribute for Google's search input) ===//
            driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");

            //=== Press Enter to perform the search ===//
            driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

            //=== Print the title of the search result page ===//
            System.out.println("Page Title: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //=== Close the browser ===//
            driver.quit();
        }
    }
}
