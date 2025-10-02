package Demo_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Initialization.Init;

public class Xpath extends Init{
    public static void main(String[] args) throws Exception {
        SetUp("chrome");

        // driver.get("https://www.facebook.com/");
        // WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
        // WebElement button = driver.findElement(By.xpath("//button[@data-testid='royal-login-button']"));
        // WebElement button = driver.findElement(By.xpath("//button[contains(@data-testid,'login-button')]"));
        // WebElement button = driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]"));
        // WebElement button = driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
        // System.out.println(button.getText());
        // button.click();

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // WebElement menu = driver.findElement(By.xpath("//ul[@id='navMenus']/li[1]"));
        // System.out.println(menu.getText());
        // WebElement menu1 = driver.findElement(By.xpath("//ul[@id='navMenus']/li[1]"));

        WebElement listItem1 = driver.findElement(By.xpath("//ul[@id='navMenus']/li[1]"));
            System.out.println(listItem1.getText());
            listItem1.click();
            // Thread.sleep(2000);
        Thread.sleep(2000);



        Teardown();
    }
}
