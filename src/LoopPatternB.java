public class LoopPatternB {
    public static void main(String[] args)
    {
        int i, j, rows=6;
        for (i = rows; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
