package avitoTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchFirst {

    @Test

    public void SearchCategory () {

        System.setProperty("webdriver.chrome.driver", "C:/Users/roman/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.avito.ru/sankt-peterburg");

        WebElement elementCategoryValue = driver.findElement(By.partialLinkText("Билеты и путешествия"));
        elementCategoryValue.click();

        WebElement elementCategoryMetro = driver.findElement(By.xpath(".//*[@id='directions']/div"));
        elementCategoryMetro.click();

        WebElement elementCategoryDeviatkino = driver.findElement(By.xpath("svg:svg/svg:g/svg:text[36]"));
        elementCategoryDeviatkino.click();

        driver.close();


    }
}