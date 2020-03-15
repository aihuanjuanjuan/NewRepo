package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AMZRegistration extends HomePage {

	public void registration() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement reg1 = fele(readproperties("yourname"), driver);
		reg1.sendKeys("dfgwafgal");

		WebElement reg2 = fele(readproperties("email"), driver);
		reg2.sendKeys("dqd69f6fw@gmail.com");

		WebElement reg3 = fele(readproperties("password"), driver);
		reg3.sendKeys("42147!!hj");

		WebElement reg4 = fele(readproperties("rpassword"), driver);
		reg4.sendKeys("42147!!hj");

		WebElement reg5 = fele(readproperties("regis"), driver);
		reg5.click();

	}
	
	public void signup(String name, String email, String password) throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement reg1 = fele(readproperties("yourname"), driver);
		reg1.sendKeys(name);

		WebElement reg2 = fele(readproperties("email"), driver);
		reg2.sendKeys(email);

		WebElement reg3 = fele(readproperties("password"), driver);
		reg3.sendKeys(password);

		WebElement reg4 = fele(readproperties("rpassword"), driver);
		reg4.sendKeys(password);

		WebElement reg5 = fele(readproperties("regis"), driver);
		reg5.click();

	}

}
