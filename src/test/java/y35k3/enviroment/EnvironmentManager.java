package y35k3.enviroment;

import org.openqa.selenium.WebDriver;

//driver de tu navegador 
import org.openqa.selenium.edge.EdgeDriver;

public class EnvironmentManager {
    public static void initWebDriver() {
        //path del driver de tu navegador
        System.setProperty("webdriver.edge.driver", "C:/dev/WebDriver/bin/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        RunEnvironment.setWebDriver(driver);
    }
    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }
}


