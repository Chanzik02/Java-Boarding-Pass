import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Generated {


    public int determineMileage(String destinationInput) {
        int mileage = 0;
        int destination = Integer.parseInt(destinationInput);
        switch (destination) {
            case 1:
                mileage = 746;
                break;
            case 2:
                mileage = 605;
                break;
            case 3:
                mileage = 588;
                break;
            case 4:
                mileage = 1933;
                break;
            case 5:
                mileage = 2179;
                break;
        }
        return mileage;
    }

    public double ticketPrice(int mileage) {
        double price = (double) (mileage * .25);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Ticket Price Method: " + price);
        return price;
    }



    public float discount(int price, int age, String gender) {
        float adjPrice = price;
        gender = gender.toUpperCase();
        if(gender.equals("F") && age > 12 && age < 60) {
            adjPrice = (int) (price * .75);
        }
        if(age <= 12) {
            adjPrice = (int) (price * .5);
        }
        if(age >= 60) {
            adjPrice = (int) (price * .4);
        }
        System.out.println("Discount method, looking for decimal: " + adjPrice);
        return adjPrice;
    }

    public String generatePassNumber() {
        int number = (int) (Math.random() * 100000000);
        return Integer.toString(number);
    }

}
