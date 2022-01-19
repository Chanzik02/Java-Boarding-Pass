import java.util.Calendar;
import java.util.Scanner;

public class BoardingCalendar {
    Calendar calendar = Calendar.getInstance();
    Scanner sc = new Scanner(System.in);

    public BoardingCalendar() {

    }

    public boolean whatIsYear(int userSpecifiedYear) {
        if(userSpecifiedYear < calendar.get(Calendar.YEAR)) {
            System.out.println("Selected year out of range.");
            return false;
        }
        return true;
    }

    public boolean whatIsMonth(int userSpecifiedMonth) {
        if (userSpecifiedMonth <= 0 || userSpecifiedMonth >= 13) {
            System.out.println("Selected month out of range.");
            return false;
        }
        else {
            if (userSpecifiedMonth < (calendar.get(Calendar.MONTH) + 1)) {
                System.out.println("Selected month out of range.");
                return false;
            }
            return true;
        }
    }

    public boolean whatIsDay(int userSpecifiedDay, int userSpecifiedMonth, int userSpecifiedYear) {
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        if (this.whatIsYear(userSpecifiedYear) && this.whatIsMonth(userSpecifiedMonth)) {
            if (userSpecifiedDay <= calendar.get(Calendar.DAY_OF_MONTH)) {
                System.out.println("Pick a later date.");
                return false;
            }
            else if (userSpecifiedDay > calendar.get(Calendar.DAY_OF_MONTH)) {
                switch (userSpecifiedMonth) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        if (userSpecifiedDay > 31) {
                            System.out.println("Month contains 31 days. This day doesn't exist.");
                            return false;
                        }
                        return true;
                    }
                    case 2: {
                        if (userSpecifiedDay > 28) {
                            System.out.println("Month contains 28 days. This day doesn't exist.");
                            return false;
                        }
                        return true;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        if (userSpecifiedDay > 30) {
                            System.out.println("Month contains 30 days. This day doesn't exist.");
                            return false;
                        }
                        return true;
                    }
                    default: {
                        System.out.println("Something went wrong.");
                    }

                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        BoardingCalendar boardingCalendar= new BoardingCalendar();
        //boardingCalendar.whatIsYear(2022); WORKS!!!
        //boardingCalendar.whatIsMonth(1); WORKS!!!
        //System.out.println(boardingCalendar.whatIsDay(19, 1, 2022)); WORKS
    }
}

