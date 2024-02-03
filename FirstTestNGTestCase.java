import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class FirstTestNGTestCase {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }
    void registerUser(){

        }

        @Test(priority = 2)
        void loginUser() {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("nshah@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Test123!");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        }
        @Test(priority = 3)
        void selectComputer() {
            driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        }

        @Test(priority = 4)
        void selectDesktop() {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")).click();

        }
        @Test(priority = 5)
        void lenovaIdeaCentre600AllInOnePC(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        }
        @Test (priority = 6)
        void addToCart(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        }
        @Test (priority = 7)
        void shoppingCart(){
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        }
        @Test (priority = 8)
        void upDateCart(){
        driver.findElement(By.id("updatecart")).sendKeys("3");
        }
        @Test(priority = 9)
        void readTerms(){
        driver.findElement(By.id("read-terms")).sendKeys("readTerms");
        }
        @Test(priority = 10)
        void checkout(){
        driver.findElement(By.id("checkout")).sendKeys("checkout");
        }
}



