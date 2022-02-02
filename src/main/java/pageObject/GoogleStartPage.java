package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStartPage {
    private WebDriver driver;
    public  GoogleStartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * Поле ввода запроса
     */
    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement requestInput;

    /**
     * Поле ввода пароля
     */
    @FindBy(xpath = "//input[@name='btnK']")
    private WebElement searchButton;

    /**
     * Принимаем куки
     */
    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElement acceptCookies;



    /**
     * Метод для поиска
     */
    public void searchGoogle(){
        acceptCookies.click();
        requestInput.click();
        requestInput.sendKeys("Калькулятор");
        searchButton.click();
    }

}
