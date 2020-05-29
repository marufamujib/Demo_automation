package mentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","BrowserDriver\\windows\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.com");

        System.setProperty("webdriver.gecko.driver","BrowserDriver\\windows\\geckodriver.exe");
        WebDriver driver1=new FirefoxDriver();
        //driver1.get("https://www.amazon.com");

        driver1.navigate().to("http://www.amazon.com");
        driver1.manage().window().maximize();
        String title=driver1.getTitle();
        System.out.println("*************************************************");
        System.out.println(title);

    }

}
