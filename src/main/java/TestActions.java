/*
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

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;



public class TestActions extends BaseTest {



    @Test
    public void SelectTest() {
        Actions a = new Actions(wd);

        wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        wd.switchTo().frame("iframeResult");
        WebElement element=wd.findElement(By.xpath("html/body/select"));
        Select select=new Select(element);
        select.selectByValue("opel");
        System.out.println("");
       // wd.get("http://getbootstrap.com/docs/3.3/components/#btn-dropdowns-single/");

    }
    @Test
    public void ActionTest() throws Exception  {

        wd.get("http://getbootstrap.com/docs/3.3/components/#btn-dropdowns-single");

        WebElement elementd=wd.findElement(By.xpath("html/body/div[2]/div/div[1]/div[4]/div[2]/div[1]/button"));
        WebElement elementd2=wd.findElement(By.xpath("html/body/div[2]/div/div[1]/div[4]/div[2]/div[1]/ul/li[2]/a"));
        Actions a2 = new Actions(wd);
     a2.moveToElement(elementd).click().moveToElement(elementd2).clickAndHold().build().perform();

        Thread.sleep(5000L);
    }

}
*/