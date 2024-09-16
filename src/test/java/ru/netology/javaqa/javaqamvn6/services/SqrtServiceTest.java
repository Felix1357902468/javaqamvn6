package ru.netology.javaqa.javaqamvn6.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2, 100000, 60000, 150000",
            "3, 10000, 3000, 20000"
    })
    public void testSqrt(int expected, int income, int expenses, int threshold) {
        SqrtService service = new SqrtService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

