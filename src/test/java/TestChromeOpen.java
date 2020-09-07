
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChromeOpen {
    ChromeDriver wd;


    @Test
    public void testChrome(){
        wd = new ChromeDriver();
       // wd.get("https://www.google.com");
        wd.navigate().to("https://www.google.com");

    }
}
