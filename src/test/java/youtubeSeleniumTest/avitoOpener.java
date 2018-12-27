package youtubeSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class avitoOpener {

    @Test

    public void navigateToAvito() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/roman/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.avito.ru/sankt-peterburg");


        WebElement element = driver.findElement(By.cssSelector(".header-services-menu-link-IZnN3.header-services-menu-link-not-authenticated-1TAH-"));
        element.click();

        WebElement elementLogin = driver.findElement(By.name("login"));
        elementLogin.click();
        elementLogin.sendKeys("89516581827");

        WebElement elementPassword = driver.findElement(By.name("password"));
        elementPassword.click();
        elementPassword.sendKeys("console123");

        WebElement elementEnter = driver.findElement(By.name("submit"));
        elementEnter.click();

        //driver.close();
    }}

