package com.igeek.javaee.ch02.employee;

public class ChairMan extends Employee {
        private  Double travel_allowance;

    public ChairMan() {

    }

    public ChairMan(String name, String address, Double salary, Double travel_allowance) {
        super(name, address, salary);
        this.travel_allowance = travel_allowance;
    }

    public Double getTravel_allowance() {
        return travel_allowance;
    }

    public void setTravel_allowance(Double travel_allowance) {
        this.travel_allowance = travel_allowance;
    }
    public void show(){
        System.out.println("姓名:"+super.getName());
        System.out.println("地址:"+super.getAddress());
        System.out.println("薪资:"+super.getSalary());
        System.out.println("交通补贴:"+this.travel_allowance);

    }

}
