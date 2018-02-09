/*
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.OutputType.*;


public class Testnew6 extends BaseTest{

    //private By namemember=By.className("name");
    private By linkOlga = By.linkText("Ольга Симчак\n            \n            \n              тренер, PSPO, PSM");
}
public void wmeth() InterruptedException {
    WebDriverWait wait=new WebDriverWait(wd,10);
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(linkOlga));
}
    @Test
    public void Testnew6() throws InterruptedException {
        //wd.get("http://skillsup.ua/about/our-team/");
        // WebDriverWait wait=new WebDriverWait(wd,10);
        // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(linkOlga)); //TODO обе строчки с вєйт написать в бєйз пєйдже, сделать метод чтоб доджаться єлемента которій будет принимать локатор и время
        //wd.findElement(linkOlga).click();
        JavascriptExecutor js = (JavascriptExecutor) wd;
         js.executeScript("alert(confirm('Question'))");
        Thread.sleep(5000L);
        //WebElement firstTutorOlya = (WebElement)js.executeScript("return document.getElementsByClassName('member')[0];");
        //String firstTutorOlyaName = firstTutorOlya.findElement(By.className("name")).getText();
        // String firstTutorOlyaPosition = firstTutorOlya.findElement( By.className("position")).getText();
        //System.out.println("firstTutorOlyaName = "+firstTutorOlyaName);
        Alert alert=wd.switchTo().alert();
        String textOnAlert=alert.getText();
        assertEquals ("Question", textOnAlert);
        alert.accept();
        //WebDriverWait wait=new WebDriverWait(wd,10);
        //wait.until(ExpectedConditions.alertIsPresent()));
    }
}
*/