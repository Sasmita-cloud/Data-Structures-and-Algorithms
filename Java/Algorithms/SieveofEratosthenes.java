import java.util.*;
import java.io.*;
import java.lang.*;

public class SieveofEratosthenes
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the range upto which prime numbers are to be printed");
        int end=sc.nextInt();
        int arr[]=isPrime(end);
        int cnt=0;
        for(int i=0;i<=end;i++)
        {
            
            if(arr[i]==0)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static int[] isPrime(int end)
    {
        int arr[] = new int[end+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i*i<=end;i++)
        {
            for(int j=2*i;j<=end;j+=i)
            {
                arr[j]++;
            }
        }

        return arr;
    }

}

//to find the count of prime numbers upto a given Number using sieve of eratosthenes
