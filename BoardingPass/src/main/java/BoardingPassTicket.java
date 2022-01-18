import java.time.LocalDate;
import java.util.Scanner;

//Contains info needed to create a Boarding Pass Ticket
public class BoardingPassTicket {
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String date;
    private String month;
    private String day;
    private String year;
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
        this.month = month;
        this.day = day;
        this.year = year;
//        this.origin = origin;
        this.destination = destination;
        this.ETA = ETA;
        this.departureTime = departureTime;
        this.totalTicketPrice = totalTicketPrice;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
       return phoneNumber;

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

    public boolean verifyName(String name) {
        this.name = name;
        if(!name.matches("[a-zA-Z]+")) {
            System.out.println("Name must include letters only.");
            System.out.println("Name: ");
            return false;
        }
        return true;
    }

    public boolean verifyEmail() {
        if(!this.email.contains("@")){
            System.out.println("Must be valid email address.");
            System.out.println("Email: ");
           return false;
        }
        return true;
    }

    public boolean verifyPhoneNumber() {
        String input;
        input = this.phoneNumber.replace(" ", "");
        this.phoneNumber = input;
        if(phoneNumber.equals("")) {
            System.out.println("Empty input. Please enter a phone number.");
            return false;
        }
        if(!phoneNumber.matches("[0-9]+")) {
            System.out.println("Please enter your phone number with no spaces, dashes or (). Example: 1234567890");
            return false;
        }
        if(!(phoneNumber.length() == 10)) {
            System.out.println("Please enter a 10 digit phone number. Example: 1234567890");
            return false;
        }
        return true;
    }

    public String numberFormat(String phone) {
        return this.phoneNumber.substring(0, 3) + "-" + this.phoneNumber.substring(3, 6) + "-" + this.phoneNumber.substring(6, 10);
    }

    public boolean verifyAge(int age) {
        this.age = age;
        if(!String.valueOf(age).matches("[0-9]+")) {
            System.out.println("Please enter your age in digit format only.");
            System.out.println("Age: ");
            return false;
        }
        return true;
    }

    public boolean verifyGender(String gender) {
        this.gender = gender;
        this.gender = this.gender.charAt(0) + "";
        this.gender = this.gender.toUpperCase();
        if(!this.gender.equals("M") && !this.gender.equals("F")) {
            System.out.println("Must enter either M or F");
            return false;
        }
        return true;
    }

    public String todaysDate() {
        LocalDate localDate = LocalDate.now();
        this.date = localDate.toString();
        return this.date;
    }

    public boolean verifyMonth(String month) {
        this.month = month;
        if(this.month.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
        return false;
        if(this.month.)
        }
        return true;
    }

    public boolean verifyDay(String day) {
        this.day = day;
        if(this.day.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
            if(this.day.)
        }
        return true;
    }

    public boolean verifyYear(String year) {
        this.year = year;
        if(this.year.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
            if(this.year.)
        }
        return true;
    }

//    public String formatDate() {
//
//    }


    public void userInput() {
        try{
            System.out.println("Name: ");
            name = sc.nextLine();
           while(this.verifyName(name) == false) {
               name = sc.nextLine();
           };

            System.out.println("eMail: ");
            email = sc.nextLine();
            this.getEmail();

            System.out.println("Phone number, please enter digits only. Example: 1234567890");
            phoneNumber = sc.nextLine();
            this.getPhoneNumber();

            System.out.println("age: ");
            age = Integer.parseInt(sc.nextLine());
            this.getAge();

            System.out.println("Gender (M/F): ");
            gender = sc.nextLine();
            this.getGender();

            System.out.println("What month would you like to travel? (Jan = 1, Dec = 12, etc.) ");
            month = sc.nextLine();
            this.getMonth();

            System.out.println("What date would you like to travel?  ");
            day = sc.nextLine();
            this.getDay();

            System.out.println("What year would you like to travel?  ");
            year = sc.nextLine();
            this.getYear();

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



