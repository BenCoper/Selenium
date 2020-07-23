package TimeOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageLoad {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        Thread.sleep(1);

        driver.close();
    }
}
