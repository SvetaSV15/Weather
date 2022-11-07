import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SvetaSV15OnGitHubTest {
    //TC_11_01
    //1.  Открыть базовую ссылку
    //2.  Нажать на пункт меню Guide
    //3.  Подтвердить, что вы перешли на страницу со ссылкой
    // https://openweathermap.org/guide и
    // что title этой страницы OpenWeatherMap API guide - OpenWeatherMap
    @Test
    public void testOpenAndClickToGuide() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Applications\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
        String buttonGuideclick = "Guide";
        String expectedResult1 = "https://openweathermap.org/guide";
        String expectedResult2 = "OpenWeatherMap API guide - OpenWeatherMap";


        driver.get(url);
        Thread.sleep(5000);

        WebElement buttonGuide = driver.findElement(
                By.xpath("//a[@href = '/guide']")
        );

        buttonGuide.click();

        String actualResult2 = driver.getTitle();
        String actualResult1 = driver.getCurrentUrl();

        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);

        driver.quit();


    }

    //TC_11_02
    //1.  Открыть базовую ссылку
    //2.  Нажать на единицы измерения Imperial: °F, mph
    //
    //3.  Подтвердить, что температура для города показана в Фарингейтах
    @Test
    public void testTemperaturaFaringete() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Applications\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";


    //TC_11_05
    //1. Открыть базовую ссылку
    //2. Нажать пункт меню Support → Ask a question
    //3. Заполнить поля Email, Subject, Message
    //4. Не подтвердив CAPTCHA, нажать кнопку Submit
    //5. Подтвердить, что пользователю будет показана
    // ошибка “reCAPTCHA verification failed, please try again.”
//    @Test
//    public void testWenCaptchaIsVerificationFailedInAskAQuestionInSupport()throws InterruptedException{
//        System.setProperty("webdriver.chrome.driver", "C:\\Applications\\Chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        String url = "https://openweathermap.org/";
//        String email = "123456@gmail.ru";
//        String subject = "I want to discuss a purchase of OpenWeather products/subscriptions";
//        String message = "Please help me";
//        String expectedResult = "reCAPTCHA verification failed, please try again.";
//
//        driver.get(url);
//        driver.manage().window().maximize();
//
//        Thread.sleep(5000);
//
//        WebElement menuSupport = driver.findElement(
//                By.xpath("//div[@id = 'support-dropdown']")
//        );
//        menuSupport.click();
//
//        Thread.sleep(500);
//
//        WebElement supportDropDownMenuAskAQuestion = driver.findElement(
//                By.xpath("//ul[@id='support-dropdown-menu']/li/a[@href='https://home.openweathermap.org/questions']")
//        );
//        supportDropDownMenuAskAQuestion.click();
//
//        Thread.sleep(5000);
//
//        WebElement emailField = driver.findElement(By.id("question_form_email")
//        );
//        emailField.click();
//
//
//        emailField.sendKeys(email);
//        driver.quit();



    }
}
