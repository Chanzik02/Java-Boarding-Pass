import java.time.LocalDate;
import java.util.*;

//Contains info needed to create a Boarding Pass Ticket
public class BoardingPassTicket {
    private String name, email, phoneNumber, gender;
    private int age, totalTicketPrice, passNumber;
    private String date, year, month, day, hour, minutes, destination, departureTime, ETA;
    Scanner sc = new Scanner(System.in);
    BoardingCalendar calendar = new BoardingCalendar();
    BoardingTime boardingTime = new BoardingTime();
    Generated generated = new Generated();
    VerifyInput input = new VerifyInput();
    HashSet<Integer> hashSet = new HashSet<>();
    VerifyInput input = new VerifyInput();


    public BoardingPassTicket() {

    }

    public BoardingPassTicket(String name, String email, String phoneNumber, int age, String gender, int passNumber, String date, String destination, String ETA, String departureTime, int totalTicketPrice) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.passNumber = passNumber;
        this.date = date;
        this.year = year;
        this.month = month;
        this.day = day;
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
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

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
           while(!input.verifyName(name)) {
               name = sc.nextLine();
           };

            System.out.println("Email: ");
            email = sc.nextLine();
            while (!input.verifyEmail(this.email)) {
                email = sc.nextLine();
            }

            System.out.println("Phone number, please enter digits only. Example: 1234567890");
            phoneNumber = sc.nextLine();
            while (!input.verifyPhoneNumber(this.phoneNumber)) {
                phoneNumber = sc.nextLine();
            }

            System.out.println("age: ");
            age = Integer.parseInt(sc.nextLine());
            while (!input.verifyAge(age)) {
                age = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Gender (M/F): ");
            gender = sc.nextLine();
            while (!input.verifyGender(gender)) {
                gender = sc.nextLine();
            }

            System.out.println("During what YEAR would you like to travel?");
            this.year = sc.nextLine();
            while (!this.year.matches("[0-9]+")) {
                System.out.println("Year can only contain numbers.");
                this.year = sc.nextLine();
            }
            while (!calendar.whatIsYear(Integer.parseInt(this.year))) {
                System.out.println("Year must start from this year.");
                this.year = sc.nextLine();
            }

            System.out.println("During what MONTH would you like to travel? (Jan = 1, Dec = 12, etc.) ");
            month = sc.nextLine();
            while (!this.month.matches("[0-9]+")) {
                System.out.println("Month can only contain numbers.");
                this.month = sc.nextLine();
            }
            while (!calendar.whatIsMonth(Integer.parseInt(this.month))) {
                System.out.println("Month must start from this month.");
                this.month = sc.nextLine();
            }

            System.out.println("On what DAY of the month?");
            day = sc.nextLine();
            while (!this.day.matches("[0-9]+")) {
                System.out.println("Day can only contain numbers.");
                this.day = sc.nextLine();
            }
            while (!calendar.whatIsDay(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year))) {
                this.day = sc.nextLine();
            }

            System.out.println("Destination:\n" +
                    "For New York, NY enter 1; \n" +
                    "For Miami, FL enter 2; \n" +
                    "For Chicago, IL enter 3; \n" +
                    "For Los Angeles, CA enter 4 \n" +
                    "For Seattle, WA enter 5. ");
            System.out.println("Choose your location.");
            destination = sc.nextLine();
            while(!input.verifyDestination(destination)) {
                System.out.println("Select location by choosing corresponding number.");
                destination = sc.nextLine();
            }

            System.out.println("What is your Time of departure? (24 HR Format): ");
            hour = sc.nextLine();
            while (!input.verifyHour(hour)) {
                hour = sc.nextLine();
            }
            System.out.println("How many MINUTES after " + this.hour + ":00 ?");
            minutes = sc.nextLine();
            while (!input.verifyMinutes(minutes)) {
                minutes = sc.nextLine();
            }

            this.setDate(boardingTime.leavingTime(year, month, day, Integer.parseInt(hour), Integer.parseInt(minutes), destination));
            System.out.println("Your estimated arrival time will be on " + this.getDate());

            this.passNumber = Integer.parseInt(generated.generatePassNumber());

            if (this.hashSet.contains(this.passNumber)) {
                while (this.hashSet.contains(this.passNumber)) {

                    this.passNumber = Integer.parseInt(generated.generatePassNumber());
                    this.hashSet.add(this.passNumber);
                }
            }
            else {
                this.hashSet.add(this.passNumber);
            }
            System.out.println("Here is your Boarding Pass Number " + generated.generatePassNumber());

            int a = generated.determineMileage(this.destination);
            float b = generated.ticketPrice(a);
            float discount = generated.discount((int)b, this.age, this.gender);
            System.out.println("Your total is $" + discount);

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            throw new RuntimeException("Something Went Wrong in userInput try catch.");
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