package com.igeek.javaee.ch01;
import java.util.Scanner;
public class ForHomework01 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100);
        //System.out.println("num："+num);
        int i;
        for (i=1;i<8;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的一个数字：");
            int guess = sc.nextInt();
            if(guess<num){
                System.out.println("太小了，再大一点！");
            }
            else if (guess>num){
                System.out.println("太大了，再小一点！");
            }
            else if (guess==num){
                System.out.println("恭喜你猜对了！");
                break;
            }

        }
    }
}
