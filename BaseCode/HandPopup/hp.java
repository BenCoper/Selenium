package HandPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class hp {
    public static void main(String[] args) {

        // 创建DesiredCapabilities类的一个对象实例
        DesiredCapabilities cap=DesiredCapabilities.chrome();

        // 设置变量ACCEPT_SSL_CERTS的值为True
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://kyfw.12306.cn/otn");


    }

}
