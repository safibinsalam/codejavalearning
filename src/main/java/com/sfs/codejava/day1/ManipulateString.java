package com.sfs.codejava.day1;

public class ManipulateString {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3="java";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.concat("learning"));
        System.out.println(s1==s2);
        s1=(s1.concat("learn"));
        System.out.println(s1);
        System.out.println(s1==s2);

    }
}
