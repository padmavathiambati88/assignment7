import java.util.*;
public class libraryfine {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of days delay for book to the library:");
        int daysdelay = scanner.nextInt();
        if(daysdelay<=0){
           System.out.println("no fine ,because the book is given on time");
           }
           else if (daysdelay<=7)
           {
               double fine= no of daysdelay*0.5;
             System.out.println("the amount of fine for %d days late:%.2f rupees\n",daysdelay,fine);  
           }
           else if (daysdelay>=8||daysdelay<=14)
           {
               double fine= no of daysdelay*0.5+no of daysdelay*1;
             System.out.println("the amount of fine for %d days late:%.2f rupees\n",daysdelay,fine);  
           }
           else if (daysdelay>=14||daysdelay<=21)
           {
               double fine= no of daysdelay*0.5+no of daysdelay*1+no of daysdelay*5;
             System.out.println("the amount of fine for %d days late:%.2f rupees\n",daysdelay,fine);  
           }
           else {
               System.out.println("your membeship in library is cancelled due to you did not return the book with in 21 days delay.");
               
           }
           scanner.close();
               
           }
    }
}