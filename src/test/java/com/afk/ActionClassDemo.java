package com.afk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionClassDemo {
    @Test
    public void actionDemo() throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        Actions action= new Actions(driver);
        WebElement HamBurger = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
        HamBurger.click();
//   WebElement NewReleases = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='New Releases']"));
//
//
//   action.moveToElement(NewReleases)
//
//               // .keyDown(Keys.CONTROL)
//                .click()
//                //.keyUp(Keys.CONTROL)
//                .build()
//                .perform();
        Thread.sleep(2000);
        driver.quit();
            }
        }
