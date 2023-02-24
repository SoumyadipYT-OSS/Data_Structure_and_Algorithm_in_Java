package Algo;
/*  Question:  Move all zero's to the end of it while maintaining the relative order of the non-zero elements.*/
public class q7
{
    // method to move zero's to the end of the array
    static int[] moveZeros(int[] yourArray) {
        int j=0;
        for (int i=0; i<yourArray.length; i++) {
            if (yourArray[i]!=0 && yourArray[j]==0) {
                int temp=yourArray[i];
                yourArray[i]=yourArray[j];
                yourArray[j]=temp;
            }
            if (yourArray[j]!=0) {
                j++;
            }
        }
        return yourArray;
    }

    // method to print the array
    static void printArray (int[] arr) {
        for (int x:arr) {
            System.out.print(x+"|");
        }
    }

    // main method
    @SuppressWarnings({"static-access"})
    public static void main(String[] args)
    {
        int[] myArray = {4,0,69,5,7,12,2,0,6,0,44,0,87};
        System.out.println("__Original Array__");
        q7 q = new q7();
        q.printArray(myArray);
        System.out.println();
        System.out.println("After moving the all zero's to the end of the array, the array looks like: ");
        q.printArray(q.moveZeros(myArray));
    }
}