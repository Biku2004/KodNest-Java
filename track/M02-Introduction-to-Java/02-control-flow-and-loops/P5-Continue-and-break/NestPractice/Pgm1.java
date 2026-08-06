public class Pgm1{
    
    public static void main(String[] args) {
        
        for(int i=1; i<=3; i++){

            for (int j = 0; j <=2; j++) {
                if(j == 2){
                    break;
                }
                System.out.println("i: " + i + " j: " + j);
            }
            System.out.println();

        }

    }

}