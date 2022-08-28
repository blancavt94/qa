import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoGoogle {

    @Test
    public void loginInvalidCredentials()  {
        //Declaracion e instanciar variable del driver
        System.out.println("Inicializando Driver");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //ChromeOptions op = new ChromeOptions();
        //op.addArguments("--incognito");
        WebDriver driver = new ChromeDriver();

        //Abrir Pagina
        System.out.println("Abrir Pagina DemoQA");
        driver.navigate().to("https://demoqa.com/login");

        //Escribir usuario
        System.out.println("Escribiendo Usuario");
        WebElement input_username = driver.findElement(By.id("userName"));
        input_username.sendKeys("Test_Victor");

        System.out.println("Escribiendo Password");
        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys("Test1234");

        System.out.println("Click en boton Login");
        WebElement login_button = driver.findElement(By.cssSelector("button[id='login']"));
        login_button.click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Validar mensaje de error de login");
        WebElement warning_invalid_message = driver.findElement(By.xpath("//p[contains(text(),'Invalid username or password!')]"));
        Assert.assertTrue(warning_invalid_message.isDisplayed());

        //driver.close();
        //driver.quit();

    }

    @Test
    public void createNewUser(){
        System.out.println("Inicializando Driver");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Abrir Pagina
        System.out.println("Abrir Pagina DemoQA");
        driver.navigate().to("https://demoqa.com/login");

        System.out.println("Generar Nuevo Usuario");
        WebElement new_user_button = driver.findElement(By.xpath("//button[@id='newUser']"));
        new_user_button.click();

    }




    @Test
    public void openEdge(){
        //Declaracion e instanciar variable del driver
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver");
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("https://www.google.com");

    }

}
