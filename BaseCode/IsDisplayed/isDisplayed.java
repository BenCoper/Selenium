package IsDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.net.ftp.FtpClient;

import java.util.concurrent.TimeUnit;

public class isDisplayed {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        driver.findElement(By.xpath("//*[@id=\"u1\"]/a[2]")).click();
        driver.findElement(By.id("TANGRAM__PSP_11__footerULoginBtn")).click();
        driver.findElement(By.id("TANGRAM__PSP_11__userName")).sendKeys("abc");
        driver.findElement(By.id("TANGRAM__PSP_11__password")).sendKeys("123456");
        driver.findElement(By.id("TANGRAM__PSP_11__submit")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//*[@id=\"vcode-close461\"]")).click();
        driver.findElement(By.id("TANGRAM__PSP_11__submit")).click();

        String text = driver.findElement(By.xpath("")).getText();
        assert "请输入验证码".equals(text);
    }
}
