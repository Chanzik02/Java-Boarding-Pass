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

//            ArrayList<Object> info = new ArrayList<>();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
//            info.add();
        }

    public static void main(String[] args) throws IOException {
        ArrayList<Object> info = new ArrayList<>();
        info.add(name);
        info.add(email);
        info.add(phoneNumber);
        info.add(age);
        info.add(gender);
        info.add(date);
        info.add(destination);
        info.add(departureTime);
        info.add(passNumber);
        info.add(ETA);
        info.add(totalTicketPrice);
        for (Object anObject: info) {
            String newLine = anObject.toString() + " " + "\n";
            Files.write(Paths.get("raw_file.txt"), newLine.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
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
