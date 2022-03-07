import java.util.Scanner;

public class Q10{
    public static void main(String[] args){
        double[] rate={0.098,0.013,1.5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter money in Rs");
        double rs=sc.nextDouble();
        double gbp = rate[0]*rs;
        double us = rate[1]*rs;
        double yen = rate[2]*rs;
        System.out.println("Money in GBP="+gbp);
        System.out.println("Money in US Dollar="+us);
        System.out.println("Money in Yen="+yen);
        
    }
    
}