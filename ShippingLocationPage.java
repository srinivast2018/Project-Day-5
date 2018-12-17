package com.ibm.groceriespages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingLocationPage {

	@FindBy(xpath="//input[@class='form-control input-sm']")
	WebElement searchEle;
	
	
	WebDriverWait wait;
	WebDriver driver;
	
	public ShippingLocationPage(WebDriver driver,WebDriverWait wait) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}

	public String searchLocation(String searchKeyword)
	{
		searchEle.sendKeys(searchKeyword);
		return driver.getPageSource();
	}

}
