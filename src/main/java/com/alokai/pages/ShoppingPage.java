package com.alokai.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class ShoppingPage {
	
	WebDriver driver;
	WebDriverWait wait;
	ExtentTest test;
	
	public ShoppingPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.test = test;
	}
	
	By SelectCategories = By.xpath("//*[@class=\"inline-flex items-center justify-center font-medium text-base focus-visible:outline focus-visible:outline-offset rounded-md disabled:text-disabled-500 disabled:bg-disabled-300 disabled:shadow-none disabled:ring-0 disabled:cursor-not-allowed py-2 leading-6 px-4 gap-2 text-primary-700 hover:bg-primary-100 hover:text-primary-800 active:bg-primary-200 active:text-primary-900 disabled:bg-transparent hidden md:flex -mx-2 text-white bg-transparent hover:bg-primary-800 hover:text-white active:bg-primary-900 active:text-white\"]");
	By SelectMen = By.xpath("(//*[@class=\"text-base md:text-sm capitalize flex items-center\"])[4]");
	By SelectSweater = By.linkText("Sweater Paolo Pecora white");
	By SelectDetailsLink = By.linkText("Details");
	By ClickAddtoCart = By.xpath("//*[@class=\"inline-flex items-center justify-center font-medium text-base focus-visible:outline focus-visible:outline-offset rounded-md disabled:text-disabled-500 disabled:bg-disabled-300 disabled:shadow-none disabled:ring-0 disabled:cursor-not-allowed py-3 leading-6 px-6 gap-3 text-white shadow hover:shadow-md active:shadow bg-primary-700 hover:bg-primary-800 active:bg-primary-900 disabled:bg-disabled-300 flex-grow-[2] flex-shrink basis-auto whitespace-nowrap\"]");
	By OpenCartLink = By.xpath("//*[@class=\"hidden md:flex\"]");
	By ClickGotoCheckout = By.linkText("Go to checkout");
	By ClickTermsandConditions = By.linkText("Terms and Conditions");
	
	public void selectCategories() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement categoriesElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCategories));
		categoriesElement.click();
		test.pass("Selected Categories");
	}
	public void selectMen() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement menElement = wait.until(ExpectedConditions.elementToBeClickable(SelectMen));
		menElement.click();
		test.pass("Selected Men");
	}
	public void selectSweater() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement sweaterElement = wait.until(ExpectedConditions.elementToBeClickable(SelectSweater));
		sweaterElement.click();
		test.pass("Selected Sweater");
	}
	public void selectDetailsLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement detailsElement = wait.until(ExpectedConditions.elementToBeClickable(SelectDetailsLink));
		detailsElement.click();
		test.pass("Selected Details Link");
	}
	public void clickonAddtoCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement addtoElement = wait.until(ExpectedConditions.elementToBeClickable(ClickAddtoCart));
		addtoElement.click();
		test.pass("Clicked on Add to Cart");
	}
	public void openCartLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement cartElement = wait.until(ExpectedConditions.elementToBeClickable(OpenCartLink));
		cartElement.click();
		test.pass("Opened Cart Link");
	}
	public void clickonGotoCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkElement = wait.until(ExpectedConditions.elementToBeClickable(ClickGotoCheckout));
		checkElement.click();
		test.pass("Clicked on Go To Checkout");
	}
	public void clickonTermsandConditions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement termsElement = wait.until(ExpectedConditions.elementToBeClickable(ClickTermsandConditions));
		termsElement.click();
		test.pass("Clicked on Terms and Conditions");
	}
}