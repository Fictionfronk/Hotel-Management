import java.time.LocalTime;
import java.util.Random;

public class Hotel {

    private static Hotel hotel;
    public String hoteladdress;
    public String hotelname;
    public Employee[] employee;
    public Restaurant restaurant;
    public Room[] room;
    public Customer[] customer;

    private Hotel(String name, String addr) {

        this.hotelname = name;
        this.hoteladdress = addr;

    }

    public static Hotel getHotel() {

        if (hotel == null) {
            hotel = new Hotel("SANSIRI", "PATTAYA");
        }
        return hotel;

    }

    public void generateId(Customer[] c) {

        LocalTime t = LocalTime.now();
        final String m = "abcdefghijklmnopqrstuvxyz";
        Random rand = new Random();
        int r1 = rand.nextInt(26);

        for (int i = 0; i < 6; i++) {
            c[i].custID = c[i].custID + m[r1 % (m.length() - 1)];
        }
    }

    public void setHotel(Restaurant rest, Room[] r) {

        for (int i = 0; i < 6; i++) {
            this.room[i] = r[i];
        }
        for (int i = 0; i < 8; i++) {
            this.restaurant.dish[i] = rest.dish[i];
        }
    }

    public Room getRoom(int rno) {
        for (int i = 0; i < 6; i++) {
            if (room[i].roomNo == rno) {
                return room[i];
            }
        }
    }

    public void displayAvailable() {
        System.out.println("Room Detail");
        for(int i=0;i<6;i++){
            if(room[i].status==0){
                System.out.println(room[i].room_type);
                System.out.println(room[i].noOfBed);
                System.out.println(room[i].rent);
                System.out.println(room[i].roomNo);
            }
        }
    }

    public void displayMenu() {

    }

    public void vacateRoom() {

    }

    public void askFeedback() {

    }

    public void getCustomerData() {

    }

    public void takeOrder() {

    }

}
