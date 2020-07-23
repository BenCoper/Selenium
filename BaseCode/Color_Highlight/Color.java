package Color_Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Color {

        public static void main(String[] args) throws Exception {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            driver.get("https://www.baidu.com/");

            Thread.sleep(2000);

            // 点击登录
            driver.findElement(By.xpath("//*[@id=\"u1\"]/a[2]")).click();
            driver.findElement(By.id("TANGRAM__PSP_11__footerULoginBtn")).click();
            Thread.sleep(500);

            WebElement username = driver.findElement(By.id("TANGRAM__PSP_11__userName"));

            // 创建一个JavascriptExecutor对象
            JavascriptExecutor js= (JavascriptExecutor)driver;

            username.sendKeys("abcdefg");
            // 设置颜色
            js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",username);

            WebElement password = driver.findElement(By.id("TANGRAM__PSP_11__password"));
            js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",password);


        }
    }