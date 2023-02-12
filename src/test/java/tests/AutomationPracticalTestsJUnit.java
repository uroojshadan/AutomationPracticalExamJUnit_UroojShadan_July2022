package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.TechfiosPage;
import pages.TestBase;

public class AutomationPracticalTestsJUnit {

 WebDriver driver;
 TechfiosPage techfiosPage;
	
 	@Before()
 	public void setUp(){
		driver=TestBase.initDriver();
		techfiosPage=PageFactory.initElements(driver, TechfiosPage.class);
	
	
 	}
 
	@Test
	//public void validateToggleAll() {
		public void validate1() {
		techfiosPage.addCheckBoxesAndClickAddButton();
		techfiosPage.clickOnToggleAllCheckbox();
		boolean result=techfiosPage.validateThatAllCheckboxesInListAreSelected();
		Assert.assertTrue("All checkboxes are not selected", result);

	}
	@Test
	//public void validateThatSingleCheckBoxIsRemoved() {
		public void validate2() {
		techfiosPage.clickOnSingleCheckbox();
		techfiosPage.clickOnRemoveButton();
		boolean result=techfiosPage.validateThatOneCheckboxIsRemoved();
		Assert.assertTrue("one checkbox not removed", result);
	}
		
	@Test
	//public void validateThatAllCheckBoxesAreRemoved() {
	public void validate3() {
		techfiosPage.clickOnToggleAllCheckbox();
		techfiosPage.clickOnRemoveButton();
		boolean result=techfiosPage.validateThatAllCheckBoxesAreRemoved();
		Assert.assertTrue("List of checkboxes is not empty i.e all checkboxes not deleted", result);
	}
	
	@After
	public void tearDown() {
		TestBase.tearDown();
	}
}
