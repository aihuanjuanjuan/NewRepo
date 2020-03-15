package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class SearchIpadPage extends HomePage {

	/*
	 * click on right ipad item get title
	 */

	public void clickipad() throws IOException {
		WebElement ipadproduct = fele(readproperties("ipad"), driver);
		ipadproduct.click();
		
	}

	

}
