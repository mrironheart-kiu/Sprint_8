import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @ParameterizedTest
    @ValueSource(strings = {"Пёрт Иванов", "П т", "Пёрт Иванов14567896"})
    @DisplayName("Валидное имя. Метод возвращает true")
    void shouldReturnTrueForValidName(String name) {
        account = new Account("Пёрт Иванов");
        assertTrue(account.checkNameToEmboss());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "П ", "Пёрт Иванов145678967", "Пёрт  Иванов", " ПёртИванов",
            "ПёртИванов ", "ПёртИванов", ""
    })
    @DisplayName("Невалидное имя. Метод возвращает false")
    void shouldReturnFalseForInvalidName(String invalidName) {
        account = new Account(invalidName);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Невалидное имя = null. Метод возвращает false")
    void shouldReturnFalseForNull() {
        account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }
}