public class RoomCustomer extends Customer {
    
    public double rbill;
    public int bookStatus;
    public Room room;

    public void viewTotalBill(){

        this.rbill = room.rent;
        System.out.println("Bill = " + rbill);

    }

    public void allocateRoom(Room r){

        this.room = r;

    }

    public void printCustomer(){

    }

    public void checkOut(){
        
        System.out.println("Your bill is " + this.rbill);
        this.rbill = 0;
        this.status = 0;
        System.out.println("Thank you! Visit Again.");

    }

}
