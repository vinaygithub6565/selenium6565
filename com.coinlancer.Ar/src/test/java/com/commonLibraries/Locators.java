 package com.commonLibraries;

import org.openqa.selenium.By;

public class Locators {
	//sign up page//
	public static By SignUp_Button = By.linkText("SIGN UP");
	public static By Client_RadioButton=By.xpath("//label[@for='customRadioInline1']");
	public static By Freelancer_RadioButton=By.xpath("//label[@for='customRadioInline2']");
	public static By FirstName_Textbox=By.name("name");
	public static By LastName_Textbox=By.xpath("//input[@placeholder='Last Name']");
	public static By UserName_Textbox=By.name("userLoginName");
	public static By password_Textbox=By.name("password");
	public static By confirmpassword_Textbox=By.name("conformpassword");
	public static By email_Textbox=By.name("emailId");
	public static By Register_button=By.xpath("/html/body/div[1]/app-root/div/app-register/div/div/div[2]/div/form/div[7]/button[1]");
	public static By clear_Button=By.xpath("/html/body/div/app-root/div/app-register/div/div/div[2]/div/form/div[7]/button[2]");
	
	
	//Login page//
	public static By Client_Radiobutton = By.xpath("//label[@for='customRadioInline12']");
	public static By Freelancer_Radiobutton = By.xpath("//label[@for='customRadioInline13']");
	public static By Username_Textbox = By.id("uname");
	public static By Password_Textbox = By.id("uname1"); 
	public static By Forgotpassword_Textbox = By.linkText("Forgot password?");
	public static By Login_Button = By.linkText("LOGIN");
	public static By Register_Button = By.linkText("REGISTER");
	public static By details_Login=By.xpath("/html/body/div/app-root/div/app-login/div[1]/div/div[2]/form/div[5]/div/div[1]/button");

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
   
     //public static By EditProfile_Button = By.xpath ("//button[text()='Edit Profile']");//
     
     // USER NAME DROP DOWN BUTTON//     
     public static By Username_Dropdownbox= By.id("navbarDropdown");
     public static By Dashboard_button= By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[1]");
     public static By profile_botton= By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[2]");
     public static By messages_button=By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[3]");
     public static By Notifications_button=By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[4]");
     public static By Finance_button=By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[5]");
     public static By Settings_button=By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[6]");
     public static By Logout_button=By.xpath("//*[@id='navbarSupportedContent']/ul/li[6]/div/div/a[7]");
     
     // FREELANCER EDITPROFILE//
   public static By EditProfile_Button = By.linkText("Edit Profile");
   
   // FREELANCER My JOB FEEDS TAB //
   public static By Myjobfeeds_button=By.id("nav-home-tab");
   public static By Project_Tittle=By.xpath("(//div[@class='card mb-3 p-2 card-bid']/h5/a)[1]");
   public static By Postedon_Date=By.xpath("(//div[@class=\"w-100 pl-2\"]/label)[2]");
   public static By Bidenddate_Date=By.xpath("(//div[@class=\"w-100 pl-2\"]/label)[3]");
   public static By Client_Name=By.xpath("(//div[@class=\"w-100 \"]/span/a)[1]");
   public static By projectbudget_budget=By.xpath("(//div[@class=\"w-100 pl-2\"]/label)[4]");
   public static By WorkType_Type=By.xpath("//div[@class='w-100 pl-2']/label)[1]");
   public static By Bid_button=By.linkText("BID");
   public static By Enterbidamount_Textbox=By.id("bid-amt");
   public static By Requireddays_Textbox=By.id("delivery");
   public static By Submit_button=By.linkText("Submit");
   public static By Clear_button=By.linkText("Clear");
   public static By project_Description=By.xpath("(//div[@class=\"cl-review\"]/p)[1]");
   public static By Project_skills=By.xpath("(//div[@class=\"w-100\"]/span)[1]");
   public static By Project_steps=By.xpath("(//div[@class=\"col-sm-11\"]/p)[1]");
   public static By Aboutclient_Name=By.xpath("(//div[@class='media-body']/h5/a)[1]");
   
   //FREELANCER ACTIVE PROJECTS TAB//
   public static By Activeprojects_button=By.id("nav-profile-tab");
   public static By ActiveProject_Tittle=By.xpath("(//div[@class='card mb-3 p-2 card-bid']/h5/a)[1]");
   public static By startdate=By.xpath("(//div[@class=\"w-100 \"]/span)[1]");
   public static By Deadline=By.xpath("(//div[@class=\"w-100 \"]/span)[2]");
   public static By client_Name=By.xpath("(//div[@class=\"w-100 \"]/span)[3]");
   public static By Awardedbid=By.xpath("(//div[@class=\"w-100 \"]/span)[4]");
   public static By Projectstatus=By.xpath("//*[@id='nav-tabContent']/app-active/div[1]/div[1]/div/div/div[2]/div/label");
   public static By Dispute_button=By.linkText("DISPUTE");
   public static By projectstatusbar_button=By.id("price-max0");
   public static By projectDescription=By.xpath("(//div[@class=\"cl-review\"]/p)[1]");
   
   
   
   
}


     
     
     
