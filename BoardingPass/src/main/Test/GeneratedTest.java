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
    void determineMileage() {
        assertEquals(746, generated.determineMileage(String.valueOf(1)), "Mileage to New York incorrect.");
        assertEquals(605, generated.determineMileage(String.valueOf(2)), "Mileage to Miami incorrect.");
        assertEquals(588, generated.determineMileage(String.valueOf(3)), "Mileage to Chicago incorrect.");
        assertEquals(1933, generated.determineMileage(String.valueOf(4)), "Mileage to LA incorrect.");
        assertEquals(2179, generated.determineMileage(String.valueOf(5)), "Mileage to Seattle incorrect.");
        assertNotEquals(2179, generated.determineMileage(String.valueOf(1)), "Incorrect input.");
    }

    @Test
    void ticketPrice() {
        assertEquals(15, generated.ticketPrice(100), "Calculation incorrect");
        assertNotEquals(20, generated.ticketPrice(100), "Checking for incorrect value.");
    }

    @Test
    void discount() {
        assertEquals(100, generated.discount(200, 10, "M"), "Calculation incorrect (12 or younger.)");
        assertEquals(160, generated.discount(400, 60, "F"), "Calculation incorrect (60 or older.)");
        assertEquals(150, generated.discount(200, 40, "F"), "Calculation incorrect (Discount based on gender.)");

    }
}