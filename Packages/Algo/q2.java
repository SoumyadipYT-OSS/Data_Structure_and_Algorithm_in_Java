package Algo;
/*  How to print elements of an array  */
public class q2
{
    static void printArray(int[] myArr) {
        for (int x:myArr) {
            System.out.print(x+"|");
        }
    }

    public static void main(String[] args)
    {
        int[] arr={4,5,6,8,2};
        printArray(arr);
    }
}