package com.igeek.javaee.ch02.employee;

public class Employee {
    private String name;
    private String address;
    private Double salary;
    public Employee(){

    }
    public Employee(String name, String address, Double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void show(){
        System.out.println("姓名:"+name);
        System.out.println("地址:"+address);
        System.out.println("薪资:"+salary);

    }
}

