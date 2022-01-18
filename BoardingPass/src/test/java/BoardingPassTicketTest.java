import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTicketTest {

    BoardingPassTicket ticket = new BoardingPassTicket();

    @org.junit.jupiter.api.Test
    void verifyName() {
        assertEquals(true, ticket.verifyName("Bill"), "Name does not match.");
        assertNotEquals(true, ticket.verifyName("123"), "Numbers are included.");
    }

    @Test
    void verifyEmail() {
        ticket.setEmail("Me&you.com");
        assertNotEquals(true, ticket.verifyEmail(), "Address not valid.");
    }

    @Test
    void verifyPhoneNumber() {
        ticket.setPhoneNumber("1234567890");
        assertEquals(true, ticket.verifyPhoneNumber(), "Phone number is false.");
    }

    @Test
    void numberFormat() {
        ticket.setPhoneNumber("1234567890");
        assertEquals("123-456-7890", ticket.numberFormat("1234567890"), "Dashes in wrong place.");
    }

    @Test
    void verifyAge() {
        assertEquals(true, ticket.verifyAge(14), "Not an integer.");
    }

    @Test
    void verifyGender() {
        assertEquals(true, ticket.verifyGender("M"), "Not M or F.");
    }

    @Test
    void verifyDate() {
        assertEquals(true, ticket.verifyDate("082522"), "Wrong input.");
    }







}
