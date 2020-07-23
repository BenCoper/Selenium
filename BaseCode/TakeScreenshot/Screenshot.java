package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.sun.deploy.cache.Cache.copyFile;

public class Screenshot {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.baidu.com");

        Thread.sleep(1000);

        // 调用截图方法
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            // 拷贝截图文件到我们项目./images
            copyFile(src, new File("BaseCode\\images\\test.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }

}