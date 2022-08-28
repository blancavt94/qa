import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    /**Locators**/
    By byHomeSalesLogo = By.xpath("//div[@id='homepage-slider']");
    By byContactUsButton = By.xpath("//div[@id='contact-link']/a[contains(text(),'Contact us')]");
    final String CONTACT_US = "//div[@id='contact-link']/a[contains(text(),'Contact us')]";
    By bysignInButton = By.xpath("//div[@class='header_user_info']/a[@contains(text(),'Sign in')]");

    /** Inicializar driver de la pagina **/
    public HomePage(WebDriver driver){
        super(driver);
    }

    /** Actions **/
    public boolean validateHomeLogoIsDisplayed(){
        WebElement homeSalesLogo = driver.findElement(byHomeSalesLogo);
        return homeSalesLogo.isDisplayed();
    }

    public void clickContactUs(){
        System.out.println("Click en contactanos");
        WebElement contactUsButton = driver.findElement(By.xpath(CONTACT_US));
        contactUsButton.click();
    }

    public void clickSignIn(){
        WebElement signInButton = driver.findElement(bysignInButton);
        signInButton.click();
    }
}
