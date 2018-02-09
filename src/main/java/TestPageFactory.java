/**
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.OutputType.*;

public class TestPageFactory extends BaseTest{

        private By linkOlga=By.linkText("Ольга Симчак\n            \n            \n              тренер, PSPO, PSM");
        private By linkAnstasia=By.linkText("Анастасия Педоренко\n            \n            \n              тренер, PSPO ");
        private By linkVictorya=By.linkText("Виктория Писаренко\n            \n            \n              тренер, PSM, ISTQB CTFL");

    @Test
    public void testPageFactory() {
        wd.get("http://skillsup.ua/about/our-team/");
        wd.findElement(linkOlga).click();
        wd.navigate().back();
        wd.findElement(linkAnstasia).click();
        wd.findElement(By.xpath("//div[@class='text']//a[.='Погружение в Scrum']")).click();
        wd.navigate().back();
        wd.navigate().back();
        wd.findElement(linkVictorya).click();
        wd.findElement(By.xpath("//div[@class='text']//a[.='Погружение в Scrum']")).click();
        wd.navigate().back();
        wd.navigate().back();
    }

}
**/