package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")

    public void shouldCalculateCaseOne(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
