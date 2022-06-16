import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebScrapping {
    private static String url;
    private String link;

    public WebScrapping(String username){
        url = "https://www.facebook.com/";
        link = url + username;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kedar\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();

        while (true){
            WebElement webElement = driver.findElement(By.xpath("//*[@id=\"mount_0_0_H+\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div/a/div/svg/g"));
            webElement.click();
            break;
        }



    }
}
