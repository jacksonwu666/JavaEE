package com.igeek.javaee.ch02.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("张三","北京",8000.0);
        ChairMan chairman = new ChairMan("王总","上海",30000.0,5000.0);
        Manager manager = new Manager("李经理","深圳",15000.0,"人力资源部");
        employee.show();
        chairman.show();
        manager.show();

    }

 }
