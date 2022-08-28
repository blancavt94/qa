import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    By byFirstNameField= By.xpath("//input[@id='customer_firstname']");
    By byLastNameField= By.xpath("//input[@id='customer_lastname']");
    By byContraseñaField= By.xpath("//input[@id='passwd']");
    //By byAdressFirstNameField= By.xpath("//input[@id='firstname']");
    //By byAddressLastNameField= By.xpath("//input[@id='lastname']");
    By byAdress= By.xpath("//input[@id='adress1']");
    By byCity= By.xpath("//input[@id='city']");
    By byStateFieldDropdown = By.xpath("//select[@id='id_state']");
    By byCP= By.xpath("//input[@id='postcode']");
    //By byCountryFieldDropdown = By.xpath("//select[@id='id_country']");
    By byMobilePhone= By.xpath("//input[@id='phone_mobile']");
    By byAddressFutureReference= By.xpath("//input[@id='alias']");
    By byRegisterButton = By.xpath("//button[@id='submitAccount']");
    By byAlertCreateSuccess = By.xpath("//h1[contains(text(),'My account')]");

    public CreateAccountPage(WebDriver driver){
        super(driver);
    }

    //PERSONAL INFORMATION

    //first name
    public void writeCustomerFirstName(String cFirstName){
        System.out.println("Llenado de Nombre");
        WebElement cFirstNameField = driver.findElement(byFirstNameField);
        cFirstNameField.sendKeys(cFirstName);
    }

    //last name
    public void writeCustomerLastName(String cLastName){
        System.out.println("Llenado de Apellido");
        WebElement cLastNameField = driver.findElement(byLastNameField);
        cLastNameField.sendKeys(cLastName);
    }

    //password
    public void writeCustomerPassword(String cPassword){
        System.out.println("Llenado de Contraseña");
        WebElement cPasswordField = driver.findElement(byContraseñaField);
        cPasswordField.sendKeys(cPassword);
    }


    //ADDRESS

    //First name
    //public void writeAddressFirstName(String aFirstName){
    //    System.out.println("Llenado de Nombre Direccion");
    //    WebElement aFirstNameField = driver.findElement(byAdressFirstNameField);
    //    aFirstNameField.sendKeys(aFirstName);
    //}

    //last name
    //public void writeAddressLastName(String aLastName){
    //    System.out.println("Llenado de Apellido Direccion");
    //    WebElement aLastNameField = driver.findElement(byAddressLastNameField);
    //    aLastNameField.sendKeys(aLastName);
    //}

    //address
    public void writeAddress(String direccion){
        System.out.println("Llenado de direccion");
        WebElement adressField = driver.findElement(byAdress);
        adressField.sendKeys(direccion);
    }

    //city
    public void writeCity(String ciudad){
        System.out.println("Llenado de ciudad");
        WebElement cityField = driver.findElement(byCity);
        cityField.sendKeys(ciudad);
    }

    //state combo
    public void clickStateDropdown(){
        System.out.println("Click en  estado");
        WebElement stateFieldDropdown = driver.findElement(byStateFieldDropdown);
        stateFieldDropdown.click();
    }

    public void selectStateDropdown(String stateOption){
        System.out.println("Seleccionar estado");
        Select stateDropdown = new Select(driver.findElement(byStateFieldDropdown));
        stateDropdown.selectByVisibleText(stateOption);
    }

    //postal code
    public void writeCP(String cp){
        System.out.println("Llenado de codigo postal");
        WebElement codeField = driver.findElement(byCP);
        codeField.sendKeys(cp);
    }

    //country combo
    /*public void clickCountryDropdown(){
        System.out.println("Click en  Country");
        WebElement countryFieldDropdown = driver.findElement(byCountryFieldDropdown);
        countryFieldDropdown.click();
    }

    public void countryStateDropdown(String countryOption){
        System.out.println("Seleccionar Country");
        Select countryDropdown = new Select(driver.findElement(byCountryFieldDropdown));
        countryDropdown.selectByVisibleText(countryOption);
    }*/

    //mobile phone
    public void writeMobilePhone(String tel){
        System.out.println("Llenado de telefono movil");
        WebElement phoneField = driver.findElement(byMobilePhone);
        phoneField.sendKeys(tel);
    }

    //address future reference
    public void writeFutureReference(String futureReference){
        System.out.println("Llenado de direccion para futura referencia");
        WebElement futureReferenceField = driver.findElement(byAddressFutureReference);
        futureReferenceField.sendKeys(futureReference);
    }


    //Clic en Register
    public void clickRegister(){
        System.out.println("Click en registrar");
        WebElement registerButton = driver.findElement(byRegisterButton);
        registerButton.click();
    }


    //Mensaje registro creado satisfactoriamente
    public boolean validateCreateSuccessful(){
        System.out.println("Validar usuario creado correctamente");
        WebElement createAlertSuccess = driver.findElement(byAlertCreateSuccess);
        return createAlertSuccess.isDisplayed();
    }
}
