import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTicketTest {

    BoardingPassTicket ticket = new BoardingPassTicket();

    @org.junit.jupiter.api.Test
    void getName() {
        ticket.setName("Bill");
        assertEquals("Bill", ticket.getName(), "Name does not match.");
        assertNotEquals("123", ticket.getName(), "Numbers are included.");
    }

    @Test
    void getEmail() {
        ticket.setEmail("Me@you.com");
        assertEquals("Me@you.com", ticket.getEmail(), "Address does not match.");
        assertNotEquals("any.not.com", ticket.getEmail(), "Address not valid.");
    }

}

