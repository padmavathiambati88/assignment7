import java.util.*;
public class Employeebonus {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the current year:");
        int currentyear = scanner.nextInt();

        System.out.println("enter the year the employee joined: ");
        int joinedyear = scanner.nextInt();
        int yearsofservice = currentyear - joinedyear;
        if (yearsofservice > 5) {
             System.out.println("Congratulations, you have serviced for 5 years so you received bonus of Rs.5000");
        }
        else if(yearsofservice >=3||yearsofservice <=5 ) {
             System.out.println("Congratulations, you have serviced for 2-3 years so you received bonus of Rs.3000");
        }
        else{
            System.out.println("your service are less than 3,so no bonus is awarded. ");
        }


               
    }     

}