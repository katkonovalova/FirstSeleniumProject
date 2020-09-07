import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsTest {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().maximize();

    }
    @Test
    public void testLocator(){
        wd.get("https://www.gov.il/");

        String str = wd.findElement(By.id("SearchInput")).getAttribute("maxlength");
        System.out.println(str);

        String tag = wd.findElement(By.name("query")).getTagName();
        System.out.println(tag);

        wd.findElement(By.className("small-txt-search")).sendKeys("thhjghjgjg");

        System.out.println(wd.findElement(By.id("tm-1")).getText());
        String txt = wd.findElement(By.id("tm-1")).getText();
        System.out.println(txt);

      //  wd.findElement(By.linkText(""));
      //  wd.findElement(By.cssSelector("")).sendKeys("");

    }




    @AfterClass

    public void tearDown(){
        wd.quit();
    }
}
