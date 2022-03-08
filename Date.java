import java.util.Scanner;
//Q15

public class Date {
    int d=0;
    int m=0;
    int y=0;     
    public Date(int dt,int mn,int yr){
        d=dt;
        m=mn;
        y=yr;
    }
    boolean ValidateDay(){
        if (d<32 && d>0){
            return true;
        }
        System.out.println("Day is Wrong");
        return false;
    }
    boolean ValidateYear(){
        if (m<1894){
            return true;
        }
        System.out.println("Year is Wrong");
        return false;
    }
    boolean ValidateMonth(){
        if (m>0 && m<13){
            return true;
        }
        System.out.println("Month Is Wrong");
        return false;
    }
    void Validate(){
        boolean f1 =ValidateDay();
        boolean f2 =ValidateMonth();
        boolean f3 =ValidateYear();
        if (f1 && f2 && f3){
            System.out.println("Date is Valid");
            prt();
        }
        else{
            System.out.println("Date is Not Valid");
        }
    }
    void prt(){
        System.out.println("date "+d+"\n month "+m+"\n year "+y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day");
        int d=sc.nextInt();
        System.out.println("Enter Month");
        int m=sc.nextInt();
        System.out.println("Enter Year");
        int y=sc.nextInt();
        Date userDate=new Date(d,m,y);
        userDate.Validate();
    }
}
