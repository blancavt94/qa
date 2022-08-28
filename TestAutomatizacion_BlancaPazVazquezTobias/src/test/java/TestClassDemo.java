import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestClassDemo extends BaseTest{


    @Test(priority = 1)
    public void validateOpenSite(){
        HomePage homePage = new HomePage(driver);
        System.out.println("==EXECUTING TEST CASE 1====");
        Assert.assertTrue(homePage.validateHomeLogoIsDisplayed());
    }

    @Test(priority = 2)
    public void sendEmailContactUsWebmaster(){
        System.out.println("==EXECUTING TEST CASE 2====");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateHomeLogoIsDisplayed());
        homePage.clickContactUs();

        waitForNSeconds(3);

        ContactUsPage contactUs = new ContactUsPage(driver);
        Assert.assertTrue(contactUs.validateContactUsLabel());
        contactUs.selectSubjectDropdown("Webmaster");
        contactUs.writeEmailAddress("victor@email.com");
        contactUs.writeOrderReference("12345");
        contactUs.writeEmailMessage("Hola Mundo");
        contactUs.clickSend();
        Assert.assertTrue(contactUs.validateSentMessageSuccessful());


    }

    @Test(priority = 3)
    public void sendEmailContactUsCustomerService(){
        System.out.println("==EXECUTING TEST CASE 3====");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateHomeLogoIsDisplayed());
        homePage.clickContactUs();

        waitForNSeconds(3);

        ContactUsPage contactUs = new ContactUsPage(driver);
        Assert.assertTrue(contactUs.validateContactUsLabel());
        contactUs.selectSubjectDropdown("Customer service");
        contactUs.writeEmailAddress("victor_new@email.com");
        contactUs.writeOrderReference("894");
        contactUs.writeEmailMessage("Testing New Customer Service Email");
        contactUs.clickSend();
        Assert.assertTrue(contactUs.validateSentMessageSuccessful());


    }

    @Test(priority = 3)
    public void createNewAccount(){
        System.out.println("==EXECUTING TEST CASE 4====");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateHomeLogoIsDisplayed());
        homePage.clickSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.writeEmail("a.com");
        signInPage.clickCreateNewAccount();

        CreateAccountPage newAccount = new CreateAccountPage(driver);
        newAccount.writeCustomerFirstName("Blanca");
        newAccount.writeCustomerLastName("Vazquez");
        newAccount.writeCustomerPassword("unaco");
        newAccount.writeAddress("test");
        newAccount.writeCity("slp");
        newAccount.selectStateDropdown("Georgia");
        newAccount.writeCP("89546");
        newAccount.writeMobilePhone("849384939");

        newAccount.clickRegister();
        Assert.assertTrue(newAccount.validateCreateSuccessful());
    }

}
