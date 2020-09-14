package com.igeek.javaee.ch01;

import java.util.Scanner;

public class ForHomework02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的值：");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<n;i++){
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for(k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
            System.out.print("\n");
        }




    }
}
