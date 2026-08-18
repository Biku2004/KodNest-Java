import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter the element: ");

        // Taking input elements
        for(int i=0; i<=a.length-1; i++){
            a[i] = sc.nextInt();
        }
        
        // Printing the elements
        System.out.println("Array Elements are: ");
        for(int i=0; i<=a.length-1; i++){
            System.out.print(a[i] + " ");
        }
        
        int sum = 0;
        for(int i=0; i<=a.length-1; i++){
            sum += a[i];
        }
        System.out.println();
        System.out.println("Sum of array is: " + sum);

        sc.close();
        

    }    
}
