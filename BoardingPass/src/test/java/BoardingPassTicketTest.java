import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTicketTest {

    BoardingPassTicket ticket = new BoardingPassTicket();

    @org.junit.jupiter.api.Test
    void getName() {
        ticket.setName("Bill");
        assertEquals("Bill", ticket.getName(), "Name does not match.");
        assertNotEquals("123", ticket.getName(), "Numbers are included.");
    }



//    @org.junit.jupiter.api.Test
//    void getNameFalse() {
//        ticket.setName("Sue");
//        assertFalse("Sue", ticket.getName(), "Name does not match.");
//
//    }
}