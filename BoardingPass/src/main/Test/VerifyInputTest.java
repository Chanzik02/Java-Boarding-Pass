import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyInputTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    VerifyInput input = new VerifyInput();
    BoardingPassTicket ticket = new BoardingPassTicket();

    @org.junit.jupiter.api.Test
    void verifyName() {
        assertEquals(true, input.verifyName("Bill"), "Name does not match.");
        assertNotEquals(true, input.verifyName("123"), "Numbers are included.");
    }

    @Test
    void verifyEmail() {
        assertNotEquals(true, input.verifyEmail("Me&you.com"), "Address not valid.");
    }

    @Test
    void verifyPhoneNumber() {
        assertEquals(true, input.verifyPhoneNumber("1234567890"), "Phone number is false.");
    }

    @Test
    void numberFormat() {
        ticket.setPhoneNumber("1234567890");
        assertEquals("123-456-7890", input.numberFormat("1234567890"), "Dashes in wrong place.");
    }

    @Test
    void verifyAge() {
        assertEquals(true, input.verifyAge(14), "Not an integer.");
    }

    @Test
    void verifyGender() {
        assertEquals(true, input.verifyGender("M"), "Not M or F.");
    }

    @Test
    void verifyMonth() {
        assertEquals(true, input.verifyMonth("12"), "Incorrect input, one");

    }

    @Test
    void verifyDay() {
        assertEquals(true, input.verifyDay("25"), "Incorrect input");
    }

    @Test
    void verifyYear() {
        assertEquals(true, input.verifyYear("2022"), "Incorrect input");
    }

    @Test
    void verifyHour() {
        assertEquals(true, input.verifyMonth("17"), "Incorrect input");
    }

    @Test
    void verifyMinutes() {
        assertEquals(true, input.verifyMonth("30"), "Incorrect input");
    }

    @Test
    void verifyDestination() {
        assertEquals(true, input.verifyDestination("1"), "Wrong character input.");
        assertEquals(false, input.verifyDestination("6"), "Not a destination.");
    }




}