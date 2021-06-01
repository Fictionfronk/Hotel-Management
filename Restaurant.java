import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Restaurant extends Hotel {

    public Dish[] dish;

    public void addDishes() {

        try {
            FileWriter myWriter = new FileWriter("menu.txt");

            for (int i = 0; i < 8; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Dish Name, Price and Type");
                dish[i].dishName = sc.nextLine();
                dish[i].price = sc.nextDouble();
                dish[i].dishType = sc.nextLine();
                myWriter.write(dish[i].dishName + "\t" + dish[i].price + "\t" + dish[i].dishType + "\n");

            }
            myWriter.close();
            System.out.println("Successfully to add menu.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Dish getDish(String dnam) {
        for (int i = 0; i < 8; i++) {
            if (dish[i].dishName == dnam) {
                return dish[i];
            }
        }

    }

    public void displayDish(Dish d) {
        System.out.println("Dish Name: " + d.dishName);
        System.out.println("Price: " + d.price);
        System.out.println("Dish Type: " + d.dishType);
    }

    public void displayMenu() {
        for (int i = 0; i < 8; i++) {
            displayDish(dish[i]);
        }
    }
}
