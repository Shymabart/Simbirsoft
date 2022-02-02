package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    private WebDriver driver;
    public  CalculatorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /**
     *  Кнопка "("
     */
    @FindBy(xpath = "//div[@jsname='j93WEe']")
    private WebElement leftBracket;
    public  void clickLeftBracket(){
        leftBracket.click();
    }

    /**
     *  Кнопка ")"
     */
    @FindBy(xpath = "//div[@jsname='qCp9A']")
    private WebElement rightBracket;
    public  void clickRightBracket(){
        rightBracket.click();
    }

    /**
     *  Кнопка "0"
     */
    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    private WebElement zeroButton;
    public  void clickZeroButton(){
        zeroButton.click();
    }

    /**
     *  Кнопка "1"
     */
    @FindBy(xpath = "//div[@jsname='N10B9']")
    private WebElement oneButton;
    public  void clickOneButton(){ oneButton.click(); }

    /**
     *  Кнопка "2"
     */
    @FindBy(xpath = "//div[@jsname='lVjWed']")
    private WebElement twoButton;
    public  void clickTwoButton(){ twoButton.click(); }

    /**
     *  Кнопка "3"
     */
    @FindBy(xpath = "//div[@jsname='KN1kY']")
    private WebElement threeButton;
    public  void clickThreeButton(){ threeButton.click(); }

    /**
     *  Кнопка "4"
     */
    @FindBy(xpath = "//div[@jsname='xAP7E']")
    private WebElement fourButton;
    public  void clickFourButton(){ fourButton.click(); }

    /**
     *  Кнопка "5"
     */
    @FindBy(xpath = "//div[@jsname='Ax5wH']")
    private WebElement fiveButton;
    public  void clickFiveButton(){ fiveButton.click(); }

    /**
     *  Кнопка "6"
     */
    @FindBy(xpath = "//div[@jsname='abcgof']")
    private WebElement sixButton;
    public  void clickSixButton(){ sixButton.click(); }

    /**
     *  Кнопка "+"
     */
    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    private WebElement plusButton;
    public  void clickPlusButton(){ plusButton.click(); }

    /**
     *  Кнопка "-"
     */
    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    private WebElement minusButton;
    public  void clickMinusButton(){ minusButton.click(); }

    /**
     *  Кнопка "*"
     */
    @FindBy(xpath = "//div[@jsname='YovRWb']")
    private WebElement multiplicationButton;
    public  void clickMultiplicationButton(){ multiplicationButton.click(); }

    /**
     *  Кнопка "/"
     */
    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    private WebElement divisionButton;
    public  void clickDivisionButton(){ divisionButton.click(); }

    /**
     *  Кнопка "="
     */
    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    private WebElement equalButton;
    public  void clickEqualButton(){ equalButton.click(); }

    /**
     *  Кнопка "sin"
     */
    @FindBy(xpath = "//div[@jsname='aN1RFf']")
    private WebElement sinButton;
    public  void clickSinButton(){ sinButton.click(); }

    /**
     *  Строка памяти
     */
    @FindBy(xpath = "//span[@class='vUGUtc']")
    private WebElement memoryString;
    public  String getMemoryText(){
        return  memoryString.getText();}
    /**
     *  Строка результата
     */
    @FindBy(xpath = "//span[@class='qv3Wpe']")
    private WebElement resultString;
    public  String getResulyext(){
        return  resultString.getText();}



}
