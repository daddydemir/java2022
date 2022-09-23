package com.company;

public class ClassesWithAttributes {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus",5000,3,"color","");
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(5000);
        product.setStockAmount(3);

        System.out.println(product.getKod());

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

    public Product(int id, String name, String description, double price, int stockAmount, String renk, String kod) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
        this.kod = kod;
    }

    public Product(){
        System.out.println("Product çalıştı");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + this.id;
    }


}

class ProductManager{
    public void Add(Product product){
        System.out.println("Ürin eklendi: " + product.getName());
    }

    public void Add2(int id, String name, String description, int stockAmount, double price, String yeniOzellik){}
}