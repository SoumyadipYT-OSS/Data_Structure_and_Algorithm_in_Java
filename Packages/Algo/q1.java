package Algo;
/*  Adding and updating in one dimensional array */
import java.util.Arrays;
public class q1
{
    public void printArray(int[] arr) {
        int n=arr.length;
        for (int x:arr) {
            System.out.print(x+"|");
        }
    }
    public void arrayDemo() {
        int[] myArr=new int[5];
        myArr[0]=5;
        myArr[1]=8;
        myArr[2]=3;
        myArr[3]=7;
        myArr[4]=2;
        printArray(myArr);
    }
    public static void main(String[] args)
    {
        q1 q = new q1();
        q.arrayDemo();
    }
}