public class RestaurantCustomer extends Customer{
    
    public double dbill;
    public int orderStatus;
    public Dish dish;

    public void viewTotalBill(){

        this.dbill = dish.price;
        System.out.println("Bill = " + dbill);

    }

    public void allocateDish(Dish d){

        this.dish = d;

    }

    public void printCustomer(){
        
        if(orderStatus){
            System.out.println("Dish Name: " + dish.dishName);
            System.out.println("Dish Type: " + dish.dishType);
        }
        
    }

    public void checkOut(){

    }

}
