package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mentoring2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","BrowserDriver\\windows\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       // driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();
    }
}
