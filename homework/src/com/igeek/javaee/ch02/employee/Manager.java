package com.igeek.javaee.ch02.employee;

public class Manager extends Employee {
        private  String management;
        public Manager(){

        }

    public Manager(String name, String address, Double salary, String management) {
        super(name, address, salary);
        this.management = management;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }
    public void show(){
        System.out.println("姓名:"+super.getName());
        System.out.println("地址:"+super.getAddress());
        System.out.println("薪资:"+super.getSalary());
        System.out.println("管理部门:"+this.management);
    }
}
