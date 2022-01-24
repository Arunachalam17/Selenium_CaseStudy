package object_repository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Elements {
	
	@FindBy(id="email")
	public static WebElement username;
	
	@FindBy(name="passwd")
	public static WebElement password;
	
	@FindBy(id="SubmitLogin")
	public static WebElement login_button;
	
	//Registration page Elements
	
	@FindBy(id="email_create")
	public static WebElement Email_address;
	
	@FindBy(id="SubmitCreate")
	public static WebElement create_an_account_btn;
	
	
	@FindBy(id="id_gender1")
	public static WebElement title_mr;
	
	@FindBy(id="customer_firstname")
	public static WebElement Firstname;
	
	@FindBy(id="customer_lastname")
	public static WebElement Lastname;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	public static WebElement Email;
	
	@FindBy(xpath="//input[@name='passwd']")
	public static WebElement Password_reg;
	
	
	@FindBy(id="days")
	public static WebElement dropdown_date;	
	
	
	@FindBy(id="months")
	public static WebElement dropdown_month;
	
	
	@FindBy(id="years")
	public static WebElement dropdown_year;
	
	@FindBy(id="newsletter")
	public static WebElement Signup_for_our_newsletter;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	public static WebElement firstname_addr;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	public static WebElement lastname_addr;
	
	@FindBy(id="company")
	public static WebElement company_addr;
	
	@FindBy(id="address1")
	public static WebElement address1_addr;
	
	@FindBy(id="address2")
	public static WebElement address2_addr;
	
	@FindBy(id="city")
	public static WebElement city_addr;
	
	@FindBy(id="id_state")
	public static WebElement dropdown_state;
	
	
	@FindBy(id="postcode")
	public static WebElement postcode_addr;
	
	@FindBy(id="id_country")
	public static WebElement dropdown_country;
	
	
	@FindBy(id="other")
	public static WebElement additional_information;
	
	
	@FindBy(id="phone")
	public static WebElement Home_phone;
	
	@FindBy(id="phone_mobile")
	public static WebElement Mobile_phone;
	
	@FindBy(id="alias")
	public static WebElement address_alias;
	
	
	@FindBy(id="submitAccount")
	public static WebElement register_button;
	
	//addtocart elements
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	public static WebElement dresses;
	
	
	@FindBy(xpath="//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
	public static WebElement casual_dresses;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]")
	public static WebElement product_hov;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	public static WebElement addtocart_btn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]")
	public static WebElement checkout_popup;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	public static WebElement proceedtocheckout;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	public static WebElement close_button;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	public static WebElement cart;
	
	@FindBy(xpath="//*[@id=\"product_3_13_0_632135\"]/td[2]/p")
	public static WebElement product_name_check;
	
	/*
	public static WebElement username(WebDriver d1) {
		return d1.findElement(By.id("email"));		
	}
	
	public static WebElement password(WebDriver d1) {
		return d1.findElement(By.name("passwd"));
		
	}
	
	public static WebElement login_button(WebDriver d1) {
		return d1.findElement(By.id("SubmitLogin"));
		
	}*/

}
