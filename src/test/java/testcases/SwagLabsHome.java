package testcases;

import org.openqa.selenium.WebDriver;

import pages.SwagLabsHomePage;

public class SwagLabsHome extends BaseClass{

	public void addToCart(String item) {
		SwagLabsHomePage hp = new SwagLabsHomePage(driver);
		hp.getProduct("Sauce Labs Backpack");
	}
}
