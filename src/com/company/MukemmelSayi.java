package com.company;

public class MukemmelSayi {
    public static void main(String[] args){

        // 6 -> 1,2,3
        // 28 -> 1,2,4,7,14

        int number = 5;
        int total = 0;

        for(int i = 0; i < number; i++){
            if((number & i) == 0){
                total += i;
            }
        }

        if(total == number){
            System.out.println("Mükemmel sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
