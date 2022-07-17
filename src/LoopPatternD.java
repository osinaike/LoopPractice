public class LoopPatternD {
    public static void main(String[] args) {
        int rows = 6;
//Prints upper half pattern
        for (int i = 1; i <= rows; i++) {
//Prints i spaces at the beginning of each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
//Prints i to rows value at the end of each row
            for (int j = i; j <= rows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}