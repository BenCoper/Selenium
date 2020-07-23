package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class action {
    public static void main(String[] args) throws Exception {
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://10.2.150.109/file?token=a4BmVnAzz2FlaHFhsDlwZUcAtdEnT-FErY8U3ljCJJU.3NJHOOg08-DCW6EMTF5gx9CEEdF1jceNRv-u3gj0GdQ");

        WebElement indexFileNew = driver.findElement(By.id("indexFileNew"));

        Actions actions = new Actions(driver);
        Actions move = actions.moveToElement(indexFileNew);
        move.perform();

        Thread.sleep(5000);
        driver.findElement(By.linkText("本地加载")).click();
    }
}
