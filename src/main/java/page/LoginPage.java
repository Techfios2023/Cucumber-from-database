package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBasePage {



	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_BUTTON_ELEMENT;




	
	public void insertUserNamed(String username) {
		USERNAME_ELEMENT.sendKeys(username);

	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);

	}

	public void clickOnSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}

	
}
