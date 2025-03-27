# Структура
```
├── .gitignore                         # Файл, исключающий ненужные файлы из Git
├── README.md                          # Документация проекта
├── mvnw                               # Скрипт для запуска Maven Wrapper в Unix/Linux
├── mvnw.cmd                           # Скрипт для запуска Maven Wrapper в Windows
├── pom.xml                            # Основной файл конфигурации Maven
├── .github/                           # Каталог для GitHub Actions и CI/CD
│   └── workflows/                     # Конфигурация автоматизированных процессов
│       └── allure-report.yml          # Скрипт для генерации отчетов Allure
├── .mvn/                              # Директория Maven Wrapper
│   └── wrapper/                       # Файлы для локального запуска Maven
│       ├── maven-wrapper.jar          # JAR-файл для Maven Wrapper
│       └── maven-wrapper.properties   # Настройки Maven Wrapper
├── src/                               # Исходный код проекта
│   ├── test/                          # Тесты проекта
│   │   ├── java/                      # Java-код тестов
│   │   │   └── com/example/testng/    # Пространство имен (пакеты) тестов
│   │   │       └── StepTest.java      # Тестовый класс
│   │   └── resources/                 # Дополнительные ресурсы для тестов
│   │       └── allure.properties      # Конфигурация отчетов Allure
