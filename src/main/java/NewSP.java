
    import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

    public class NewSP {
        FirefoxDriver wd;

        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.gecko.driver", "c:\\\\AutoTestCourses\\Drivers\\geckodriver.exe");
            wd = new FirefoxDriver();
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

        @Test
        public void NewSP() {
            wd.get("http://skillsup.ua/about/our-team/");
            wd.findElement(By.linkText("Ольга Симчак\n            \n            \n              тренер, PSPO, PSM")).click();
            wd.navigate().back();
            wd.findElement(By.linkText("Анастасия Педоренко\n            \n            \n              тренер, PSPO")).click();
            wd.findElement(By.xpath("//div[@class='text']//a[.='Погружение в Scrum']")).click();
            wd.navigate().back();
            wd.navigate().back();
            wd.findElement(By.linkText("Виктория Писаренко\n            \n            \n              тренер, PSM, ISTQB CTFL")).click();
            wd.findElement(By.xpath("//div[@class='text']//a[.='Погружение в Scrum']")).click();
            wd.navigate().back();
            wd.navigate().back();
        }

        @After
        public void tearDown() {
            wd.quit();
        }

        public static boolean isAlertPresent(FirefoxDriver wd) {
            try {
                wd.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }

        }
    }

