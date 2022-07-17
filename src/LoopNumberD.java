/*public class LoopNumber {
        public static void main(String[] args) {
            int i = 0;
           while (i < 10) {
                System.out.println("mary");
                i++;
               if (i == 4) {
                   continue;
               }

           }
            }
        }*/

public class LoopNumberD {
    public static void main(String[] args) {

        int i, j, my_input;
        my_input = 10;
        System.out.println("The number of rows is defined as " +my_input);
        System.out.println("The pyramid star pattern : ");
        for (i=0; i<my_input; i++){
            for (j=(my_input-i)*2; j>1; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*public class LoopNumber {
    public static void main(String[] args) {
    int counter = 1;
    while (counter <= 10) {
        System.out.printf("%d ", counter);
        ++counter;
    }
    System.out.println();
    }
}*/

