import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter char: ");
        char ch = sc.next().charAt(2);
        System.out.println(ch);

        sc.close();

        

    }    
}
