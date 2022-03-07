import java.util.Scanner;

public class Q13 {
    public static String fns(String word) {
        char[] s=word.toCharArray();
        for (int i = 0; i < s.length; i++) {
            for ( int j = 0; j < s.length; j++) {
                char temp=s[i];
                if (s[i]<s[j]){
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        return new String(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String ans=fns(w);
        System.out.println(ans);
    }
}
