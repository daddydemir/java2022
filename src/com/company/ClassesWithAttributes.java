package com.company;

public class ClassesWithAttributes {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus";
        product.price = 5000;
        product.stockAmount = 3;
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}

class Product{
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
}

class ProductManager{
    public void Add(Product product){
        System.out.println("Ürin eklendi: " + product.name);
    }
}