import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OurFile {

    public String getMyProfile(String phoneNumber) throws IOException {
        var separate = Files.lines(Paths.get("raw_file.txt")).filter(n -> n.contains(phoneNumber)).toArray();
        String[] breakdown = separate[0].toString().split(",");
        String passRepresentation = "BOARDING PASS TICKET" + "\n" +
               "- Name = " + breakdown[0] + "\n" + "    |" + "\n" +
                "- Email = " + breakdown[1] + "\n" + "    |" + "\n" +
               "- PhoneNumber = " + breakdown[2] + "\n" + "    |" + "\n" +
                "- Age = " + breakdown[3] + "\n" + "    |" + "\n" +
                "- Gender = " + breakdown[4] + "\n" + "    |" + "\n" +
                "- Destination = " + breakdown[5] + " " + breakdown[6] +"\n" + "    |" + "\n" +
                "- DepartureTime = " + breakdown[7] + "\n" + "\n" +
                "- PassNumber = " + breakdown[8] + "\n" + "    |" + "\n" +
                "- ETA = " + breakdown[9] + "\n" + "    |" + "\n" +
                "- TOTAL: " + breakdown[10] + "\n" + "\n"
               ;
        System.out.println(passRepresentation);
        return breakdown.toString();
    }
    public void writeToUserFile() throws IOException {
        var myFileAsList = Files.lines(Paths.get("raw_file.txt")).collect(Collectors.toList());
        System.out.println(myFileAsList);
        var separate = myFileAsList.get(0).split(",");

        String passRepresentation = "BOARDING PASS TICKET" + "\n" +
                "- Name = " + (separate[0]) + "\n" + "    |" + "\n" +
                "- Email = " + (separate[1]) + "\n" + "    |" + "\n" +
                "- PhoneNumber = " + (separate[2]) + "\n" + "    |" + "\n" +
                "- Age = " + (separate[3]) + "\n" + "    |" + "\n" +
                "- Gender = " + (separate[4]) + "\n" + "    |" + "\n" +
                "- Destination = " + (separate[5]) + " " + separate[6] +"\n" + "    |" + "\n" +
                "- DepartureTime = " + (separate[7]) + "\n" + "\n" +
                "- PassNumber = " + (separate[8]) + "\n" + "    |" + "\n" +
                "- ETA = " + (separate[9]) + "\n" + "    |" + "\n" +
                "- TOTAL: " + (separate[10]) + "\n" + "\n"
                ;

        Files.write(Paths.get("user_friendly.txt"), passRepresentation.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }

}