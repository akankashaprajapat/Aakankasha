//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.bouncycastle.oer.its.IValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class Freeyourkitchen {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Appcrunk QA\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        ChromeOptions Options;
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.freeyourkitchen.com/");

        WebElement joinAsRestaurantElement = driver.findElement(By.className("join_as_restro"));

        // Performing click action on the element
        joinAsRestaurantElement.click();

        //Finding element by class name
        WebElement restaurantsignup = driver.findElement(By.className("inside_join_as_restro_div3"));

        // Performing actions
        restaurantsignup.click();


        //signuppage for restaurant
        // Finding element by class name
        WebElement Name = driver.findElement(By.name("restaurantName"));
        // Performing actions
        Name.sendKeys("Amrit");

        WebElement dropdownInput = driver.findElement(By.id("react-select-2-input"));

        // Click on the dropdown input to open the dropdown
        dropdownInput.click();

        // Find the option you want to select from the dropdown list
        WebElement option = driver.findElement(By.xpath("//div[@class='select__option' and text()='Your Option Text']"));

        // Click on the option to select it
        option.click();

        Select select = new Select(option);

    }

}
