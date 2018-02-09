/**
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class BaseTest {
    static FirefoxDriver wd;

@Before
public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "c:\\\\AutoTestCourses\\Drivers2\\geckodriver.exe");
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

    @After
    public void tearDown () {
        wd.quit();
    }
}
**/