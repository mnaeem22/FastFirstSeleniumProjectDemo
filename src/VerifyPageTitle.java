
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VerifyPageTitle {
    public static void main(String[] args){
        //Initialize the browser
     //   WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
     //   WebDriver driver = new EdgeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        //Get browser name and version
        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        // Get the browser name
        String browserName = ((Capabilities) caps).getBrowserName();

        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        if(pageTitle.contains("Doogle"))
        {
            System.out.println("Test is pass");
        }
        else {
            System.out.println("Test is fail");
        }
        System.out.println("Page title is "+ pageTitle);
        System.out.println("Browser is "+ browserName);
        driver.quit();
    }
}
