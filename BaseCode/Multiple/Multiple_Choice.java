package Multiple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Multiple_Choice {
    public static void main(String[] args) throws Exception {
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.sojump.com/m/2792226.aspx/");

        //单选
//        ArrayList<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@id=\"div5\"]/div[2]/div[1]/span/a"));
//
//        for (WebElement ele : elements) {
//                ele.click();
//                Thread.sleep(5000);
//            System.out.println(elements);
//        }

        ArrayList<WebElement> answer_options = (ArrayList<WebElement>) driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));


        for(WebElement ele : answer_options){
            ele.click();
            Thread.sleep(1000);
        }
    }
}
