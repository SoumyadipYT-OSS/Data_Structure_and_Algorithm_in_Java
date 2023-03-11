package Algo;
/*  __Find a missing number from an array__
*   Given an array of (n-1) distinct numbers in the range of 1 to n.
*   Find the missing number in it.*/
public class q9
{
    // method to find the missing number from the array
    static int find_missing_number (int[] yourArray) {
        int n=yourArray.length+1;
        int sum=(n*(n+1))/2;  // sum of 1 to n natural numbers
        int missing_number=sum;
        for (int i=0; i<yourArray.length; i++) {
            missing_number=missing_number-yourArray[i];
        }
        return missing_number;
    }

    // method to print the array
    static void printArray(int[] inputArray) {
        for (int x:inputArray) {
            System.out.print(x+"|");
        }
    }

    // main method
    public static void main(String[] args)
    {
        int[] myArr = {2,4,1,8,6,3,7};
        System.out.println("__Given Array__");
        q9 q = new q9();
        q.printArray(myArr);
        System.out.println();
        System.out.println("Missing number from the array is: "+q.find_missing_number(myArr));

    }
}