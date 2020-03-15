package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class IpadPage extends HomePage {

	/*
	 * choose 128 gold add to cart nothanks proceed to checkout
	 */

	public void choosesizecolor() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement choose128 = fele(readproperties("128"), driver);
		choose128.click();
		WebElement choosegold = fele(readproperties("color"), driver);
		choosegold.click();
		Thread.sleep(2000);

	}

	public void cart() throws IOException, InterruptedException {
		WebElement addcart = fele(readproperties("addtocart"), driver);
		addcart.click();

		Thread.sleep(4000);
		WebElement notks = fele(readproperties("nothanks"), driver);
		notks.click();

	}

	public void checkout() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement chkout = fele(readproperties("checkout"), driver);
		chkout.click();

	}

}
