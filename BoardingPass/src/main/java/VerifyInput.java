public class VerifyInput {

    public boolean verifyName(String name) {

        if(!name.matches("[a-zA-Z]+")) {
            System.out.println("Name must include letters only.");
            System.out.println("Name: ");
            return false;
        }
        return true;
    }

    public boolean verifyEmail(String email) {
        if(!email.contains("@")){
            System.out.println("Must be valid email address.");
            System.out.println("Email: ");
            return false;
        }
        return true;
    }

    public boolean verifyPhoneNumber(String phoneNumber) {
        String input;
        input = phoneNumber.replace(" ", "");
        phoneNumber = input;
        if(phoneNumber.equals("")) {
            System.out.println("Empty input. Please enter a phone number.");
            return false;
        }
        if(!phoneNumber.matches("[0-9]+")) {
            System.out.println("Please enter your phone number with no spaces, dashes or (). Example: 1234567890");
            return false;
        }
        if(!(phoneNumber.length() == 10)) {
            System.out.println("Please enter a 10 digit phone number. Example: 1234567890");
            return false;
        }
        return true;
    }

    public String numberFormat(String phoneNumber) {
        return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
    }

    public boolean verifyAge(int age) {

        String ageAsString = Integer.toString(age);
        if(!ageAsString.matches("[0-9]+")) {
            System.out.println("Please enter your age in digit format only.");
            System.out.println("Age: ");
            return false;
        }
        return true;
    }

    public boolean verifyGender(String gender) {

        gender = gender.charAt(0) + "";
        gender = gender.toUpperCase();
        if(!gender.equals("M") && !gender.equals("F")) {
            System.out.println("Must enter either M or F");
            return false;
        }
        return true;
    }


    public boolean verifyMonth(String month) {
        month = month;
        if(month.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
        }
        return true;
    }

    public boolean verifyDay(String day) {
        day = day;
        if(day.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
        }
        return true;
    }

    public boolean verifyYear(String year) {

        if(year.equals("[a-zA-Z]+")) {
            System.out.println("Please enter numerals only. ");
            return false;
        }
        return true;
    }

    public boolean verifyHour(String hour) {
        hour = hour;
        if (Integer.parseInt(hour) < 0 || Integer.parseInt(hour) > 23) {
            System.out.println("Hour range is between 0 and 23");
            return false;
        }
        if(hour.equals("[a-zA-Z]+")) {
            System.out.println("Please enter a number.");
            return false;
        }

        return true;
    }

    public boolean verifyMinutes(String minutes) {

        if (Integer.parseInt(minutes) < 0 || Integer.parseInt(minutes) > 59) {
            System.out.println("Minute range is between 0 and 59");
            return false;
        }
        if(minutes.equals("[a-zA-Z]+")) {
            System.out.println("Please enter a number.");
            return false;
        }

        return true;
    }

    public boolean verifyDestination(String destinationInput) {

        if (!destinationInput.matches("[0-9]+")) {
            System.out.println("Destination may not contain letters.");
            return false;
        }
        int verify = Integer.parseInt(destinationInput);
        if(verify < 1 || verify > 5) {
            System.out.println("We don't fly there yet.");
            return false;
        }
        return true;
    }

}
