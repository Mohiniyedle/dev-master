plugins {
  id "org.sonarqube" version "3.3"
}

sonarqube {
  properties {
    property "sonar.projectKey", "myproject"
  }
}
