import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;

public class OurFile {

    public static void main(String[] args) throws IOException {
        OurFile aOurFile = new OurFile();
        aOurFile.writeToUserFile();
        System.out.println(aOurFile.getMyProfile("4569875698"));
    }

    public String getMyProfile(String phoneNumber) throws IOException {
        var a = Files.lines(Paths.get("raw_file.txt")).filter(n -> n.contains(phoneNumber)).collect(Collectors.toList());
        return a.toString();
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