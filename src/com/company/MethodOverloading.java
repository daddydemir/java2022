package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
        Dortislem dortislem = new Dortislem();
        System.out.println(dortislem.topla(2,3));
        System.out.println(dortislem.topla(2,3,5));
    }
}

class Dortislem{

    public int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3){
        return sayi1+sayi2+sayi3;
    }
}