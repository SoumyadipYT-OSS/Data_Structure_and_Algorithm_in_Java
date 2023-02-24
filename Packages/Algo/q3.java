package Algo;
/*  Remove Even integers from an array */
public class q3
{
    static int[] removeEvenInteger(int[] arr) {
        int Odd_no_count=0;
        for (int j : arr) {
            if (j%2 != 0) {
                Odd_no_count++;
            }
        }
        int[] newArr=new int[Odd_no_count];
        int oddIndex=0;
        for (int j=0; j<arr.length; j++) {
            if (arr[j]%2!=0) {
                newArr[oddIndex]=arr[j];
                oddIndex++;
            }
        }
        return newArr;
    }

    // method to print array elements
    static void printArray(int[] inputArray) {
        for (int x:inputArray) {
            System.out.print(x+"|");
        }
    }

    // main method
    public static void main(String[] args)
    {
        int[] myarr = {4,8,2,3,5,9,6,11,4,13};
        System.out.println("__Original Array__");
        for (int x:myarr) {
            System.out.print(x+"|");
        }
        System.out.println("\n__After removing even integers__");
        q3 q = new q3();
        q.printArray(q.removeEvenInteger(myarr));
    }
}