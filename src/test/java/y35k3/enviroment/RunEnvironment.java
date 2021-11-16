package y35k3.enviroment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RunEnvironment {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    static void setWebDriver(WebDriver webDriver) {
        RunEnvironment.webDriver = webDriver;
        webDriver.navigate().to("http://www.calculator.net/");
        webDriver.findElement(By.xpath(".//*[@id='contentout']/table/tbody/tr/td[3]/div[2]/a")).click();
        webDriver.findElement(By.xpath("//*[@id='content']/table[2]/tbody/tr/td/div[3]/a")).click();
    }
}

