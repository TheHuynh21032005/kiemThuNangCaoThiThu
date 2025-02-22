package org.example.phan3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class testPhan3 {

    private ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
        driver.get("https://vitimex.com.vn/dai-ly.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement tinh = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='province']")));
        tinh.sendKeys("Hà Nội");

        WebElement huyen = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search-showroom']")));
        huyen.sendKeys("Ninh Bình");

        // Kiểm tra giá trị đã nhập
        assertEquals("Hà Nội", tinh.getAttribute("value"));
        assertEquals("Ninh Bình", huyen.getAttribute("value"));
    }

    @Test
    public void test2() {
        driver.get("https://vitimex.com.vn/ao-polo-nam-vitimex-atr3038-dp1318.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement size = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='size1']")));
        WebElement them = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='addCart_page0']")));

        size.click();
        them.click();

    }
}