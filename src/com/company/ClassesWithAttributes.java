package com.company;

public class ClassesWithAttributes {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus";
        product.price = 5000;
        product.stockAmount = 3;
        product.renk = "";
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
/*
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
  */
    }
}

class Product{
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;
}

class ProductManager{
    public void Add(Product product){
        System.out.println("Ürin eklendi: " + product.name);
    }

    public void Add2(int id, String name, String description, int stockAmount, double price, String yeniOzellik){}
}