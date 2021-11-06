package y35k3;
import y35k3.enviroment.EnvironmentManager;
import y35k3.enviroment.RunEnvironment;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AppTest 
{
    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }


    @Test
    public void prueba1()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("10");
        driver.findElement(By.id("cpar2")).sendKeys("50");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("5",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void prueba2()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("5");
        driver.findElement(By.id("cpar2")).sendKeys("86");
            
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("4.3",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void prueba3()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("40");
        driver.findElement(By.id("cpar2")).sendKeys("360");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("144",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
}
