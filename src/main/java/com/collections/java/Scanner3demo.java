package com.collections.java;
import java.util.Scanner;

/*

java 100
cpp 65
python 50
*/

public class Scanner3demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-14s" + " " + "%03d\n", s1, x );
        }
        System.out.println("================================");

}
}
