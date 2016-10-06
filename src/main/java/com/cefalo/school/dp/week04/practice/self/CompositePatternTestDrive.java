package com.cefalo.school.dp.week04.practice.self;

/**
 * Created by satyajit on 10/2/16.
 */
public class CompositePatternTestDrive {
    public static void main(String[] args) {
        EmployeeComponent ceo = new Manager("CEO", "COMPANY", 500000.00);
        EmployeeComponent hrManager = new Manager("Manager HR", "HR", 200000.00);
        EmployeeComponent prodManager = new Manager("Manager PRODUCTION", "PRD", 300000.00);
        EmployeeComponent marketingManager = new Manager("Manager MARKETING", "MKT", 250000.00);
        EmployeeComponent salesManager = new Manager("Manager SALES", "SLS", 400000.00);
        EmployeeComponent financeManager = new Manager("Manager FINANCE", "FIN", 350000.00);

        ceo.add(hrManager);
        ceo.add(prodManager);
        ceo.add(marketingManager);
        ceo.add(salesManager);
        ceo.add(financeManager);

        hrManager.add(new Executive("e1","HR", 15050.0));
        hrManager.add(new Executive("e2","HR", 15200.0));
        hrManager.add(new Executive("e3","HR", 15500.0));

        prodManager.add(new Executive("e4","PRD", 20150.0));
        prodManager.add(new Executive("e5","PRD", 22200.0));

        marketingManager.add(new Executive("e6","MKT", 30150.0));
        marketingManager.add(new Executive("e7","MKT", 32200.0));
        marketingManager.add(new Executive("e8","MKT", 40150.0));
        marketingManager.add(new Executive("e9","MKT", 52200.0));

        salesManager.add(new Executive("e11","SLS", 40150.0));
        salesManager.add(new Executive("e12","SLS", 52200.0));
        salesManager.add(new Executive("e13","SLS", 50150.0));
        salesManager.add(new Executive("e14","SLS", 42200.0));
        salesManager.add(new Executive("e15","SLS", 32200.0));

        financeManager.add(new Executive("e16","FIN", 23150.0));
        financeManager.add(new Executive("e17","FIN", 32200.0));
        financeManager.add(new Executive("e18","FIN", 40150.0));

        double projectSalary = ceo.projectSalary();
        System.out.println("projectSalary = " + projectSalary);
    }
}
