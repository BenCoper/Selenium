package Handles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Hand {
    public static void main(String[] args) {
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        driver.findElement(By.linkText("新闻")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        driver.close();
        driver.quit();
    }
}
