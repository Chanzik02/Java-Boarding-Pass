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

    public String departureTime(String year, String month, String day, int aHour, int minutes) {
        int yearAsInt = Integer.parseInt(year);
        int monthAsInt = Integer.parseInt(month) - 1;
        int dayAsInt = Integer.parseInt(day);

        Date date = new Date();
        date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour, minutes);

        String[] a = (date.toString().split(" "));
        String b = a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[5];
        return b;
    }

    public String leavingTime(String year, String month, String day, int aHour, int minutes, String destination) {
        int yearAsInt = Integer.parseInt(year);
        int monthAsInt = Integer.parseInt(month) - 1;
        int dayAsInt = Integer.parseInt(day);

        Date date = new Date();
        switch (Integer.parseInt(destination)) {
            //New York (1) and Seattle (5) absolute value of travel time - timezone
            case 1:
            case 5: {
                date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour + 2, minutes);
                break;
            }
            //Miami (2) and Lose Angeles (4) absolute value of travel time - timezone
            case 2:
            case 4: {
                date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour + 1, minutes);
                break;
            }
            //Chicago (3) absolute value of travel time - timezone
            case 3: {
                date = new Date(yearAsInt - 1900, monthAsInt, dayAsInt, aHour, minutes);
                break;
            }
            default: {

            }
        }
        //System.out.println("Current Time " + calendar.getTime());
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
