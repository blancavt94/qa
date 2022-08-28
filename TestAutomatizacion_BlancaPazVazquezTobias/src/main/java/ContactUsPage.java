import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage{

    By byContactUsLabel = By.xpath("//div[@id='center_column']/h1[contains(text(),'Customer service - Contact us')]");
    By bySubjectFieldDropdown = By.xpath("//select[@id='id_contact']");
    By byEmailField= By.xpath("//input[@id='email']");
    By byOrderReferenceEmail = By.xpath("//input[@id='id_order']");
    By byEmailMessageField = By.xpath("//textarea[@id='message']");
    By bySendButton = By.cssSelector("button#submitMessage");
    By byAlertMessageSuccess = By.xpath("//p[contains(text(),'Your message has been successfully sent')]");

    public ContactUsPage(WebDriver driver){
        super(driver);
    }

    public boolean validateContactUsLabel(){
        System.out.println("Validar que estamos en la pagina de contactanos");
        WebElement contactUsLabel = driver.findElement(byContactUsLabel);
        return contactUsLabel.isDisplayed();
    }

    public void clickSubjectDropdown(){
        System.out.println("Click en  asunto");
        WebElement subjectFieldDropdown = driver.findElement(bySubjectFieldDropdown);
        subjectFieldDropdown.click();
    }

    public void selectSubjectDropdown(String subjectOption){
        System.out.println("Seleccionar Asunto");
        Select subjectDropdown = new Select(driver.findElement(bySubjectFieldDropdown));
        subjectDropdown.selectByVisibleText(subjectOption);
    }

    public void writeEmailAddress(String email){
        System.out.println("Llenado de email");
        WebElement emailField = driver.findElement(byEmailField);
        emailField.sendKeys(email);
    }

    public void writeOrderReference(String orderReference){
        //Llenado de orden de referencia
        System.out.println("Llenado de orden de referencia");
        WebElement orderReferenceField = driver.findElement(byOrderReferenceEmail);
        orderReferenceField.sendKeys(orderReference);
    }

    public void writeEmailMessage(String messageEmail){
        //Llenado de mensaje
        System.out.println("Llenado mensaje");
        WebElement mensaje = driver.findElement(byEmailMessageField);
        mensaje.sendKeys(messageEmail);
    }

    public void clickSend(){
        //Click en enviar
        System.out.println("Click en enviar");
        WebElement sendButton = driver.findElement(bySendButton);
        sendButton.click();
    }

    public boolean validateSentMessageSuccessful(){
        System.out.println("Validar mensaje enviado correctamente");
        WebElement messageAlertSuccess = driver.findElement(byAlertMessageSuccess);
        return messageAlertSuccess.isDisplayed();
    }

}
