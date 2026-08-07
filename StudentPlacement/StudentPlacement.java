import java.util.Scanner;

public class StudentPlacement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float tenth;
        float twelfth;
        float ug;

        // Validate 10th percentage
        System.out.print("Enter 10th Percentage: ");
        tenth = sc.nextFloat();

        while (tenth < 0 || tenth > 100) {
            System.out.println("Invalid percentage. Enter between 0 and 100.");
            System.out.print("Enter 10th Percentage again: ");
            tenth = sc.nextFloat();
        }

        // Validate 12th percentage
        System.out.print("Enter 12th Percentage: ");
        twelfth = sc.nextFloat();

        while (twelfth < 0 || twelfth > 100) {
            System.out.println("Invalid percentage. Enter between 0 and 100.");
            System.out.print("Enter 12th Percentage again: ");
            twelfth = sc.nextFloat();
        }

        // Validate UG percentage
        System.out.print("Enter UG Percentage: ");
        ug = sc.nextFloat();

        while (ug < 0 || ug > 100) {
            System.out.println("Invalid percentage. Enter between 0 and 100.");
            System.out.print("Enter UG Percentage again: ");
            ug = sc.nextFloat();
        }

        System.out.println("\nSelect Placement Role:");
        System.out.println("1. Software Developer");
        System.out.println("2. Software Tester");
        System.out.println("3. Technical Support");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Role: Software Developer");

                if (tenth >= 70 && twelfth >= 70 && ug >= 75) {
                    System.out.println("You are eligible.");
                } else {
                    System.out.println("You are not eligible.");
                }

                break;

            case 2:
                System.out.println("Role: Software Tester");

                if (tenth >= 60 && twelfth >= 60 && ug >= 65) {
                    System.out.println("You are eligible.");
                } else {
                    System.out.println("You are not eligible.");
                }

                break;

            case 3:
                System.out.println("Role: Technical Support");

                if (tenth >= 50 && twelfth >= 50 && ug >= 60) {
                    System.out.println("You are eligible.");
                } else {
                    System.out.println("You are not eligible.");
                }

                break;

            default:
                System.out.println("Invalid role selected.");
        }

        sc.close();
    }
}