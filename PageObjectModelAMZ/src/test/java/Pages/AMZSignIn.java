package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AMZSignIn extends HomePage {

	
	
	public void createac() throws IOException, InterruptedException {
		
		Thread.sleep(2000);
		WebElement creacc=fele(readproperties("creaac"), driver);
		creacc.click();
		
	}
}
