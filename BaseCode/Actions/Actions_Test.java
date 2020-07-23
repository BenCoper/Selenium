package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actions_Test {
    public static void main(String[] args) throws Exception{
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.w3school.com.cn/tiy/t.asp?f=html5_draganddrop");

        //拖拽元素
        WebElement ele = driver.findElement(By.cssSelector("drag1"));

        //拖拽目标元素
        WebElement div1 = driver.findElement(By.id("div1"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(ele,div1).build().perform();

        WebElement dragged = driver.findElement(By.id("drag1"));
        WebElement dropped = driver.findElement(By.id("div1"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(dragged, dropped).perform();

        Thread.sleep(2000);



    }
}
