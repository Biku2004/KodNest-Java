public class UnaryExample {
    public static void main(String[] args) {
        int a = 10;

        int res = a++ + ++a 
        + a++ + a++ 
        + ++a + a++;

        // 10 12 12 13 15 15
        // 77 output

        System.out.println(res);       
    }    
}

// assign first increment next 
// or increment first assign next