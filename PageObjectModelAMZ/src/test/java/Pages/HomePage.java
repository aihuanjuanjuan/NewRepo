package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class HomePage extends Lib {

	/*
	 * search ipad get title
	 */

	public static WebDriver driver = null;

	public void searchipad() throws IOException, InterruptedException {

		WebElement search = fele(readproperties("searchbox"), driver);

		search.sendKeys("ipad" + Keys.ENTER);

		Thread.sleep(3000);

	}

	public void gettingtitle() {

		System.out.println("We are at this page:   " + driver.getTitle());
	}

}
