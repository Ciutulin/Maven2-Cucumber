package Maven2;


import org.openqa.selenium.By;
import org.testng.Assert;


public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _usernameField = By.id("txtUsername");
    private By _password = By.id("txtPassword");
    private By _clickOnLogin = By.id("btnLogin");
    private By _getMessageText = By.id("spanMessage");



    public void enterLogInCredentials(){
       enterText(_usernameField,loadProp.getProperty("username"));
       enterText(_password, loadProp.getProperty("password"));
    }
    public void enterInvalidCredential(String username, String password){
        enterText(_usernameField, username);
        enterText(_password,password);

    }
    public void clickOnSubmitButton(){

        clickOnElement(_clickOnLogin);
    }
    public void verifyUserIsNotAbleToLogin(String errormessage){
       Assert.assertTrue(getTextFromElement(_getMessageText).contains(errormessage));
    }
}
