package com.company;

public class Inheritance {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        customerManager CustomerManager = new customerManager();
        
    }
}

class Customer extends Person{

    String email;
}

class Employee extends Person{

    double salary;
}

class Person{
    int id;
    String firstName;
    String lastName;
    int age;
}

class customerManager extends PersonManager{

}

class EmployeeManager extends PersonManager{


    public void BestEmployee(){
        System.out.println("Ayın elemanı getirlidi.");
    }
}

class PersonManager{
    public void List(){
        System.out.println("Listelendi");
    }

    public void Add(){
        System.out.println("Eklendi");
    }
}