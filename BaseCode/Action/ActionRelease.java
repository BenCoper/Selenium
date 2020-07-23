package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionRelease {
    public static void main(String[] args){
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.baidu.com/duty/");

        //定义第一段文字
        WebElement Sting_Sected = driver.findElement(By.xpath("//*[@id=\"aboutToShow\"]/main/ul[1]/li[2]"));
        System.out.println(Sting_Sected);

        //定义第二段文字
        WebElement String_Second = driver.findElement(By.xpath("//*[@id=\"aboutToShow\"]/main/ul[1]/li[4]"));
        System.out.println(String_Second);

        Actions action = new Actions(driver);
        action.clickAndHold(Sting_Sected).moveToElement(String_Second).perform();
        action.release();

    }
}
