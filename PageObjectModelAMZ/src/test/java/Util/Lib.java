package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	public static String readproperties(String key) throws IOException {

		FileInputStream fis = new FileInputStream("src/test/java/Util/Xpath.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty(key);

		return value;
	}

	public static WebElement fele(String xpath, WebDriver driver) {
		WebElement Ele = driver.findElement(By.xpath(xpath));

		return Ele;

	}
}
