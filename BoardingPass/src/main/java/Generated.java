public class Generated {
    BoardingPassTicket ticket = new BoardingPassTicket();

    public float ticketPrice(int mileage) {
        float price = (float) (mileage * .15);
        return price;
    }

    public float discount(int price) {
        int adjPrice = price;
        if(ticket.getAge() <= 12) {
            adjPrice = (int) (price * .5);
            return adjPrice;
        }
        if(ticket.getAge() >= 60) {
            adjPrice = (int) (price * .4);
        }
        if(ticket.getGender().equals("F") && ticket.getAge() > 12 && ticket.getAge() < 60) {
            adjPrice = (int) (price * .75);
        }
        return adjPrice;
    }



}
