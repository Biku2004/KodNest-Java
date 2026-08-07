import java.util.Scanner;

public class takingUserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte Value : ");
        byte a = sc.nextByte();
        System.out.println("Byte values is : " + a);
        System.out.println();
        
        System.out.println("Enter Short Value : ");
        short b = sc.nextByte();
        System.out.println("Short values is : " + b);
        System.out.println();
        
        System.out.println("Enter integer Value : ");
        int c = sc.nextInt();
        System.out.println("Integer values is : " + c);
        System.out.println();
        
        
        System.out.println("Enter long Value : ");
        long d = sc.nextLong();
        System.out.println("Long value is : " + d);
        System.out.println();
        
        System.out.println("Enter float Value : ");
        float floatValue = sc.nextFloat();
        System.out.println("Float value is : " + floatValue);
        System.out.println();
        
        System.out.println("Enter double Value : ");
        double doubleValue = sc.nextDouble();
        System.out.println("double value is : " + doubleValue);
        System.out.println();
        
        System.out.println("Enter boolean Value : ");
        boolean boolValue = sc.nextBoolean();
        System.out.println("Boolean Value is: " + boolValue);
        System.out.println();

        sc.close();

    }    
}
