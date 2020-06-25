package prototype;

public class Client {
    public static void main (String args[]){
        Booking firstBooking = new Booking("Bob", 350);
        Booking secondBooking = (Booking) firstBooking.clone();
        secondBooking.setOwner("Alice");
        firstBooking.printBooking();
        secondBooking.printBooking();
    }
}
