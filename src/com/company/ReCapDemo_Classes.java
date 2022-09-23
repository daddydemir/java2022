package com.company;

public class ReCapDemo_Classes {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
    }
}

class DortIslem{

    public int Topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public int Cikar(int sayi1, int sayi2){
        return sayi1 - sayi2;
    }

    public int Carp(int sayi1, int sayi2){
        return sayi1 * sayi2;
    }

    public int Bol(int sayi1, int sayi2){
        return sayi1 / sayi2;
    }
}
