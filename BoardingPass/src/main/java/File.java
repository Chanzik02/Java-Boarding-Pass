import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class File {

    public static void main(String[] args) throws IOException {
        var myFileAsList = Files.lines(Paths.get("raw_file.txt")).map(n -> Arrays.toString(n.split("-"))).collect(Collectors.toList());
        var splitArray = myFileAsList.get(0);
        var separate = splitArray.split(",");
        for (int i = 0; i < separate.length; i++) {
            separate[i] = (separate[i].replace("[", "").replace(",", "").replace("]", ""));
        }
        String passRepresentation = "BOARDING PASS TICKET" + "\n" +
                "- Name = " + (separate[0]) + separate[1] + "\n" + "    |" + "\n" +
                "- Email = " + (separate[2]) + "\n" + "    |" + "\n" +
                "- PhoneNumber = " + (separate[3]) + "\n" + "    |" + "\n" +
                "- Age = " + (separate[4]) + "\n" + "    |" + "\n" +
                "- Gender = " + (separate[5]) + "\n" + "    |" + "\n" +
                "- Destination = " + (separate[6]) + " " + separate[7] +"\n" + "    |" + "\n" +
                "- DepartureTime = " + (separate[8]) + "\n" + "\n" +
                "- PassNumber = " + (separate[9]) + "\n" + "    |" + "\n" +
                "- ETA = " + (separate[10]) + "\n" + "    |" + "\n" +
                "- TOTAL: " + (separate[11]) + "\n" + "\n"
                ;

        Files.write(Paths.get("user_friendly.txt"), passRepresentation.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}