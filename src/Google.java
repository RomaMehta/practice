import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\Browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();
    }
}
