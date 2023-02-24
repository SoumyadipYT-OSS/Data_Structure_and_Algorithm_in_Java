package Algo;
/*  Find minimum value in array */
public class q5
{
    // method to find minimum value in an array
    static int find_min_value(int[] arr) {
        int min_val=arr[0];
        if (arr.length==0)
            return 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<min_val) {
                min_val=arr[i];
            }
        }
        return min_val;
    }

    // method to print the array
    static void printArray(int[] yourArray) {
        for (int x:yourArray) {
            System.out.print(x+"|");
        }
    }

    // main method
    public static void main(String[] args)
    {
        int[] myArray={45,69,87,12,15,19,23,26};
        q5 q = new q5();
        System.out.println("__Original Array__");
        q.printArray(myArray);System.out.println();
        System.out.println("Minimum value in the array: "+q.find_min_value(myArray));
    }
}