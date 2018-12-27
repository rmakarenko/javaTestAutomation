package youtubeSeleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;


public class youtubeOpener {

    @Test

    public void navigateToAvito() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/roman/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        String pageName =  driver.getTitle();

        System.out.println(pageName);



        assertTrue("the Page is not avito", pageName.contains("avito"));


        //test git push

        /*
        public void isYoutubePage() {
            assumeThat("Page mismatch! Current page is not CoCa tariff catalog! ", getTitle(), containsString(TestData.Tariffs.tariffFamilyFamilyCard));
        }



        /*


        WebElement element = driver.findElement(By.xpath("html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/div[2]/ytd-button-renderer/a/paper-button/yt-formatted-string"));
        element.click();

        WebElement elementLogin = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input"));
        elementLogin.click();
        elementLogin.sendKeys("roman.makarenko.spb@gmail.com");

        WebElement elementNext = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span"));
        elementNext.click();

        WebElement elementPass = driver.findElement(By.cssSelector(".whsOnd.zHQkBf"));
        //elementPass.click();
        elementPass.sendKeys("goodspeed");

        //#passwordNext > content > span
           //     <span class="RveJvd snByac">Далее</span>
        //*[@id="passwordNext"]/content/span

        WebElement elementNextLast = driver.findElement(By.xpath(".//*[@id=\"passwordNext\"]/content/span\n"));
        elementNextLast.click();

        //elementNext.click();

        //driver.close();

        WebElement elementPassword = driver.findElement(By.name("password"));
        elementPassword.click();
        elementPassword.sendKeys("console123");

        WebElement elementEnter = driver.findElement(By.name("submit"));
        elementEnter.click();

        //driver.close();


        */

    }}

