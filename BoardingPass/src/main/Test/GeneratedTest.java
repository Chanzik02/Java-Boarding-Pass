import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratedTest {

    Generated generated = new Generated();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ticketPrice() {
        assertEquals(15, generated.ticketPrice(100), "Calculation incorrect");
        assertNotEquals(20, generated.ticketPrice(100), "Checking for incorrect value.");
    }

    @Test
    void discount() {
        assertEquals(100, generated.discount(200, 10, "M"), "Calculation incorrect (12 or younger.)");
        assertEquals(80, generated.discount(200, 60, "F"), "Calculation incorrect (60 or older.)");
        assertEquals(150, generated.discount(200, 40, "F"), "Calculation incorrect (Discount based on gender.)");
    }
}