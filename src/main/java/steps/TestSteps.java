package steps;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestSteps {
    static FirefoxDriver wd;

    @BeforeStory
    public void Webdriver() throws Exception {
        System.setProperty("webdriver.gecko.driver", "c:\\\\AutoTestCourses\\Drivers2\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @AfterStory
    public void Quitdriver() {
        wd.close();
    }

    @Given("open browser")
    public void OpenBrowser() {
        wd.get("http://skillsup.ua/");
    }




}
