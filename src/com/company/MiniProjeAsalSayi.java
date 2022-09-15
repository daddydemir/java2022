package com.company;

public class MiniProjeAsalSayi {

    public static void main(String[] args){
        int number = 25;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number == 1) {
            System.out.println("Sayı asal değildir.");
            return;
        }

        if(number < 1 ){
            System.out.println("Geçersiz sayı");
        }

        System.out.println(remainder);

        for(int i = 2; i<number; i++){
            if(number % 2 == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }
    }
}
