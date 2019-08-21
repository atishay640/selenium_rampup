package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        String driverPath = "/Users/macbookpro/Documents/atishay/chromedriver";

        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("How to use selenium \n");
        driver.findElement(By.xpath("http://picdeer.org/atishay.py"));

        driver.close();
    }
}