package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.baidu.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.aishu.cn/");
        Thread.sleep(2000);

        //后退
        driver.navigate().back();
        Thread.sleep(2000);

        //前进
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();

    }
}
