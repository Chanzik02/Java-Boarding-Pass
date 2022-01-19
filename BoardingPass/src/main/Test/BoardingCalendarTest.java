import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingCalendarTest {

    BoardingCalendar calendar = new BoardingCalendar();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whatIsYear() {
        assertEquals(true, calendar.whatIsYear(2022), "Wrong year selected.");
        assertEquals(false, calendar.whatIsYear(2021), "Year has already happened.");
    }

    @Test
    void whatIsMonth() {
        assertEquals(true, calendar.whatIsMonth(1), "Wrong month selected.");
        assertEquals(false, calendar.whatIsMonth(0), "Month doesn't exist.");
        assertEquals(false, calendar.whatIsMonth(13), "Month doesn't exist.");
    }

    @Test
    void whatIsDay() {
        assertEquals(true, calendar.whatIsDay(31,1, 2022), "Allowed wrong day.");
        assertEquals(false, calendar.whatIsDay(31,2,2022), "Allowed wrong day.");
        assertEquals(false, calendar.whatIsDay(0,2,2022), "Allowed wrong day.");
        assertEquals(false, calendar.whatIsDay(31,13,2021), "Allowed wrong day.");
    }
}