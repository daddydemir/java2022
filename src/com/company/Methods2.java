package com.company;

public class Methods2 {

    public static void main(String[] args) {
        String mesaj  = "Bu gün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Gümcellendi");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
