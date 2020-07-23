package Element;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Element_Test {
    public static void main(String[] args) {
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://blog.csdn.net/");

        //定位推荐列的Java
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div/ul/li[5]/a")).click();
        //link定位学院点击
        driver.findElement(By.linkText("学院")).click();
        //id定位到创作中心你
        driver.findElement(By.id("blogClick")).click();
        //class定位到登陆注册
        driver.findElement(By.className("userinfo")).click();
        //输入账号密码
        driver.findElement(By.id("all")).sendKeys("18784448286@163.com");
        driver.findElement(By.id("password-number")).sendKeys("131421yu");
        //点击登陆按钮 css
        driver.findElement(By.cssSelector(".btn-primary")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[5]/ul"));
        for (WebElement element : elements) System.out.println(element.getText());


    }
}
