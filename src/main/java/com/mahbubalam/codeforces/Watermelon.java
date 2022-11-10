package com.mahbubalam.codeforces;

import java.util.Scanner;

public class Watermelon{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int w = input.nextInt();

        if (w>2){
            if (w%2==0) System.out.println("yes");
            else System.out.println("no");
        }else System.out.println("no");
    }
}