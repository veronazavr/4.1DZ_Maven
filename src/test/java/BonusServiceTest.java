import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shoeldCalculateForRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @Test
    void shoeldCalculateForNotRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
    @Test
    void shoeldCalculateForNotAllRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100_600_0;
        boolean registered = false;
        long expected = 100;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void shoeldCalculateForAllRegisteredUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_600;
        boolean registered = true;
        long expected = 300;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

}
