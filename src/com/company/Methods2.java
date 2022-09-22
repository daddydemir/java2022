package com.company;

public class Methods2 {

    public static void main(String[] args) {
        String mesaj  = "Bu gün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        int toplam = topla2(3,46,7,89,2);
        System.out.println(toplam);
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

    public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
