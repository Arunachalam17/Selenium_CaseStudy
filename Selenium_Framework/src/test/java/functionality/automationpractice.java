package functionality;

import java.awt.AWTException;
//import java.awt.Dimension;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import javax.imageio.ImageIO;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;
import object_repository.Elements;


public class automationpractice {

    @Test
    	public void login_func() throws IOException, AWTException, FileNotFoundException {
    	
    	//Login Functionality
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\arunachalam.annad\\Downloads\\chromedriver_win32_97\\chromedriver.exe");
        WebDriver d1;
        d1 = new ChromeDriver();
        d1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        d1.manage().window().maximize();
        PageFactory.initElements(d1, Elements.class); // PageFactory Initialization

        Elements.username.sendKeys("arunachalam.annad@hcl.com");
        Elements.password.sendKeys("hcl1234");
        Elements.login_button.click();

        // TakesScreenshot tk1 =(TakesScreenshot) d1; File //
        //Source=tk1.getScreenshotAs(OutputType.FILE); File Destination = new //
        //File("C:\\Users\\arunachalam.annad\\OneDrive - HCL Technologies Ltd\\Desktop\\Screenshotss\\screenshot1.jpg");
        // FileHandler.copy(Source,Destination);

        //Add to Cart Funcationality

        d1.get("http://automationpractice.com/index.php?controller=my-account");
        d1.manage().window().maximize(); 
        PageFactory.initElements(d1, Elements.class);
        
        Elements.dresses.click();
        d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) d1;
        js.executeScript("scroll(0,750)");
        js.executeScript("arguments[0].scrollIntoView(true)",Elements.casual_dresses);
        
        Elements.casual_dresses.click();        
        
        Actions actions1 = new Actions(d1);
        actions1.moveToElement(Elements.product_hov);
        actions1.moveToElement(Elements.addtocart_btn);
        
        Elements.addtocart_btn.click();
        d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        d1.switchTo().activeElement();
        Elements.proceedtocheckout.click();    
        
        //Cart 
        Elements.cart.click();
        d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Cart Data Validation
        String product_name = Elements.product_name_check.getText();
        
        Assert.assertEquals(product_name,"Printed Dress");
        
        
    }

}