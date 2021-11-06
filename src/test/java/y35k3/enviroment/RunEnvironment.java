package y35k3.enviroment;
import org.openqa.selenium.WebDriver;

public class RunEnvironment {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    static void setWebDriver(WebDriver webDriver) {
        RunEnvironment.webDriver = webDriver;
        webDriver.navigate().to("https://www.calculator.net/percent-calculator.html");
    }
}
