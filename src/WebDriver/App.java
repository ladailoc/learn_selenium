package WebDriver;

import Initialization.Init;

public class App extends Init {
    public static void main(String[] args) throws Exception {
        SetUp("chrome");
        driver.get("https://www.google.com");

        Teardown();
    }
}
