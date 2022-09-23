package com.company;

public class Classes {
    public static void main(String[] args) {
        // referance type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // referance type
        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}


class CustomerManager {
    public void Add() {
        System.out.println("Müşteri eklendi.");
    }

    public void Remove() {
        System.out.println("Müşteri silindi.");
    }

    public void Update() {
        System.out.println("Müşteri güncellendi.");
    }

}