 package com.commonLibraries;

import org.openqa.selenium.By;

public class Locators {
	//sign up page//
	public static By SignUp_Button = By.xpath("//*[@id='navbarSupportedContent']/ul/li[5]/a");
	public static By client_Radiobutton=By.xpath("//label[@for='customRadioInline1']");
	public static By Freelancer_RadioButton=By.xpath("//label[@for='customRadioInline2']");
	public static By FirstName_Textbox=By.name("name");
	public static By LastName_Textbox=By.xpath("//input[@placeholder='Last Name']");
	public static By UserName_Textbox=By.name("userLoginName");
	public static By password_Textbox=By.name("password");
	public static By confirmpassword_Textbox=By.name("conformpassword");
	public static By email_Textbox=By.name("emailId");
	public static By clear_Button=By.linkText("CLEAR");
	public static By Register_button=By.linkText("REGISTER");
	
	//Login page//
	public static By Login_button=By.linkText("LOGIN");
	public static By Username_Textbox = By.id("uname");
	public static By Password_Textbox = By.id("uname1"); 
	public static By Forgotpassword_Textbox = By.linkText("Forgot password?");
	public static By Login_Button = By.xpath ("//button[text()='LOG IN']");
	public static By Register_Button = By.linkText("REGISTER");

    //After clicking the Forgot password//
     public static By Forgotpassword_email_Textbox =By.name("emailId");
     public static By Generatepassword_Button=By.linkText("GeneratePassword");
     
     //Post a project//
     public static By Postaproject_Button=By.linkText("POST A PROJECT");
     public static By ProjectTitle_Textbox =By.id("project-title");
     public static By ProjectDescription_Textbox =By.id("description");
     public static By projectskills_Dropdownbox =By.xpath("//div[@class='mat-select-value']");
     public static By projectcategory_Dropdownbox =By.id("categories");
     public static By projectsubcategory_Dropdownbox =By.id("subcategories");
     public static By projectBudget_Spinbox =By.name("projectMinBid");
     public static By projectbudjet_spinbox =By.name("projectMaxBid");
     public static By Howdoyouwanttowork_Radiobuttion =By.linkText("Fixed price project");
     public static By Howdoyouwanttowork_Radiobutton=By.linkText("Hourly project");
     public static By Entrylevel_Begginer_Radiobutton=By.linkText("Beginner");
     public static By Entrylevel_Intermediate_Radiobutton1=By.linkText("Intermediate");
     public static By Entrylevel_Experience_Radiobutton=By.linkText("Experience");
     public static By Bidenddate_Dropdownbox=By.id("bidend1");
     public static By ProjectDeadline_Dropdownbox=By.id("deadline1");
     public static By Projectsteps_Textbox=By.name("stepDescription");
     public static By Postproject_button=By.linkText("Post Project");
     public static By Cancel_button=By.linkText("CANCEL");
     
     //Find job//
     public static By Findjob_button=By.linkText("FIND JOB");
     public static By categories_Dropdownbox=By.id("categories");
     public static By subcategory_Dropdownbox=By.id("subcategories");
     public static By skills_dropdownbox=By.xpath ("//div[@class='mat-select-value']");
}
     
     
     
