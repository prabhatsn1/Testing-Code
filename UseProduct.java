import java.util.ArrayList;
import java.util.Scanner;

public class UseProduct {
    void displayMax(ArrayList<Product> arr){
        Product max= arr.get(0);
        for(Product obj:arr){
            if (max.price<obj.price){
                max=obj;
            }
        }
        System.out.println("Maximum Price product id is "+ max.prodid+"\nPrice is "+max.price);
    }
    public static void main(String[] args) {
        ArrayList<Product> arr = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter value for "+(i+1)+"Product");
            int id=sc.nextInt();
            String de=sc.nextLine();
            float price=sc.nextFloat();
            int units=sc.nextInt();
            Product p = new Product(id, de, price, units);
            arr.add(p);
        }
    }
    
}
