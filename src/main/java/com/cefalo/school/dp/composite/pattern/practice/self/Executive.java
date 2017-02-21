package com.cefalo.school.dp.composite.pattern.practice.self;

/**
 * Created by satyajit on 10/1/16.
 */
public class Executive extends EmployeeComponent {
    private String name;
    private String departmentName;
    private Double salary;

    public Executive(String name, String departmentName, Double salary) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String departmentName() {
        return this.departmentName;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double projectSalary() {
        return this.getSalary();
    }
}
