public class Generated {

    public float ticketPrice(int mileage) {
        float price = (float) (mileage * .15);
        return price;
    }

    public float discount(int price, int age, String gender) {
        int adjPrice = price;
        if(age <= 12) {
            adjPrice = (int) (price * .5);
            return adjPrice;
        }
        if(age >= 60) {
            adjPrice = (int) (price * .4);
        }
        if(gender.equals("F") && age > 12 && age < 60) {
            adjPrice = (int) (price * .75);
        }
        return adjPrice;
    }



}
