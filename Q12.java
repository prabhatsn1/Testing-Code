import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        int l=s.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) =='a'|| str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' ||str.charAt(i) =='u') {
                s.setCharAt(i, '*');
            }            
        }
        str=s.toString();
        System.out.println(str);
    }
}
