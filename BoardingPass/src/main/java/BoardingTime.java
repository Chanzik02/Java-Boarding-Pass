import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class BoardingTime {
    Calendar calendar = Calendar.getInstance();
    TimeZone timeZone = calendar.getTimeZone();

    public BoardingTime() {

    }

    public String leavingTime(String year, String month, String day, int aHour, int minutes, String destination) {
        int yearAsInt = Integer.parseInt(year);
        int monthAsInt = Integer.parseInt(month) - 1;
        int dayAsInt = Integer.parseInt(day);
//        if (Integer.parseInt(destination) == 3) {
//            aHour = 2;
//        }
//        int centralZone = 1;
//        int mountainZone = 2;
//        int pacificZone = 3;
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
        System.out.println();
        //System.out.println(date);
        return date.toString();
    }

    public static void main(String[] args) {
        BoardingTime boardingTime = new BoardingTime();
        boardingTime.leavingTime("2022","2", "14", 9, 30, "2");
    }
}
