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

       

        //        create a method called readAFile()
        public ArrayList<String> readAFile() throws IOException {
            // read data from the boarding_pass.txt file
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
