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