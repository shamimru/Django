package com.first;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int input=sc.nextInt();
        int first_term=0,second_term=1,next_term=0;
        if(input <0){
            System.out.println("Please enter a positive number");
        }else if(input >0 ){
            for(int i=1;i<=input;i++){
                System.out.println(first_term);
                next_term=first_term+second_term;
                first_term=second_term;
                second_term=next_term;
            }


        }

    }
}
