import java.time.LocalDate;
import java.util.Calendar;
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
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minutes;
    private String destination;
    private String departureTime; //Time for departure using plane, ship, etc.
    private int totalTicketPrice;
    private int passNumber;
    private String ETA; //Estimated Time of Arrival to destination.
    Scanner sc = new Scanner(System.in);
    BoardingCalendar calendar = new BoardingCalendar();
    BoardingTime boardingTime = new BoardingTime();

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

    public String numberFormat() {
        this.phoneNumber = "1234567890";

        return this.phoneNumber.substring(0, 3) + "-" + this.phoneNumber.substring(3, 6) + "-" + this.phoneNumber.substring(6, 10);
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


    public String getDestination() {
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
        if (age < 18) {
            System.out.println("Sorry, you do not meet age requirement.");
            return false;
        }
        this.age = age;
        String ageAsString = Integer.toString(age);
        if(!ageAsString.matches("[0-9]+")) {
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


    public boolean verifyMonth(String month) {
        this.month = month;
        if(this.month.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
        return false;
        //if(this.month.)
        }
        return true;
    }

    public boolean verifyDay(String day) {
        this.day = day;
        if(this.day.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
            //if(this.day.)
        }
        return true;
    }

    public boolean verifyYear(String year) {
        this.year = year;
        if(this.year.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
        }
        return true;
    }

    public boolean verifyHour(String hour) {
        this.hour = hour;
        if (Integer.parseInt(this.hour) < 0 || Integer.parseInt(this.hour) > 23) {
            System.out.println("Hour range is between 0 and 23");
            return false;
        }
        if(this.hour.equals("[a-zA-Z]+")) {
            System.out.println("Please enter a number.");
            return false;
        }

        return true;
    }

    public boolean verifyMinutes(String minutes) {
        this.minutes = minutes;
        if (Integer.parseInt(this.minutes) < 0 || Integer.parseInt(this.minutes) > 59) {
            System.out.println("Minute range is between 0 and 59");
            return false;
        }
        if(this.minutes.equals("[a-zA-Z]+")) {
            System.out.println("Please enter a number.");
            return false;
        }

        return true;
    }

public boolean verifyDestination(String destinationInput) {
        this.destination = destinationInput;
        if (!this.destination.matches("[0-9]+")) {
            System.out.println("Destination may not contain letters.");
            return false;
        }
        int verify = Integer.parseInt(this.destination);
        if(verify < 1 || verify > 5) {
            System.out.println("We don't fly there yet.");
            return false;
        }
        return true;
    }

    public String determineTimeZone() {
        switch (Integer.parseInt(this.destination)) {
            case 3: {
               return "Offset has set your time back by 1 hour";
            }
            case 4:
            case 5: {
                return "Offset has set your time back by 3 hours";
            }
            default: {
                break;
            }
        }
        return "Not an option between 1 and 5";
    }

    public boolean verifyDepartureTime(String departure) {
        this.departureTime = departure;

        return true;
    }

    public int ETA(String destinationInput) {
        this.destination = destinationInput;
        int mileage = Integer.parseInt(this.destination);
        int zoneTime = 0;
        switch (mileage) {
            case 1:
                mileage = 746;
                zoneTime = 0;
                break;
            case 2:
                mileage = 605;
                zoneTime = 0;
                break;
            case 3:
                mileage = 588;
                zoneTime = -1;
                break;
            case 4:
                mileage = 1933;
                zoneTime = -3;
                break;
            case 5:
                mileage = 2179;
                zoneTime = -3;
                break;
        }
        int baseTime = mileage / 500;
//        int eta = departureTime + baseTime + zoneTime
   return 0;
    }


    public void userInput() {
        try{
            System.out.println("Name: ");
            name = sc.nextLine();
           while(!this.verifyName(name)) {
               name = sc.nextLine();
           };

            System.out.println("Email: ");
            email = sc.nextLine();
            while (!this.verifyEmail()) {
                email = sc.nextLine();
            }

            System.out.println("Phone number, please enter digits only. Example: 1234567890");
            phoneNumber = sc.nextLine();
            while (!this.verifyPhoneNumber()) {
                phoneNumber = sc.nextLine();
            }

            System.out.println("age: ");
            age = Integer.parseInt(sc.nextLine());
            while (!verifyAge(age)) {
                age = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Gender (M/F): ");
            gender = sc.nextLine();
            while (!verifyGender(gender)) {
                gender = sc.nextLine();
            }

            System.out.println("During what year would you like to travel?");
            this.year = sc.nextLine();
            while (!calendar.whatIsYear(Integer.parseInt(this.year))) {
                System.out.println("Year must start from this year.");
                this.year = sc.nextLine();
            }

            System.out.println("During what month would you like to travel? (Jan = 1, Dec = 12, etc.) ");
            month = sc.nextLine();
            while (!calendar.whatIsMonth(Integer.parseInt(this.month))) {
                System.out.println("Month must start from this month.");
                this.month = sc.nextLine();
            }

            System.out.println("On what day of the month?");
            day = sc.nextLine();
            while (calendar.whatIsDay(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year))) {
                System.out.println("Date must be a day in advance.");
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
            while(!this.verifyDestination(destination)) {
                System.out.println("Select location by choosing corresponding number.");
                destination = sc.nextLine();
            }

            System.out.println("Time of departure (24 HR Format): ");
            System.out.println("How many hours from now?");
            hour = sc.nextLine();
            while (!this.verifyHour(hour)) {
                hour = sc.nextLine();
            }
            System.out.println("How many minutes from now?");
            minutes = sc.nextLine();
            while (!this.verifyMinutes(minutes)) {
                minutes = sc.nextLine();
            }
            this.setDate(boardingTime.leavingTime(year,month,day,Integer.parseInt(hour),Integer.parseInt(minutes)));
            System.out.println("Your departure time will be on " + this.getDate());



        } catch (Exception e) {
            //System.out.println(e.getMessage());
            throw new RuntimeException("Went Wrong");
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



