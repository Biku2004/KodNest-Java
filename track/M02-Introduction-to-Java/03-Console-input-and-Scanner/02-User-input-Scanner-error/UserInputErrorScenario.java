import java.util.Scanner;

public class UserInputErrorScenario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Age is : " + age);

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        System.out.println("Your height is: " + height);
        // sc.nextLine();

        System.out.println("Enter your full Name: ");
        String fname = sc.nextLine();
        System.out.println("Full Name is : " + fname);

        sc.close();

    }
}
