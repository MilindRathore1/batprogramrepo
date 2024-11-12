package arrays;

import java.util.Scanner;

public class DeclareTakeInputAndPrintArray
{
    public static void main(String[] args)
    {
        //take input from user and print
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length ");
        int len = sc.nextInt();
        int[] a = new int[len];
        System.out.println("Enter array content ");
        for(int i=0 ; i<len;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Your array is of length "+len+" and its elements are ");
        for(int i=0 ; i<len;i++)
        {
            System.out.print(a[i]+" ");
        }






    }
}
