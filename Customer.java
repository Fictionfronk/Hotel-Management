import java.time.LocalTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Customer {

    public String custname;
    public String custaddr;
    public String custID;
    public long custphone;
    public String custEmail;
    public String checkInTime;
    public int status;

    public Customer() {

        LocalTime t = LocalTime.now();
        this.custname = "";
        this.custaddr = "";
        this.custID = "";
        this.custphone = 0;
        this.custEmail = "";
        this.checkInTime = t.toString();
        status = 0;

    }

    public void setData() {

        LocalTime t = LocalTime.now();
        this.checkInTime = t.toString();
        try {

            File file = new File("customer.txt");
            Scanner readtxt = new Scanner(file);
            while (readtxt.hasNextLine()) {

                this.custname = readtxt.nextLine();
                this.custaddr = readtxt.nextLine();
                this.custphone = readtxt.nextLong();
                this.custEmail = readtxt.nextLine();

            }
            readtxt.close();

        } catch (FileNotFoundException e) {

            System.out.println("An error occurred.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            this.custname = sc.nextLine();
            System.out.println("Enter your address: ");
            this.custaddr = sc.nextLine();
            System.out.println("Enter your phone number: ");
            this.custphone = sc.nextLong();
            System.out.println("Enter your email: ");
            this.custEmail = sc.nextLine();

        }

    }

    public int selectChoice() {

        int ch;
        System.out.println("Hello!");
        System.out.println("Choose 1. Accomodation or 2. Dine");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        return ch;

    }

    public void printCustomer() {

        System.out.println("Name: " + this.custname);
        System.out.println("Address: " + this.custaddr);
        System.out.println("ID: " + this.custID);
        System.out.println("Phone Number: " + this.custphone);
        System.out.println("Email: " + this.custEmail);
        System.out.println("Check-in Time: " + this.checkInTime);
    }

    public void totalBill() {
        
    }

    public void allocateRoom(Room r) {

    }

    public void allocateDish(Dish d) {

    }

    public void checkOut() {

    }

}
