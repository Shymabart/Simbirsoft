import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.CalculatorPage;
import pageObject.GoogleStartPage;
import properties.ConfProperties;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class mainTest {
    public static GoogleStartPage googleStartPage;
    public static CalculatorPage calculatorPage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера

        driver = new ChromeDriver();
        googleStartPage = new GoogleStartPage(driver);
        calculatorPage = new CalculatorPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginPage"));
        googleStartPage.searchGoogle();
    }
    @Test
    public void firstTest(){
        String memoryStr = "(1 + 2) × 3 - 40 ÷ 5 =";
        String resultStr = "1";
        calculatorPage.clickLeftBracket();
        calculatorPage.clickOneButton();
        calculatorPage.clickPlusButton();
        calculatorPage.clickTwoButton();
        calculatorPage.clickRightBracket();
        calculatorPage.clickMultiplicationButton();
        calculatorPage.clickThreeButton();
        calculatorPage.clickMinusButton();
        calculatorPage.clickMinusButton();
        calculatorPage.clickFourButton();
        calculatorPage.clickZeroButton();
        calculatorPage.clickDivisionButton();
        calculatorPage.clickFiveButton();
        calculatorPage.clickEqualButton();
        assertEquals("Result is Different", calculatorPage.getMemoryText(),memoryStr);
        assertEquals("Result is Dif.Calculate better.", calculatorPage.getResulyext(),resultStr);

    }
    @Test
    public void secondTest(){
        String memoryStr = "6 ÷ 0 =";
        String resultStr = "Infinity";
        calculatorPage.clickSixButton();
        calculatorPage.clickDivisionButton();
        calculatorPage.clickZeroButton();
        calculatorPage.clickEqualButton();
        assertEquals("Result is Different", calculatorPage.getMemoryText(),memoryStr);
        assertEquals("Result is not 'Infinity'.", calculatorPage.getResulyext(),resultStr);

    }
    @Test
    public void thirdTest(){
        String memoryStr = "sin() =";
        String resultStr = "Error";
        calculatorPage.clickSinButton();
        calculatorPage.clickEqualButton();
        assertEquals("Result is Different", calculatorPage.getMemoryText(),memoryStr);
        assertEquals("Result is not 'Error'.", calculatorPage.getResulyext(),resultStr);

    }
    @AfterClass
    public static void tearDown() {
        driver.quit(); }
}
