//a Program to check whether a given year is leap or not?
import java.util.Scanner;
public class LeapYear
{
 
        public static void main(String[] args) {
           int year;    
              Scanner scan = new Scanner(System.in);
		
               System.out.print("Enter the year");
                year = scan.nextInt();
                 
               
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        System.out.println("Year " + year + " is a leap year");
                else
                        System.out.println("Year " + year + " is not a leap year");
        }
}
 