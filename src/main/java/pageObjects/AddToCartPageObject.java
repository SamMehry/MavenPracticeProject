package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class AddToCartPageObject extends Base {

	// create a constructor
	public AddToCartPageObject() {// we will use initElements to initialize all webElements in this page

		PageFactory.initElements(driver, this);

	}
	

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	private WebElement login;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Returning Customer')]")
	private WebElement verifyLoginBox;

	@FindBy(how = How.XPATH, using = "//input[@name = 'email']")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//div[@class = 'collapse navbar-collapse navbar-ex1-collapse']")
	private WebElement verifyProductMenu;

	@FindBy(how = How.XPATH, using = "(//a [contains(text(),'Cameras')])[2]")
	private WebElement cameras;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All Cameras')]")
	private WebElement showAllCameras;

	@FindBy(how = How.XPATH, using = "(//span [@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement addToCart;

	@FindBy(how = How.XPATH, using = "//span [contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Nikon D300')])[2]")
	private WebElement verifyCamera;

	@FindBy(how = How.CLASS_NAME, using = "quantity[133]")
	private WebElement verifyQuantity;

	public void clickMyAccount() {

		myAccount.click();

	}

	public void clickLogin() {
		login.click();
	}

	public String verifyLoginBox() {
		String verify = "verifyLogingBox";
		if (verify.equals(verifyLoginBox)) {
			System.out.println("Login Box Visible");

		} else {
			System.out.println("Login Box Doesn't Exist");
		}

		return verify;
	}

	public void enterEmail(String emailAddress) {
		email.clear();
		email.sendKeys(emailAddress);

	}

	public void enterPassword(String userPassword) {
		password.clear();
		password.sendKeys(userPassword);

	}

	public void clickLoginButton() {
		loginButton.sendKeys(Keys.ENTER);// check this method.
	}

	public void verifItemyMenu() {
		try {
			verifyProductMenu.isDisplayed();
		} catch (Exception e) {

		}
		
	}

	public void clickCamera() {
		cameras.click();
	}

	public void clickShowAllCameras() {
		showAllCameras.click();
	}

	public void clickAddToCart() {
		addToCart.click();
	}

	public void clickShoppingCart() {
		shoppingCart.click();
	}

	public void verifyAddedItem() {
		try {
			verifyCamera.isDisplayed();
		} catch (ElementNotVisibleException e) {

		}
	}
	//---------------------------------------------
	public void verifyItemMenuB() {
		try {
			verifyProductMenu.isDisplayed();
		} catch (Exception e) {

		}
		
	}

	public void clickCameraB() {
		cameras.click();
	}

	public void clickShowAllCamerasB() {
		showAllCameras.click();
	}

	public void clickAddToCartB() {
		addToCart.click();
	}

	public void clickShoppingCartB() {
		shoppingCart.click();
	}
	//---------------------------------------------
	public String verifyItemQuantity() {
		
	List<WebElement> quantity = new ArrayList<Integer>();
	
	
		
		
		
		
		return null;
			
			
		
	
	}
	
	
	
	
	

	// sdet@tekschool.us
	// sdet

}
