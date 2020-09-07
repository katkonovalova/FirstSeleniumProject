import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowserTest {
    WebDriver wd;

    //init (run browser, open site, login)
    @BeforeTest
    public void setUp(){
        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://www.google.com");
    }
    //test
    @Test
    public void searchTest(){
        System.out.println("Google.com opened");
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("Selenium WebDriver"+ Keys.ENTER);

    }
    @Test
    public void clickOnEnter(){
        wd.findElement(By.id("gb_70")).click();


    }
    //stop
    @AfterClass(enabled = false)
    public void tearDown(){
        wd.quit();
    }

}
