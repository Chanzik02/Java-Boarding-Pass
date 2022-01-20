import java.util.Calendar;
import java.util.TimeZone;

public class BoardingTime {
    Calendar calendar = Calendar.getInstance();
    TimeZone timeZone = calendar.getTimeZone();

    public BoardingTime() {

    }

    public String leavingTime(String year, String month, String day, int aHour, int minutes) {
        int yearAsInt = Integer.parseInt(year);
        int monthAsInt = Integer.parseInt(month) - 1;
        int dayAsInt = Integer.parseInt(day);
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        calendar.add(Calendar.DAY_OF_MONTH, Math.abs(dayAsInt - calendar.get(Calendar.DAY_OF_MONTH)));
        calendar.add(Calendar.MONTH, Math.abs(monthAsInt - calendar.get(Calendar.MONTH)));
        calendar.add(Calendar.YEAR, Math.abs(yearAsInt - calendar.get(Calendar.YEAR)));
        calendar.add(Calendar.HOUR, aHour);
        calendar.add(Calendar.MINUTE, minutes);

        System.out.println(calendar.getTime());

        return calendar.getTime().toString();
    }

    public static void main(String[] args) {
        BoardingTime boardingTime = new BoardingTime();
        boardingTime.leavingTime("2024","1", "14", 1, 12);
    }
}
