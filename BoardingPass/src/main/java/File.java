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

}


////        var textData = Files.lines(Paths.get("src/main/resources/texts.csv")).map(i -> {
////            var text = i.split(",");
////            return new Text(text[0], text[1], text[2]);
////        } ).collect(Collectors.toList());