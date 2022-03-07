import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);            
        System.out.print("Enter any sentence: ");
        String s=sc.nextLine();
        s = s+" ";
        int l=s.length();
        int pos=0;
        char ch, ch2;
        String w;
        int total=0;
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                total+=1;
            }
            if(ch == ' ')
            {
                w = s.substring(pos,i); // extracting words one by one
                ch2 = w.charAt(0);
                if(ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U' || ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')
                {
                    System.out.print(w+"  ");
                }
                pos = i+1;
            }
        }
        System.out.println("\nNumber of vowel=" + total);
    }
}
