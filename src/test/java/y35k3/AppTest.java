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
    public void T1_porcentaje_positivo_de_n_positivo()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("10");
        driver.findElement(By.id("cpar2")).sendKeys("50");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("5",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T2_porcentaje_positivo_de_n_negativo()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("5");
        driver.findElement(By.id("cpar2")).sendKeys("-86");
            
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("-4.3",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T3_porcentaje_negativo_de_n_positivo()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("-9");
        driver.findElement(By.id("cpar2")).sendKeys("136");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("-12.24",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T4_porcentaje_negativo_de_n_negativo()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("-5");
        driver.findElement(By.id("cpar2")).sendKeys("-50");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("2.5",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T5_porcentaje_decimal_de_n_positivo()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("3.5");
        driver.findElement(By.id("cpar2")).sendKeys("100");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("3.5",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T6_porcentaje_positivo_de_n_decimal()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("60");
        driver.findElement(By.id("cpar2")).sendKeys("19.6");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("11.76",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T7_porcentaje_100_percent_de_n()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("100");
        driver.findElement(By.id("cpar2")).sendKeys("80");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("80",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @Test
    public void T8_porcentaje_0_percent_de_n()
    {
        WebDriver driver = RunEnvironment.getWebDriver();

        driver.findElement(By.id("cpar1")).sendKeys("0");
        driver.findElement(By.id("cpar2")).sendKeys("1962");
    
        driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

        assertEquals("0",driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText());
    }

    @After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }
}
