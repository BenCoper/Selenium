package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Element_8 {
    public static void main(String[] args) throws Exception {

        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        //By.id定位
        WebElement kw = driver.findElement(By.id("kw"));
        kw.sendKeys("Java Selenium");
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        kw.clear();
        Thread.sleep(2000);

        //Link定位
        driver.findElement(By.linkText("新闻")).click();
        Thread.sleep(2000);
        //判断url链接是否符合需求
        assert driver.getCurrentUrl().equals("http://news.baidu.com");

        //xpath定位
        driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("Java Selenium");
        driver.findElement(By.xpath(".//*[@id='su']")).click();

        //ClassName定位
        driver.findElement(By.className("s_ipt")).sendKeys("Java Selenium");
        //class中含有空格报错 selector class name not permitted  换一种定位方式
        driver.findElement(By.className("bg s_btn_wr")).click();

        //name定位
        driver.findElement(By.name("wd")).sendKeys("Java");
        driver.findElement(By.id("su")).click();

        //PartialLink  用LinkText里面的一部分字符就可以定位该元素
        //正常情况下是把百度设为主页  前提是当前文字为唯一的否则会定位不到
        driver.findElement(By.partialLinkText("设为主页")).click();
    }
}
