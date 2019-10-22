import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.Test;


public class
test {
    @Test
    public void main() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");// chromedriver服务地址
        WebDriver driver = new ChromeDriver(); // 新建一个WebDriver 的对象，但是new 的是谷歌的驱动
        String url = "http:/mail.163.com";
        //driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get(url); // 打开指定的网站
        driver.manage().window().maximize();

        /**
        driver.findElement(By.linkText("新闻")).click();
        System.out.printf("now acess %s \n",driver.getCurrentUrl());
        Thread.sleep(1000);

        //back
        driver.navigate().back();
        System.out.printf("now acess %s \n",driver.getCurrentUrl());
        Thread.sleep(1000);

        //foward
        driver.navigate().forward();
        System.out.printf("now acess %s \n",driver.getCurrentUrl());
        Thread.sleep(1000);
        **/

        /**
        WebElement search_text=driver.findElement(By.id("kw"));
        WebElement search_btn=driver.findElement(By.id("su"));

        search_text.sendKeys("html");
        Thread.sleep(2000);
        search_text.clear();
        Thread.sleep(2000);
        search_text.sendKeys("web");
        search_text.submit();
        Thread.sleep(1000);
         **/
        /**
        WebElement setting=driver.findElement(By.linkText("设置"));
        Actions action=new Actions(driver);
        action.clickAndHold(setting).perform();
        Thread.sleep(3000);
         **/
        /**
        //显示等待
        WebDriverWait wait=new WebDriverWait(driver,10,1);

        wait.until(new ExpectedCondition<WebElement>() {
            @NullableDecl
            @Override
            public WebElement apply(@NullableDecl WebDriver text) {
                return text.findElement(By.id("kw"));
            }
        }).sendKeys("web");
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        **/
        /**
        //隐式等待
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("web");

        driver.manage().timeouts().setScriptTimeout(2,TimeUnit.SECONDS);
        **/
        /**
        //定位一组元素
        driver.findElement(By.id("kw")).sendKeys("web");
        driver.findElement(By.id("su")).click();

        Thread.sleep(3000);
        List<WebElement> search_result=driver.findElements(By.xpath("//div/div/h3"));
        System.out.println(search_result.size());

        for (WebElement result:search_result) {
            System.out.println(result.getText());
        }
        **/
        /**
        //SELECT框
        driver.findElement(By.linkText("设置")).click();
        driver.findElement(By.linkText("搜索设置")).click();
        Thread.sleep(2000);

        WebElement el=driver.findElement(By.xpath("//*[@id=\"nr\"]"));
        Select sel=new Select(el);
        sel.selectByValue("20");
        Thread.sleep(2000);
         **/
        /**
        //alert框
        driver.findElement(By.linkText("设置")).click();
        driver.findElement(By.linkText("搜索设置")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("prefpanelgo")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
         **/
        driver.findElement(By.id("switchAccountLogin")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='loginDiv']/iframe")));
        driver.findElement(By.name("email")).sendKeys("hc9188hahaha");
        driver.findElement(By.name("password")).sendKeys("CPTBTPTP");
        driver.findElement(By.id("dologin")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='btnbox']/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='dvNavContainer']/nav/div[1]/ul/li[2]")).click();

        driver.findElement(By.xpath("//*[@aria-label='收件人地址输入框，请输入邮件地址，多人时地址请以分号隔开']"))
                .sendKeys("hc9188hahaha@163.com");
        driver.findElement(By.xpath("//*[@aria-label='邮件主题输入框，请输入邮件主题']/input"))
                .sendKeys("aaa");
        driver.findElement(By.xpath("//*[@title=\"一次可发送2000张照片，600首MP3，一部高清电影\"]/input"))
                .sendKeys("C:\\Users\\m1861\\Desktop\\1.txt");
        driver.switchTo().frame(driver.findElement(By.className("APP-editor-iframe")));
        driver.findElement(By.xpath("/html/body")).sendKeys("aaa");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[text()='发送']")).click();
        Thread.sleep(5000);
        boolean bl=driver.findElement(By.xpath("//*[text()='发送成功']")).isDisplayed();
        System.out.println("This the new test");
        Assert.assertTrue(bl);





        /**
        driver.findElement(By.linkText("登录")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"tang-pass-footerBar\"]/p[text()=\"用户名登录\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys("sky_25");
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys("HC380054wo");
        Thread.sleep(3000);
        driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
         **/
        Thread.sleep(5000);
        driver.quit();
    }

}
