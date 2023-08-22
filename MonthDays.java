import java.util.Scanner;

public class MonthDays {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        
        int[] monthDays = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        System.out.print("Enter the name of a month: ");
        String inputMonth = scanner.nextLine();
        
        int days = -1; // Default value for an invalid month
        
        for (int i = 0; i < monthNames.length; i++) {
            if (inputMonth.equalsIgnoreCase(monthNames[i])) {
                days = monthDays[i];
                break;
            }
        }
        
        if (days != -1) {
            System.out.println(inputMonth + " has " + days + " days.");
        } else {
            System.out.println("Invalid month name entered.");
        }
        
        scanner.close();
    }
}
