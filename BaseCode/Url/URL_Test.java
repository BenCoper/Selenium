package Url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class URL_Test {
    public static void main(String[] args) {
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);

        driver.close();
    }
}
