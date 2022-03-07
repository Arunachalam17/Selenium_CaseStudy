package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Script2 {
	
	WebDriver d1;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arunachalam.annad\\Downloads\\chromedriver_win32_97\\chromedriver.exe");        
        d1 = new ChromeDriver();
        d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		System.out.println("Given Statement 1");
	}


	@When("Enter Username , password and click login button")
	public void enter_Username_password_and_click_login_button() {
		 d1.findElement(By.id("email")).sendKeys("arunachalam.annad@hcl.com");
		 d1.findElement(By.name("passwd")).sendKeys("arunachalam.annad@hcl.com");
		 d1.findElement(By.id("SubmitLogin")).click();
		 //System.out.println("When Statement");
	}
	@Then("Success in login")
	public void success_in_login() {
		System.out.println("Login Successfull");
	}
	
	@Given("Open chrome browser and cart url of the application")
	public void open_chrome_browser_and_cart_url_of_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arunachalam.annad\\Downloads\\chromedriver_win32_97\\chromedriver.exe");        
        d1 = new ChromeDriver();
        d1.get("http://automationpractice.com/index.php?controller=my-account");
        System.out.println("Given Statement 2");
		
	}


	@When("Select the product and add to cart")
	public void select_the_product_and_add_to_cart() {
		d1.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        
        WebElement casual_dresses = d1.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img"));
        
        d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) d1;
        js.executeScript("scroll(0,750)");
        js.executeScript("arguments[0].scrollIntoView(true)",casual_dresses);
        
        casual_dresses.click();        
        //d1.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
        
        WebElement product_hov= d1.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]"));
        WebElement addtocart_btn= d1.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
        
        Actions actions1 = new Actions(d1);
        actions1.moveToElement(product_hov);
        actions1.moveToElement(addtocart_btn);
        
        addtocart_btn.click();   
        
	}
	@Then("Added in Cart")
	public void added_in_Cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Product successfully added to the cart");
	}


}
