package switchstatement;

import java.util.Scanner;


public class switchstatement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int month = 0;
        String monthName = "";
        int days;
        
        System.out.print("enter number of days : ");
        days = sc.nextInt();
        
        
        switch (days) {
        case 30:  monthName = "April" + " " + "June" + " " + "September" + " " + "November" ;
                 break;
        case 28:  monthName = "February";
                 break;
        case 31:  monthName = "January" + " " + "March" + " " + "May" + " " + "July" + " " + "August" + " " + "October" + " " + "December";
                 break;
                 
    }
        
        System.out.println(monthName);

	}

}
