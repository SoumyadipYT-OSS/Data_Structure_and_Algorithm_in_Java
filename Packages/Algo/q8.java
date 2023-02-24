package Algo;
/*  How to resize an array in java */
public class q8
{
    // method to resize an array
    static int[] resizeArray(int[] your_array, int newSize) {
        int[] newArray = new int[newSize];
        for (int i=0; i<your_array.length; i++) {
            newArray[i]=your_array[i];
        }
        return your_array=newArray;
    }

    // main method
    public static void main(String[] args)
    {
        int[] myArr = {1,4,6,8};
        q8 q = new q8();
        int[] new_arr_size=q.resizeArray(myArr,10);
        System.out.println(new_arr_size.length);
    }
}