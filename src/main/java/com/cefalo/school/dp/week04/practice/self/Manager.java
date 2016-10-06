package com.cefalo.school.dp.week04.practice.self;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyajit on 10/2/16.
 */
public class Manager extends EmployeeComponent {
    private List<EmployeeComponent> employees = new ArrayList<EmployeeComponent>();
    private String name;
    private String departmentName;
    private Double salary;

    public Manager(String name, String departmentName, Double salary) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    @Override
    public void add(EmployeeComponent employeeComponent) {
        this.employees.add(employeeComponent);
    }

    @Override
    public void remove(EmployeeComponent employeeComponent) {
        this.employees.remove(employeeComponent);
    }

    @Override
    public EmployeeComponent getChild(int i) {
        return this.employees.get(i);
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
        return this.getSalary();
    }

    @Override
    public double projectSalary() {
        double result = this.salary;
        for(EmployeeComponent component : employees) {
            result += component.projectSalary();
        }

        return result;
    }
}
