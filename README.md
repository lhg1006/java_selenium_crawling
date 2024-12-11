# Selenium과 WebDriver Manager를 활용한 웹 크롤링 애플리케이션

이 애플리케이션은 **Java**, **Selenium**, 그리고 **WebDriver Manager**를 사용하여 웹 페이지를 크롤링하는 프로그램입니다. 사용자는 전체 HTML 소스, 특정 요소, 이미지 소스, 그리고 HTML 태그를 제거한 텍스트를 크롤링할 수 있습니다.

---

## 주요 기능

- **전체 HTML 크롤링**: 웹 페이지의 전체 HTML 소스를 가져옵니다.
- **특정 요소 크롤링**: CSS 선택자를 사용해 특정 요소를 선택하고 내용을 가져옵니다.
- **태그 제거 크롤링**: HTML 태그를 제거하고 텍스트만 추출합니다.
- **이미지 소스 크롤링**: 웹 페이지의 모든 이미지 소스 URL을 가져옵니다.

---

## 사전 준비

1. **Java 17 이상** 설치
2. **Gradle** 설치 (빌드 도구)
3. **Chrome 브라우저** 설치

---

## 설정 방법

1. **대상 URL 및 선택자 설정**:
   - `src/main/java/org/hyo/Main.java` 파일에서 `TARGET_URL`과 `TARGET_SELECTOR` 값을 수정하세요.
     ```java
     private static final String TARGET_URL = "https://your-target-url.com";
     private static final String TARGET_SELECTOR = "#your-css-selector";
     ```

---

## 실행 방법

1. **레포지토리를 포크하세요**:
   - 오른쪽 상단의 **Fork** 버튼을 클릭하여 자신의 GitHub 계정으로 레포지토리를 복사합니다.

2. **포크한 레포지토리를 클론하세요**:
   ```bash
   git clone https://github.com/your-username/your-forked-repository.git
   cd your-forked-repository
