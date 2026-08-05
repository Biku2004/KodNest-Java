import java.util.Scanner;

public class SwitchStatement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input: ");
        int a = sc.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("this is case 1");
                break;
        
            case 2:
                System.out.println("this is case 2");
                break;
            case 3:
                System.out.println("This is case 3");
                break;
            default:
                System.out.println("this is default : invalid value");
                break;
        }

        sc.close();

    }

}
