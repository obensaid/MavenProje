package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {

    public static <list> void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("samsung headphones"+ Keys.ENTER);

      WebElement sayilar = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sayilar.getText());
        WebElement ilkLink = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        System.out.println(ilkLink.getText());
        List<WebElement> tumUrunler =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement w : tumUrunler) {
            System.out.println(w.getText());
        }
    }
}
