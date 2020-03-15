package Testing;

import java.io.IOException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.AMZRegistration;
import Pages.AMZSignIn;
import Pages.HomePage;
import Pages.IpadPage;
import Pages.SearchIpadPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IpadTest extends HomePage {

	/*
	 * 1. amazon hpage 2. type ipad into search box 3. click on search 4. from
	 * search results, choose new ipad/first one 5.it direct to ipad page, choose
	 * 128gb, gold color 6. click on add to cart 7. choose no thanks 8.proceed to
	 * checkout 9.amazon signin page 10.create your amazon account 11.amazon
	 * registration page
	 */

	@Before
	public void initi() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
	}

	@Ignore
	public void testingipad() throws IOException, InterruptedException {
		HomePage hp = new HomePage();
		hp.gettingtitle();
		hp.searchipad();

		SearchIpadPage sip = new SearchIpadPage();
		sip.gettingtitle();
		sip.clickipad();

		IpadPage ip = new IpadPage();
		ip.gettingtitle();
		ip.choosesizecolor();
		ip.cart();
		ip.checkout();

		
		AMZSignIn si=new AMZSignIn();
		si.gettingtitle();
		si.createac();
		
		AMZRegistration rg=new AMZRegistration();
		rg.gettingtitle();
		rg.registration();
		
	}
	
	@Test
	public void testingipadfred() throws IOException, InterruptedException {
		HomePage hp = new HomePage();
		hp.gettingtitle();
		hp.searchipad();

		SearchIpadPage sip = new SearchIpadPage();
		sip.gettingtitle();
		sip.clickipad();

		IpadPage ip = new IpadPage();
		ip.gettingtitle();
		ip.choosesizecolor();
		ip.cart();
		ip.checkout();

		
		AMZSignIn si=new AMZSignIn();
		si.gettingtitle();
		si.createac();
		
		AMZRegistration rg=new AMZRegistration();
		rg.gettingtitle();
		rg.signup("fred", "fred0@gmail.com", "asdasdasd1312312");
		
	}

}
