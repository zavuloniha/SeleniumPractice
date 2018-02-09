/*
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.*;
import static org.junit.Assert.*;

public class NavigateMenu extends BaseTest {

    private By menuEducationLocator = By.xpath(".//*[@id='menu1078']/a");
    private By  menuConsultingLocator = By.xpath(".//*[@id='menu1076']/a");
    private By menuRunITLocator = By.xpath(".//*[@id='menu6600']/a");
    private By menuCarierLocator = By.xpath(".//*[@id='menu1219']/a");
    private By menuOutOfOfficeLocator = By.xpath(".//*[@id='menu1143']/a");
    private By menuKalendarLocator = By.xpath(".//*[@id='menu3020']/a");
    private By menuAboutUsLocator = By.xpath(".//*[@id='menu3039']/a");
    private By menuContactsLocator = By.xpath(".//*[@id='menu1106']/a");

    @Test
    public void testNavigateMenu() {
        wd.get("http://skillsup.ua/");

        WebElement menuEducation = wd.findElement(menuEducationLocator);
        System.out.println(menuEducation.getText());
        WebElement menuConsulting = wd.findElement(menuConsultingLocator);
        System.out.println(menuConsulting.getText());
        WebElement menuRunIT = wd.findElement(menuRunITLocator);
        System.out.println(menuRunIT.getText());
        WebElement menuCarier = wd.findElement(menuCarierLocator);
        System.out.println(menuCarier.getText());
        WebElement menuOutOfOffice = wd.findElement(menuOutOfOfficeLocator);
        System.out.println(menuOutOfOffice.getText());
        WebElement menuKalendar = wd.findElement(menuKalendarLocator);
        System.out.println(menuKalendar.getText());
        WebElement menuAboutUs = wd.findElement(menuAboutUsLocator);
        System.out.println(menuAboutUs.getText());
        WebElement menuContacts = wd.findElement(menuContactsLocator);
        System.out.println(menuContacts.getText());
        List actualmenu= Arrays.asList(menuEducation.getText(), menuConsulting.getText(), menuRunIT.getText(), menuCarier.getText(), menuOutOfOffice.getText(), menuKalendar.getText(), menuAboutUs.getText(), menuContacts.getText());
        List expectedmenu= Arrays.asList("Обучение", "Консалтинг", "RunIT", "Карьера", "Вне офиса", "Календарь", "О нас", "Контакты");

        assertEquals("Обучение", menuEducation.getText());
        assertEquals("Тест не пройден","Консалтинг1", menuConsulting.getText()); }

    @Test
    public void testemptyelement() {
        wd.get("http://skillsup.ua/");
        List<WebElement>  locators=wd.findElements(wrongLocators);
        assert (locators.isEmpty()); }

    }
    **/