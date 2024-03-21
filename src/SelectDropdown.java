//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appcrunk QA\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        ChromeOptions Options;
        WebDriver driver = new ChromeDriver(options);


        driver.manage().window().maximize();

        driver.get("https://www.sugarcrm.com/au/request-demo");

      WebElement dropdown = (WebElement) driver.findElements(By.name("awareness_source_c"));

        Select select = new Select(dropdown);

//      Select.selectByvalue (value);
//      Select.selectByvisibleText(text);
//      Select.selectByIndex(2);


    }

    }



