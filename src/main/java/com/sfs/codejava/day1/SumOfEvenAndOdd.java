package com.sfs.codejava.day1;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                e = e + i;
            }
            else {
                o=o+i;
            }
        }
        System.out.println("even:"+e);
        System.out.println("odd:"+o);


    }
}
