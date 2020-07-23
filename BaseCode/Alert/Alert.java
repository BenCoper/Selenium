package Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alert {
    public static void main(String[] args) throws Exception{
        //必备四件套
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://news.cyol.com/node_60799.htm");

        String text = driver.switchTo().alert().getText();
        System.out.println(text);

        Thread.sleep(5000);

//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().sendKeys("青少年心理行业推荐行动网络投票环节旨在提升青少年心理行业在社会领域的影响力和关注度，同时也借此机会为行业同仁建立一个网络交流展示平台，促进交流和互动。但因为本次推荐行动为行业内有史以来首次全行业覆盖全国各省市的大型活动，尚有不足之处。为保证活动的公平和公正，坚决杜绝刷票机构以盈利为目的的刷票行为，一经发现立即取消参评资格。现获悉有个别机构以主办单位的名义帮助刷票，望各单位避免上当受骗。\n");


        Thread.sleep(5000);
    }
}
