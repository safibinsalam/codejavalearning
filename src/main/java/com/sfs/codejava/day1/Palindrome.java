package com.sfs.codejava.day1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int  s=sc.nextInt();
        int[] a=new int[s];
        System.out.println("enter array elements");
        for(int i=0;i< a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("entered array elements are fallows:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(isPalindrome(a));


    }
    public static boolean isPalindrome(int[] a)
    {
        for(int i=0,j=a.length-1;i<j;i++,j--)
        {
            if(a[i] != a[j])
            {
                return false;
            }
        }
        return true;
    }
}
