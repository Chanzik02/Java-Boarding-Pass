import java.util.Scanner;

//Contains info needed to create a Boarding Pass Ticket
public class BoardingPassTicket {
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String date;
    private String destination;
    private String departureTime; //Time for departure using plane, ship, etc.
    // private String origin;
    private int totalTicketPrice;
    private int passNumber;
    private String ETA; //Estimated Time of Arrival to destination.
    Scanner sc = new Scanner(System.in);

    public BoardingPassTicket() {

    }

    public BoardingPassTicket(String name, String email, String phoneNumber, int age, String gender, int passNumber, String date, String origin, String destination, String ETA, String departureTime, int totalTicketPrice) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.passNumber = passNumber;
        this.date = date;
//        this.origin = origin;
        this.destination = destination;
        this.ETA = ETA;
        this.departureTime = departureTime;
        this.totalTicketPrice = totalTicketPrice;
    }

    public String getName() {
        if(!this.name.matches("[a-zA-Z]+")) {
            System.out.println("Name must include letters only.");
            System.out.println("Name: ");
            name = sc.nextLine();
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        if(!this.email.contains("@")){
            System.out.println("Must be valid email address.");
            System.out.println("Email: ");
            email = sc.nextLine();
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        String input = "";
        input = this.phoneNumber.replace(" ", "");
        if(input.equals("")) {
            System.out.println("Empty input. Please enter a phone number.");
            phoneNumber = sc.nextLine();
        }
        if(!input.matches("[0-9]+")) {
            System.out.println("Phone number can only contain numbers. Example (123) 456-7890: ");
            phoneNumber = sc.nextLine();
        }
        if(!(input.length() == 10)) {
            System.out.println("Please enter a 10 digit phone number. Example: 123-456-7890");
            phoneNumber = sc.nextLine();
        }
        return input;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setTotalTicketPrice(int totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }

    public void userInput() {
        try{
            System.out.println("Name: ");
            name = sc.nextLine();
            this.getName();

            System.out.println("eMail: ");
            email = sc.nextLine();
            this.getEmail();

            System.out.println("Phone number- example: 123-456-7890: ");
            phoneNumber = sc.nextLine();
            this.getPhoneNumber();

            System.out.println("age: ");
            age = Integer.parseInt(sc.nextLine());
            this.getAge();

            System.out.println("Gender (M/F): ");
            gender = sc.nextLine();
            this.getGender();

            System.out.println("Date of departure MM/DD/YY: ");
            date = sc.nextLine();
            this.getDate();

            System.out.println("Destination: ");
            destination = sc.nextLine();
            this.getDestination();

            System.out.println("Time of departure (24 HR Format: ");
            departureTime = sc.nextLine();
            this.getDepartureTime();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "BOARDING PASS TICKET" + "\n" +
                "- Name = " + name + "\n" + "    |" + "\n" +
                "- Email = " + email + "\n" + "    |" + "\n" +
                "- PhoneNumber = " + phoneNumber + "\n" + "    |" + "\n" +
                "- Age = " + age + "\n" + "    |" + "\n" +
                "- Gender = " + gender + "\n" + "    |" + "\n" +
                "- Date = " + date + "\n" + "    |" + "\n" +
//                "- Origin = " + origin + "\n" + "    |" + "\n" +
                "- Destination = " + destination + "\n" + "    |" + "\n" +
                "- DepartureTime = " + departureTime + "\n" + "\n" +
                "- PassNumber = " + passNumber + "\n" + "    |" + "\n" +
                "- ETA = " + ETA + "\n" + "    |" + "\n" +
                "- TOTAL: " + totalTicketPrice
                ;


    }
}
