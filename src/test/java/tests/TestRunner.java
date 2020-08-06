package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestRunner {
    private String url = "http://dev.pyoor.co/";
    private static WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger( TestRunner.class.getName() );

    protected WebDriver launch() throws InterruptedException {
        LOGGER.info( "TestRunner.launch() starts");
        WebDriver driver = getDriver();
        LOGGER.info("TestRunner.launch() running get(" + url + ")");
        driver.get(url);
        LOGGER.info("TestRunner.launch() running window().maximize()");
        driver.manage().window().maximize();
        LOGGER.info("TestRunner.launch() .timeouts().implicitlyWait()");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        LOGGER.info("TestRunner.launch() finished");
        return driver;
    }
    protected WebDriver getDriver() throws InterruptedException {
        LOGGER.info("TestRunner.getDriver() starts");
        if (driver == null) {
            LOGGER.info("TestRunner.getDriver() driver is null");

            LOGGER.info("TestRunner.getDriver() chromedriver().setup() running");
            WebDriverManager.chromedriver().setup();

            LOGGER.info("TestRunner.getDriver() creating ChromeDriver()");
            driver = new ChromeDriver();
            launch();
            Thread.sleep(2000);
        }

        LOGGER.info("TestRunner.getDriver() finished");
        return driver;
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOGGER.info("TestRunner.afterClass() starts");
        driver.quit();
        driver = null;
        LOGGER.info("TestRunner.afterClass() finished");
    }
}
