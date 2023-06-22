package com.sfs.codejava.day1;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] a=new int[][]{{1,2,3},{4,5,6}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("length:" + a.length);

        int[][] a1=new int[][]{
                {1,0,1},
                {1,1,1},
                {1,0,1}
        };
        for(int[] arr:a1) {
            for (int arr1:arr) {
                if(arr1==1)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
        System.out.println(Arrays.toString(sum(new int[][]{{1,2,3},{4,5,6}})));

    }
    private static int[] sum(int[][] a2)
    {

        int[] s2=new int[a2.length];
        int d=0;
        for(int[] a3:a2)
        {
            int s=0;
            for(int i=0;i<a3.length;i++)
            {
                s=s+a3[i];
                s2[d]=s;

            }
            d++;

        }
        return s2;
    }
}
