package com.alokai.tests;

import org.testng.annotations.Test;

import com.alokai.pages.BasePage;
import com.alokai.pages.ShoppingPage;

public class ShoppingTest extends BasePage {
	
	ShoppingPage shoppingpage;
	
	@Test
	public void RegisterTest() {
		test = extent.createTest("Shopping Test").info("Shopping Test Execution Started");
		shoppingpage = new ShoppingPage(driver, test);
		shoppingpage.selectCategories();
		shoppingpage.selectMen();
		shoppingpage.selectSweater();
		shoppingpage.selectDetailsLink();
		shoppingpage.clickonAddtoCart();
		shoppingpage.openCartLink();
		shoppingpage.clickonGotoCheckout();
		shoppingpage.clickonTermsandConditions();
		
		test.info("Shopping Test Execution Completed Successfully");
	}

}


