package Windows;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinTest {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();

        //targetPosition作为一个参数传入
        //浏览器位置在何处显示
        Point targetPosition = new Point(500,1000);
        driver.manage().window().setPosition(targetPosition);
        System.out.println(driver.manage().window().getPosition());

        //浏览器窗口大小和获取窗口大小
        Dimension targetSize = new Dimension(1920,1080);
        driver.manage().window().setSize(targetSize);
        System.out.println(driver.manage().window().getSize());

        driver.get("https://www.baidu.com");

        //快捷键F11全屏显示
        driver.findElement(By.tagName("body")).sendKeys(Keys.F11);

        driver.close();
    }
}
