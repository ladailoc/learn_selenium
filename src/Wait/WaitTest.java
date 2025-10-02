package Wait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Initialization.Init;

public class WaitTest extends Init{
    public static void main(String[] args) throws InterruptedException {
        SetUp("chrome");
        driver.get("https://practice.bpbonline.com");

        // bpb@bpb.com
        // bpb@123
        driver.findElement(By.id("tdb3")).click();
        driver.findElement(By.name("email_address")).sendKeys("bpb@bpb.com");
        driver.findElement(By.name("password")).sendKeys("bpb@123");

        driver.findElement(By.id("tdb5")).click();


        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement logoff = wait.until(drv -> drv.findElement(By.linkText("My Account")));
        // WebElement logoff = wait.until(drv -> drv.findElement(By.linkText("Log Off")));
        WebElement log_off = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Off")));
        log_off.click();

        // Đợi Continue button hiển thị và có thể click được
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Continue")));
        continueButton.click();
        Teardown(); 
    }
}
