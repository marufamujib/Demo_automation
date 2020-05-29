package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mentoring {
    public static void main(String[] args) throws InterruptedException {
        //Set the properties for the driver
        System.setProperty("webdriver.gecko.driver","BrowserDriver\\windows\\geckodriver.exe");
        //Create object for the gecko driver
       WebDriver driver =new FirefoxDriver();
       //Open the browser
        //driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("disposable face mask");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Modenna Face Mask Disposable Blue 50Pcs")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("hlb-ptc-btn-native")).click();



        // we are using link text
       // driver.findElement(By.linkText("Gift Cards")).click();
        // we are using partial link text
       // driver.findElement(By.partialLinkText("Gift")).click();

//        String title=driver.getTitle();
//        System.out.println("*****************************************");
//        System.out.println(title);

//        driver.findElement(By.id("nav-link-accountList")).click();
//        driver.findElement(By.cssSelector("#ap_email")).sendKeys("marufa_mujib@yahoo.com");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#continue")).click();
//        driver.findElement(By.cssSelector("#ap_password")).sendKeys("abc12345");



        //driver.close();

    }
}
