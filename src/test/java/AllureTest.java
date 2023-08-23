import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test1(){
        Assert.assertTrue(false);
    }

    @Test
    public void test2(){
        Assert.assertTrue(true);
    }

}
