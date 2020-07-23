package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar_Input {
    public static void Run_Web() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");
        WebElement date_inputbox = driver.findElement(By.id("datepicker"));
        date_inputbox.sendKeys("08/17/2017");

        driver.get("http://jqueryui.com/resources/demos/selectmenu/default.html");

        // 点击选中速度这个下拉菜单
        driver.findElement(By.xpath("//*[@id='speed-button']")).click();
        // 一个节点下所有的option选项
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='speed-menu']/li/div"));

        for (WebElement ele : list){

            String innerHTML = ele.getAttribute("innerHTML");
            System.out.println(innerHTML);

            if(ele.getAttribute("innerHTML").equals("Fast")){
                ele.click();
                break;
            }
        }


    }
    public static void main(String[] args) {
        Run_Web();
    }
}
