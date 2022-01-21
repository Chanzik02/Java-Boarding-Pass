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

        Charset utf8 = StandardCharsets.UTF_8;

    public void writeToAFile() throws IOException {
        //write code that will write the text "test" to the sample_data.txt file
        Files.write(Paths.get("sample_data.txt"), "test".getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }



        public ArrayList<String> readFile() throws IOException {
            var userInfo = Files.lines(Paths.get("boarding_pass.txt")).collect(Collectors.joining(""));
            // store the data in an ArrayList<String> and then return ArrayList<String>
            ArrayList<String> storage = new ArrayList<>();

            System.out.println(userInfo);
            return storage;
        }

        var myFileAsList = Files.lines(Paths.get("raw_file.txt")).map(n -> n.split(" ")).collect(Collectors.toList());


        String z = "BOARDING PASS TICKET" + "\n" +
                "- Name = " + myFileAsList.get(0) + "\n" + "    |" + "\n" +
                "- Email = " + myFileAsList.get(1) + "\n" + "    |" + "\n" +
                "- PhoneNumber = " + myFileAsList.get(2) + "\n" + "    |" + "\n" +
                "- Age = " + myFileAsList.get(3) + "\n" + "    |" + "\n" +
                "- Gender = " + myFileAsList.get(4) + "\n" + "    |" + "\n" +
                "- Date = " + myFileAsList.get(5) + "\n" + "    |" + "\n" +
                "- Destination = " + myFileAsList.get(6) + "\n" + "    |" + "\n" +
                "- DepartureTime = " + myFileAsList.get(7) + "\n" + "\n" +
                "- PassNumber = " + myFileAsList.get(8) + "\n" + "    |" + "\n" +
                "- ETA = " + myFileAsList.get(9) + "\n" + "    |" + "\n" +
                "- TOTAL: " + myFileAsList.get(10)
                ;
        Files.write(Paths.get("user_friendly.txt"), z.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);

    }


}


////        var textData = Files.lines(Paths.get("src/main/resources/texts.csv")).map(i -> {
////            var text = i.split(",");
////            return new Text(text[0], text[1], text[2]);
////        } ).collect(Collectors.toList());