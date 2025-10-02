package Demo_Elements;

import org.openqa.selenium.By;

import Initialization.Init;

public class CheckBox extends Init{
    public static void main(String[] args) throws Exception {
        SetUp("chrome");
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());

        Teardown();
    }
}
