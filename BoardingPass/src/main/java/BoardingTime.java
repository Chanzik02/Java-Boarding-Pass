import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class BoardingTime {
    Calendar calendar = Calendar.getInstance();
    TimeZone timeZone = calendar.getTimeZone();

//    default constructor
    public BoardingTime() {

    }

    public String leavingTime(String year, String month, String day, int aHour, int minutes, String destination) {
        int yearAsInt = Integer.parseInt(year);
        int monthAsInt = Integer.parseInt(month) - 1;
        int dayAsInt = Integer.parseInt(day);

        Date date = new Date();
        if (Integer.parseInt(destination) == 1 || Integer.parseInt(destination) == 2) {
            date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour, minutes);
        }
        else if (Integer.parseInt(destination) == 3) {
            date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour - 1, minutes);
        }
        else if (Integer.parseInt(destination) == 4 || Integer.parseInt(destination) == 5) {
            date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour - 3, minutes);
        }

        System.out.println("Current Time " + calendar.getTime());
        //System.out.println(date);
        String[] a = (date.toString().split(" "));
        String b = a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[5];

        return b;
    }

    public static void main(String[] args) {
        BoardingTime boardingTime = new BoardingTime();
        boardingTime.leavingTime("2022","2", "14", 9, 30, "2");
    }
}
