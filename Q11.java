import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int l=name.length();
        System.out.println(name.charAt(0));
        for (int i = 0; i < l; i++) {
            if (name.charAt(i)==' '){
                System.out.println(name.charAt(i+1));
            }
        }
    }
}
