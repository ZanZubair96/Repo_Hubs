import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Distributor {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\PROJECTS\\GITHUB_PROJECT\\REPO_HUB\\Repo_Hubs\\LombokSample\\src\\test\\chromedriver.exe");

        WebDriver driver = null;
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.29.94:4444/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
//        Thread.sleep(10000);
        driver.get("https://www.google.com/");
//        driver.get("https://www.toolsqa.com/");
//        hub.stop();
        driver.close();
    }
}
