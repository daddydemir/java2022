package com.company;

public class SayiBulma {

    public static void main(String[] args){

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi == aranacak){
//                System.out.println("Sayı mevcuttur.");
                varMi = true;
                break;
            }
        }

        if(varMi){
            System.out.println("Sayı mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir.");
        }
    }
}
