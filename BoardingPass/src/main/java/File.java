import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class File {

    public static void main(String[] args) throws IOException {
        var myFileAsList = Files.lines(Paths.get("raw_file.txt")).collect(Collectors.toList());

        String z = "BOARDING PASS TICKET" + "\n" +
                "- Name = " + myFileAsList.get(0) + "\n" + "    |" + "\n" +
                "- Email = " + myFileAsList.get(1) + "\n" + "    |" + "\n" +
                "- PhoneNumber = " + myFileAsList.get(2) + "\n" + "    |" + "\n" +
                "- Age = " + myFileAsList.get(3) + "\n" + "    |" + "\n" +
                "- Gender = " + myFileAsList.get(4) + "\n" + "    |" + "\n" +
                "- Destination = " + myFileAsList.get(5) + "\n" + "    |" + "\n" +
                "- DepartureTime = " + myFileAsList.get(6) + "\n" + "\n" +
                "- PassNumber = " + myFileAsList.get(7) + "\n" + "    |" + "\n" +
                "- ETA = " + myFileAsList.get(8) + "\n" + "    |" + "\n" +
                "- TOTAL: " + myFileAsList.get(9)
                ;
        Files.write(Paths.get("user_friendly.txt"), z.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    }
}