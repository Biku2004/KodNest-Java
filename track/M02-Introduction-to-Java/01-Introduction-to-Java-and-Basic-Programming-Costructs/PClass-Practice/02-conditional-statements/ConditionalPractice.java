import java.util.Scanner;

public class ConditionalPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Taking input : ");    
        int number = sc.nextInt();    
        System.out.println("number is : " + number);

        if(number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("zero");
        }

        sc.close();

    }
}
