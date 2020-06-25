package prototype;

public class Booking implements Clonable{
    private String owner;
    private int price;

    public Booking(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public void setOwner(String newOwner){
        this.owner = newOwner;
    }
    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public void printBooking(){
        System.out.println(
                "Owner: "
                + owner
                + " Price: "
                + price
        );
    }

    private Booking(Booking sourceBooking) {
        this.owner = sourceBooking.getOwner();
        this.price = sourceBooking.getPrice();
    }

    public Clonable clone() {
        return new Booking(this);
    }
}
