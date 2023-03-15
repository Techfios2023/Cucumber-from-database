package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.LoginPage;
import page.TestBasePage;

public class Steps extends TestBasePage {

	LoginPage loginpage;
	//NewAccountPage newAccount;
//	DatabasePage databasePage;

	
	@Before
	public void beforeRun() {
		initDriver();

		loginpage = PageFactory.initElements(driver, LoginPage.class);
	//	newAccount = PageFactory.initElements(driver, NewAccountPage.class);
//		databasePage= new DatabasePage();
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

//	@When("User enters the {string} in the {string} field")
//	public void user_enters_the_Logininfo_in_the_field(String logindata, String field) {
//		if (field.equalsIgnoreCase("username")) {
//			loginpage.insertUserNamed(logindata);
//		} else if (field.equalsIgnoreCase("password")) {
//			loginpage.insertPassword(logindata);
//		} else {
//			System.out.println("unable to enter userinfo: " + logindata + "in field" + field);
//		}
//
//	}
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {

		loginpage.insertUserNamed(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {

		loginpage.insertPassword(password);
	}
	
	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button(String button) {
		
		loginpage.clickOnSigninButton();
		
//		switch (button) {
//		case "loginpage":
//			loginpage.clickOnSigninButton();
//			break;
//		case "NewAccountPage":
//			newAccount.ClickOnBankAndCash();
//			newAccount.CliclOnNewAccount();
//			newAccount.clickOnSubmitButton();
		}
	

//	@Then("User should land on dashboard page")
//	public void user_should_land_on_dashboard_page() {
//		takeScreenshot(driver);
//		String actual = "Dashboard- iBilling";
//		String expected = driver.getTitle();
//		Assert.assertEquals(expected, actual);
//	}

//	@Then("User enters {string} in the {string} field in accounts page")
//	public void user_enters_in_the_field_in_accounts_page(String info, String field) {
//		switch (field) {
//		case "accountTitle":
//			newAccount.InsertAccountTitle(info);
//			break;
//		case "description":
//
//			newAccount.InsertAccountDescription(info);
//			break;
//
//		case "initialBalance":
//			newAccount.InsertInitialBalance(info);
//			break;
//		case "accountNumber":
//			newAccount.InsertAccountNumber(info + generateRandumNum(999));
//			break;
//		case "contactPerson":
//			newAccount.InsertContactPerson(info);
//			break;
//		case "Phone":
//			newAccount.InsertPhoneNumber(info + generateRandumNum(99));
//			break;
//		case "internetBankingURL":
//
//			newAccount.InsertBankURL(info);
//
//		default:
//
//			System.out.println(info + "User Info data NOT found");
//
//		}
//
//	}
//
//	@Then("User should be able to validate account created successfully")
//	public void user_should_be_able_to_validate_account_created_successfully() {
//		takeScreenshot(driver);
//		String actual = "Manage Accounts";
//		String expected = driver.getTitle();
//		Assert.assertEquals(expected, actual);
//	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
