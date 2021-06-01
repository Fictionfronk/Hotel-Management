import java.util.Scanner;

public class Room extends Hotel{
    
    public String room_type;
    public int noOfBed;
    public double rent;
    public int roomNo;
    public int status;

    public Room(){

    }

    public Room(String room_type, int noOfBed, double rent, int roomNo){
        
        this.room_type = room_type;
        this.noOfBed = noOfBed;
        this.rent = rent;
        this.roomNo = roomNo;

    }

    public void setRoom(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Room Type, No of Beds, Rent, RoomNo");
        this.room_type = sc.nextLine();
        this.noOfBed = sc.nextInt();
        this.rent = sc.nextDouble();
        this.roomNo = sc.nextInt();
        status = 0;

    }

    public boolean isVacant(Room r){

        if(r.status==1){
            return false;
        }
        else
        return true;

    }

    public void displayDetail(){

        System.out.println("Room Type: " + this.room_type);
        System.out.println("Number of beds: " + this.noOfBed);
        System.out.println("Rent: " + this.rent);
        System.out.println("Room Number: " + this.roomNo);

        if(status==1){
            System.out.println("Occupied");
        }
        else
        System.out.println("Vacant");

    }

    public void vacateRoom(int i){

        for(int j = 0; j < 6; j++){
            if(this.roomNo==i){
                this.status = 0;
            }
        }

    }

    public void displayAvailable(Room r){

        for(int i = 0; i < 6; i++){
            if(r.status==0){
                r.displayDetail();
            }
        }

    }

}
