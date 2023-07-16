package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
public WebDriver driver;

By toggle = By.xpath("/html/body//form[@role='search']//div[@class='A8SBwf']/div[@class='FPdoLc lJ9FBc']/center/input[@name='btnI']");

public HomePage (WebDriver driver) {
	this.driver = driver;
}

public WebElement getToggle () {
	return driver.findElement(toggle);
}


}
