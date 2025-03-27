import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import io.qameta.allure.Step;
import io.qameta.allure.Epic;
import io.qameta.allure.Epics;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Owner;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random; // Импортируем класс Random для генерации случайных чисел

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.fail; // Импортируем fail() для принудительного падения теста

public class javatestngmaven01 {

    private static final Random RANDOM = new Random(); // Создаем экземпляр Random для генерации случайных значений

    @Test
    @DisplayName("Имя теста") // Отображаемое имя теста
    @Owner("qartavtsev_admin") // Назначаем владельца теста
    @Epics({
        @Epic("Authentication and Access Management"), // Указываем эпик (глобальная категория теста)
    })
    @Features({
        @Feature("Authentication"), // Определяем функциональность, к которой относится тест
    })
    @Stories({
        @Story("Create new issue"), // Определяем конкретный сценарий в рамках функциональности
    })
    public void shouldTest() {
        Allure.label("priority", "1 - High   "); // Устанавливаем приоритет теста
        Allure.label("service", "Monitoring Service"); // Указываем сервис, к которому относится тест
        Allure.label("tag", "Тег"); // Добавляем теги для фильтрации тестов в отчете

        step("Обычный шаг 1"); // Добавляем шаг без вложенных шагов
        step("Обычный шаг 2", () -> { // Создаем шаг с вложенными подшагами
            step("Обычный подшаг 2.1"); // Вложенный подшаг
            step("Обычный подшаг 2.2", () -> { // Вложенный шаг с дополнительными подшагами
                step("Обычный подподшаг 2.2.1"); // Вложенный уровень 3
                step("Обычный подподшаг 2.2.2"); // Вложенный уровень 3
            });
        });

        step("Шаг с ожидаемым результатом 1", () -> { // Шаг, содержащий ожидаемый результат
            step("Ожидаемый результат", () -> { // Отдельный шаг для ожидаемого результата
                step("Ожидаемый результат 1.1"); // Подшаг с ожидаемым результатом
                step("Ожидаемый результат 1.2"); // Подшаг с ожидаемым результатом
            });
        });

        step("Шаг с ожидаемым результатом 2", () -> { // Еще один шаг с ожидаемым результатом
            step("Обычный подшаг в шаге с ожидаемым результатом 2.1"); // Обычный подшаг
            step("Обычный подшаг в шаге с ожидаемым результатом 2.2"); // Еще один подшаг
            step("Ожидаемый результат", () -> { // Ожидаемый результат
                step("Ожидаемый результат 2.1", () -> { // Шаг, который должен иногда падать
                    if (RANDOM.nextBoolean()) { // Случайное число: true (50%) - тест падает, false (50%) - проходит
                        fail("Шаг 'Ожидаемый результат 2.1' упал!"); // Принудительное падение теста
                    }
                });
            });
        });

        step("Шаг с ожидаемым результатом 3", () -> { // Еще один шаг с ожидаемым результатом
            step("Подшаг с ожидаемым результатом в шаге с ожидаемым результатом 3.1", () -> { // Подшаг с ожидаемым результатом
                step("Ожидаемый результат", () -> { // Ожидаемый результат
                    step("Ожидаемый результат 3.1.1"); // Вложенный подшаг с ожидаемым результатом
                });
            });
        });
    }
}
