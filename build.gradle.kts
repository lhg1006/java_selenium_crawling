plugins {
    id("java")
}

group = "org.hyo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit for testing
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Selenium
    implementation("org.seleniumhq.selenium:selenium-java:4.19.1")

    // WebDriver Manager (optional for managing ChromeDriver)
    implementation("io.github.bonigarcia:webdrivermanager:5.5.3")

    // Logging (optional)
    implementation("org.slf4j:slf4j-api:2.0.9")
    runtimeOnly("org.slf4j:slf4j-simple:2.0.9")
}

tasks.test {
    useJUnitPlatform()
}