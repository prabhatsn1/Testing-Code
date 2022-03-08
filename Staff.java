import java.util.Date;
import java.util.Scanner;

//Q16
public class Staff {
    Scanner sc =new Scanner(System.in);
    private int staffcode=1010;
    private String staffName="";
    private String desig="";
    private int age=20;
    // private Date dobDate=new Date();

    void setStaffCode(int code){
        this.staffcode=code;
    }
    int getStaffCode(){
        return this.staffcode;
    }

    void setStaffName(String staffName){
        this.staffName=staffName;
    }
    String getStaffName(){
        return this.staffName;
    } 

    void setDesignation(String desig){
        this.desig=desig;
    }
    String getdesignation(){
        return this.desig;
    }

    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return this.age;
    }

    // void setDate(Date d){
    //     this.dobDate=d;
    // }
    // Date getDate(){
    //     return this.dobDate;
    // }


}
