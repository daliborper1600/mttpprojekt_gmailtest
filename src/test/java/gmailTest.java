import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class gmailTest {
    public WebDriver driver;

    public String testURL = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin;";

    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {


        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(testURL);
    }

    @Test
    public void gmailLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("testmttp");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Mttp1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        Thread.sleep(3000);
    }

    @Test
    public void gmailLogout() throws InterruptedException {
        gmailLogin();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
        Thread.sleep(3000);
    }

    @Test
    public void pretraziMailove() throws InterruptedException {
        gmailLogin();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"aso_search_form_anchor\"]/div/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"aso_search_form_anchor\"]/div/input")).sendKeys("mttp");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"aso_search_form_anchor\"]/div/input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test
    public void prikaziTeme() throws InterruptedException {
        gmailLogin();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\":24\"]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pbwc\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[29]/div[3]/div[1]")).click();
        Thread.sleep(2000);
    }

    @Test
    public void kreirajMail() throws InterruptedException {
        gmailLogin();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\":34\"]/div/div")).click();
        Thread.sleep(2000);

    }

    @AfterMethod
    public void teardownTest() {
        driver.quit();
    }


}
