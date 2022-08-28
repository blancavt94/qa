import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {

    By byEmailField= By.xpath("//input[@id='email_create']");
    By byCreateAccountButton = By.xpath("//button[@id='SubmitCreate']");

    public SignInPage(WebDriver driver){
        super(driver);
    }

    public void writeEmail(String email){
        System.out.println("Llenado de email");
        WebElement emailField = driver.findElement(byEmailField);
        emailField.sendKeys(email);
    }

    public void clickCreateNewAccount(){
        System.out.println("Click en crear cuenta");
        WebElement createAccountButton = driver.findElement(byCreateAccountButton);
        createAccountButton.click();
    }

}
