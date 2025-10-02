package Wait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Initialization.Init;

public class WaitTest extends Init{
    public static void main(String[] args) throws InterruptedException {
        SetUp("edge");
        driver.get("https://practice.bpbonline.com");

        // Click on My Account
        driver.findElement(By.id("tdb3")).click();

        // Input email and password
        WebElement emailField = driver.findElement(By.name("email_address"));
        emailField.clear();
        emailField.sendKeys("bpb@bpb.com");

        WebElement passwordField = driver.findElement(By.name("password"));
        // passwordField.isDisplayed()? System.out.println("Password field is displayed") : System.out.println("Password field is not displayed");
        passwordField.clear();
        passwordField.sendKeys("bpb@123");

        // Click sign in button
        driver.findElement(By.id("tdb5")).click();

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement logoff = wait.until(drv -> drv.findElement(By.linkText("My Account")));
        // WebElement logoff = wait.until(drv -> drv.findElement(By.linkText("Log Off")));
        // WebElement log_off = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Off")));
        // log_off.click();


        // Đợi Continue button hiển thị và có thể click được
        // WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Continue")));
        // continueButton.click();


        // Đợi View or change my account information button hiển thị và có thể click được
        WebElement accountInfoButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("View or change my account information.")));
        accountInfoButton.click();

        // Cập nhật thông tin tài khoản
        driver.findElement(By.name("firstname")).sendKeys("La Dai Loc");
        driver.findElement(By.name("lastname")).sendKeys("La Dai Loc");
        driver.findElement(By.name("dob")).sendKeys("01/01/1990");

        // Click Continue button to save changes
        driver.findElement(By.id("tdb5")).click();

        // Đợi thông báo thành công hiển thị
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("messageStackSuccess")));
        if (successMessage.isDisplayed()) {
            System.out.println("Cập nhật thông tin tài khoản thành công!");
        } else {
            System.out.println("Cập nhật thông tin tài khoản thất bại!");
        }

        // Click Log Off
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Off"))).click();

        // Click Continue button on Log Off page
        wait.until(ExpectedConditions.elementToBeClickable(By.id("tdb4"))).click();

        Teardown();
    }
}
