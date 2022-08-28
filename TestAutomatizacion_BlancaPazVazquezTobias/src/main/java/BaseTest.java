import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver ;



    @BeforeMethod
    public void setUp(){
        //Declaracion e instanciar variable del driver
        System.out.println("Inicializando driver");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Abrir pagina ");
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void waitForNSeconds(int secs){
        try {
            Thread.sleep(secs*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
