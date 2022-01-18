import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
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
        return this.name;
    }

    public boolean nameValidation(String aName) {
        if(!aName.matches("[a-zA-Z]+")) {
            System.out.println("Name must include letters only.");
            return false;
        }
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public boolean emailValidation() {
        while(!this.email.contains("@")){
            System.out.println("Must be valid email address.");
            System.out.println("Email: ");
        }
        return true;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Boolean phoneNumberValidation() {
        String input = "";
        input = this.phoneNumber.replace(" ", "");
        if(input.equals("")) {
            System.out.println("Empty input. Please enter a phone number.");
            return false;
        }
        if(!input.matches("[0-9]+")) {
            System.out.println("Phone number can only contain numbers. Example (123) 456-7890: ");
            return false;
        }
        if(!(input.length() == 10)) {
            System.out.println("Please enter a 10 digit phone number. Example: 123-456-7890");
            return false;
        }
        return true;

    }

    public String numberFormat() {
        this.phoneNumber = "1234567890";

        return this.phoneNumber.substring(0, 3) + "-" + this.phoneNumber.substring(3, 6) + "-" + this.phoneNumber.substring(6, 10);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        String input = "";
        input = Integer.toString(this.age).replace(" ", "");
        if(input.equals("")) {
            System.out.println("Empty value. Please enter your age.");
            age = Integer.parseInt(sc.nextLine());
        }
        if (!input.matches("[0-9]+")) {
            System.out.println("Your age should only contain numbers: ");
            age = Integer.parseInt(sc.nextLine());
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        this.gender = gender;
        gender = gender.charAt(0) + "";
        gender = gender.toUpperCase();
        if (input.equals("")) {
            System.out.println("Please enter M or F. Gender (M/F): ");

        }
        return input;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber() {
        //Make sure to add HashSet to class
        Random random = new Random();
        int passNumber = 0;
        int randomint1 = random.nextInt(10);
        int randomint2 = random.nextInt(10);
        int randomint3 = random.nextInt(10);
        int randomint4 = random.nextInt(10);
        int randomint5 = random.nextInt(10);
        int randomint6 = random.nextInt(10);
        int randomint7 = random.nextInt(10);
        int randomint8 = random.nextInt(10);
        String number = "" + randomint1 + randomint2 + randomint3 + randomint4 + randomint5 + randomint6
                + randomint7 + randomint8;
        passNumber = Integer.parseInt(number);
        this.passNumber = passNumber;
        System.out.println(this.passNumber);
    }

    public String getDate() {
        return this.date;
    }

    public void setDate() {
        LocalDate localDate = LocalDate.now();
        this.date = localDate.toString();

        String month = "";
        String day = "";
        String year = "";


    }

    public String month(int month) {
        if (month) {

        }
        return Integer.toString(month);
    }

//    public String getOrigin() {
//        return origin;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }

    public String getDestination() {
        //Suggestion: Create our own destinations
        if (!this.destination.matches("[a-zA-Z]+")) {
            System.out.println("Destination must only contain letters.");
            this.destination = sc.nextLine();
        }
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /*
     * Have to do some conversions
     * Get current time, convert to string
     * Compare current time to destination's time zone time
     * ETA will be an estimate in hours
     */
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

    /*
     * Base off distance
     */
    public int getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public void setTotalTicketPrice(int totalTicketPrice) {
        this.totalTicketPrice = totalTicketPrice;
    }

    public void userInput() {
        try{
            System.out.println("Name: ");
            this.name = sc.nextLine();
            while (!this.nameValidation(this.name)) {
                this.name = sc.nextLine();
            }


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
