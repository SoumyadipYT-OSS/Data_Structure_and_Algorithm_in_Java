package Algo;
/*  Find second maximum value in an array */
public class q6
{
    // method to find the second maximum value in an array
    static int find_second_maximum_value(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }

    // method to print the array
    static void printArray(int[] yourArray) {
        for (int x:yourArray) {
            System.out.print(x+"|");
        }
    }

    // main method
    @SuppressWarnings({"static-access"})
    public static void main(String[] args)
    {
        int[] myArray = {44,57,56,25,24,89,84,26,10,49,11,98,100,55,99};
        System.out.println("__Original Array__");
        q6 q = new q6();
        q.printArray(myArray);
        System.out.println();
        System.out.println("Second maximum element in this array is: "+q.find_second_maximum_value(myArray));
    }
}