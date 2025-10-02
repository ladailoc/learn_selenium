package Demo_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Initialization.Init;

public class ElementMethod extends Init{
    public static void main(String[] args) throws Exception {
        SetUp("chrome");
        driver.get("https://practice.bpbonline.com/");

        WebElement inputSearch = driver.findElement(By.name("keywords"));
        inputSearch.clear();
        inputSearch.sendKeys("mouse");
        driver.findElement(By.xpath("//input[@title=' Quick Find ']")).click();

        String s = driver.findElement(By.xpath("//span[contains(text(),'Displaying')]")).getText();
        System.out.println(s.split(" ")[4]);
        Teardown();
    }
}
