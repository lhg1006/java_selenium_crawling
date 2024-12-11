package org.hyo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Scanner;

public class Main {
  // 설정 하여 사용 .
  private static final String TARGET_URL = "";
  private static final String TARGET_SELECTOR = "";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("선택하세요:");
      System.out.println("1. Full HTML 크롤링");
      System.out.println("2. Selector 크롤링");
      System.out.println("3. Tag Clear 크롤링");
      System.out.println("4. 이미지 소스 크롤링");
      System.out.println("0. 종료");
      System.out.print("입력: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // 버퍼 클리어

      switch (choice) {
        case 1:
          FullHtmlCrawling();
          break;
        case 2:
          SelectorCrawling();
          break;
        case 3:
          TagClearCrawling();
          break;
        case 4:
          ImageSourceCrawling();
          break;
        case 0:
          System.out.println("프로그램을 종료합니다.");
          scanner.close();
          return;
        default:
          System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
      }
    }
  }


  public static void FullHtmlCrawling() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    try {
      driver.get(TARGET_URL);
      Thread.sleep(5000); // 페이지 로드 대기
      String pageSource = driver.getPageSource();
      System.out.println("HTML 소스:");
      System.out.println(pageSource);
    } catch (Exception e) {
      System.out.println("HTML 크롤링 중 오류가 발생했습니다: " + e.getMessage());
    } finally {
      driver.quit();
    }
  }

  public static void SelectorCrawling() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    try {
      driver.get(TARGET_URL);
      Thread.sleep(5000); // 페이지 로드 대기
      WebElement element = driver.findElement(By.cssSelector(TARGET_SELECTOR));
      System.out.println("선택한 요소:");
      System.out.println(element.getText());
    } catch (Exception e) {
      System.out.println("Selector 크롤링 중 오류가 발생했습니다: " + e.getMessage());
    } finally {
      driver.quit();
    }
  }

  public static void TagClearCrawling() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    try {
      driver.get(TARGET_URL);
      Thread.sleep(5000); // 페이지 로드 대기
      String pageSource = driver.getPageSource().replaceAll("<[^>]*>", ""); // 태그 제거
      System.out.println("태그가 제거된 HTML:");
      System.out.println(pageSource);
    } catch (Exception e) {
      System.out.println("Tag Clear 크롤링 중 오류가 발생했습니다: " + e.getMessage());
    } finally {
      driver.quit();
    }
  }

  public static void ImageSourceCrawling() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    try {
      driver.get(TARGET_URL);
      Thread.sleep(5000); // 페이지 로드 대기
      List<WebElement> images = driver.findElements(By.tagName("img"));
      System.out.println("이미지 소스들:");
      for (WebElement img : images) {
        System.out.println(img.getAttribute("src"));
      }
    } catch (Exception e) {
      System.out.println("이미지 소스 크롤링 중 오류가 발생했습니다: " + e.getMessage());
    } finally {
      driver.quit();
    }
  }
}