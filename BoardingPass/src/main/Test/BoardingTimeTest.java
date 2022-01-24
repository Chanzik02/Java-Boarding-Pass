import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingTimeTest {

    BoardingTime time = new BoardingTime();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

@Test
    public  void departureTime() {
        assertEquals("Sat Dec 24 05:30:00 2022", time.departureTime("2022","12", "24",5, 30), "Departure time is incorrect." );
}



}