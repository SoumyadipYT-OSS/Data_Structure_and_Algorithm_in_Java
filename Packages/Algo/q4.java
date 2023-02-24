package Algo;
/*  How to reverse an array */
public class q4
{
    static int[] reverseArray(int[] array) {
        int start_index=array.length-1;
        int[] newArr=new int[array.length];
        int new_array_index=0;
        for (int i=start_index; i>=0; i--) {
            newArr[new_array_index]=array[start_index];
            new_array_index++;
            start_index--;
        }
        return q4.printArray(newArr);
    }

    // method to print the array
    static int[] printArray (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +"|");
        }
        return arr;
    }

    // main method
    @SuppressWarnings({"static-access"})
    public static void main(String[] args)
    {
        int[] myArr={4,8,7,9,6,72,25,12};
        q4 q = new q4();
        System.out.println("__Original Array__");
        q.printArray(myArr);
        System.out.println("\n__Reverse Array__");
        q.reverseArray(myArr);
    }
}