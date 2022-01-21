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

    public float ticketPrice(int mileage) {
        float price = (float) (mileage * .15);
        return price;
    }


    public float discount(int price, int age, String gender) {
        float adjPrice = price;
        if(gender.equals("F") && age > 12 && age < 60) {
            adjPrice = (int) (price * .75);
        }
        if(age <= 12) {
            adjPrice = (int) (price * .5);
        }
        if(age >= 60) {
            adjPrice = (int) (price * .4);
        }
        return adjPrice;
    }

    public String generatePassNumber() {
        int number = (int) (Math.random() * 100000000);
        return Integer.toString(number);
    }


}
