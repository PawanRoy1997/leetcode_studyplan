import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
    jacoco
    id("org.sonarqube") version("3.5.0.2730")
}

group = "pawanroy.leetcode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport{
    dependsOn(tasks.test)
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}

jacoco {
    toolVersion = "0.8.8"
    reportsDirectory.set(layout.buildDirectory.dir("customJacocoReportDir"))
}

sonarqube {
    properties {
        property ("sonar.projectKey", "PawanRoy1997_leetcode_studyplan")
        property ("sonar.organization", "pawanroy1997")
        property( "sonar.host.url", "https://sonarcloud.io")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}