import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        BoardingPassTicket ticket = new BoardingPassTicket();
        File file  = new File();
        System.out.println("WELCOME!!!" + "\nWe require your information to create a ticket." + "\n");
        ticket.userInput();
//         file.readFile();



    }
}
