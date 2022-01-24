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

    public void writeToStorageFile() throws IOException {
         var myList = Files.lines(Paths.get("boarding_pass.txt")).collect(Collectors.toList());
         var present = Files.write(Paths.get("storage_file.txt"), myList,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        System.out.println(present);
     }
  }




