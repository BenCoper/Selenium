package Frist_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.get("http://www.baidu.com");

        String title = driver.getTitle();

        System.out.println(title);

        assert title.equals("百度一下,你就知道");

        driver.close();
    }
}
