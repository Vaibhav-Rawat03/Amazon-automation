import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1{
    public static void main(String args[]){
        System.getProperty("webdriver.chrome.driver", "\"D:\\chromedriver-win64\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leetcode.com/ ");
    }
}