package Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class robot {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.baidu.com");

        Thread.sleep(1000);

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

        try{
            ImageIO.write(image,"png",new File("BaseCode\\images\\test1.png"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
