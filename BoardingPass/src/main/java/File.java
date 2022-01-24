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
        System.out.println(Arrays.toString(separate));
        for (int i = 0; i < separate.length; i++) {
            separate[i] = (separate[i].replace("[", "").replace(",", "").replace("]", ""));
        }
        System.out.println(separate[0]);
        String passRepresentation = "BOARDING PASS TICKET" + "\n" +
                "- Name = " + (separate[0]) + "\n" + "    |" + "\n" +
                "- Email = " + (separate[1]) + "\n" + "    |" + "\n" +
                "- PhoneNumber = " + (separate[2]) + "\n" + "    |" + "\n" +
                "- Age = " + (separate[3]) + "\n" + "    |" + "\n" +
                "- Gender = " + (separate[4]) + "\n" + "    |" + "\n" +
                "- Destination = " + (separate[5]) + (separate[6]) +  "\n" + "    |" + "\n" +
                "- DepartureTime = " + (separate[7]) + "\n" + "\n" +
                "- PassNumber = " + (separate[8]) + "\n" + "    |" + "\n" +
                "- ETA = " + (separate[9]) + "\n" + "    |" + "\n" +
                "- TOTAL: " + (separate[10]) + "\n" + "\n"
                ;
        Files.write(Paths.get("user_friendly.txt"), passRepresentation.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}