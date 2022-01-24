package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import object_repository.Elements;


public class Registration {
	
	@Test
public void register_func() throws IOException, AWTException, FileNotFoundException {
    	
    	WebDriver d1 = null;
  /*
    	FileInputStream st=new FileInputStream("\\Selenium_Framework\\src\\test\\java\\functionality\\config.properties");
    	Properties prop = new Properties();
    	prop.load(st);
    	
    	String browser_name =  prop.getProperty("browser");
    	String driver_path =  prop.getProperty("path");
    	
    	if (browser_name.equalsIgnoreCase("chrome")) {
    		
    		System.setProperty("webdriver.chrome.driver",driver_path);
    		d1 = new ChromeDriver();	
    	}   	
    	else if (browser_name.equalsIgnoreCase("firefox")) {
    		
    		System.setProperty("webdriver.gecko.driver",driver_path);
    		d1 = new FirefoxDriver();    		
    	}
    */
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\arunachalam.annad\\Downloads\\chromedriver_win32_97\\chromedriver.exe");
        //WebDriver d1;
        d1 = new ChromeDriver();
        d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        d1.manage().window().maximize();

        PageFactory.initElements(d1, Elements.class);

        Elements.Email_address.sendKeys("arunachalam.annad@hcl.com");
        Elements.create_an_account_btn.click();
        
        // Delay time for registration
        d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Elements.title_mr.click();
        Elements.Firstname.sendKeys("Arunachalam");
        Elements.Lastname.sendKeys("Annadurai");
        Elements.Email.clear();
        Elements.Email.sendKeys("arunachalam.annad@hcl.com");
        Elements.Password_reg.sendKeys("hcl1234");
        Select drop = new
        Select(Elements.dropdown_date);
        drop.selectByValue("2");
        Select drop1 = new
        Select(Elements.dropdown_month);
        drop1.selectByValue("4");
        Select drop2 = new
        Select(Elements.dropdown_year);
        drop2.selectByValue("1997");

        Elements.Signup_for_our_newsletter.click();
        Elements.firstname_addr.sendKeys("Arunachalam");
        Elements.lastname_addr.sendKeys("Annadurai");
        Elements.company_addr.sendKeys("HClTECH");
        Elements.address1_addr.sendKeys("Chennai");
        Elements.address2_addr.sendKeys("Chenni HCL");
        Elements.city_addr.sendKeys("chennai");

        Select drop_state = new Select(Elements.dropdown_state);
        drop_state.selectByVisibleText("Alaska");
        Elements.postcode_addr.sendKeys("67676");
        Select drop_country = new
        Select(Elements.dropdown_country);
        drop_country.selectByValue("21");

        Elements.additional_information.sendKeys("NA");
        Elements.Home_phone.sendKeys("262523");
        Elements.Mobile_phone.sendKeys("8236473767");
        Elements.address_alias.clear();
        Elements.address_alias.sendKeys("Same address");
        Elements.register_button.click();

        Robot robot1 = new Robot();
        Dimension sc_size =
            Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect = new
        Rectangle(sc_size);
        BufferedImage Source = robot1.createScreenCapture(rect);
        File destination = new File("C:\\Users\\arunachalam.annad\\OneDrive - HCL Technologies Ltd\\Desktop\\Screenshotss\\screenshot2.jpg");
        ImageIO.write(Source, "png", destination);
}

}
