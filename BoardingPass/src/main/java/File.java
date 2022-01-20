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

        //      create a createAFile() method
        public void createAFile() throws IOException {
//         create a file boarding_pass.txt
            Files.write(Paths.get("boarding_pass.txt"), Collections.singleton("LIST"), utf8);
        }

        //        create a method writeToAFile()
        public void writeToAFile() throws IOException {
            //write code that will write the text "test" to the sample_data.txt file
            Files.write(Paths.get("boarding_pass.txt"), "(USER INFO & COMPUTER GENERATED DATA GOES HERE)".getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.APPEND);
        }

        //        create a method called readAFile()
        public ArrayList<String> readAFile() throws IOException {
            // read data from the sample_data.txt file
            var a = Files.lines(Paths.get("boarding_pass.txt")).collect(Collectors.joining(""));
            // store the data in an ArrayList<String> and then return ArrayList<String>
            ArrayList<String> userInfo = new ArrayList<>();
            for (byte x : a.getBytes(StandardCharsets.UTF_8)) {
                userInfo.add(String.valueOf(x));
            }
            System.out.println(userInfo);
            return userInfo;
        }

}
