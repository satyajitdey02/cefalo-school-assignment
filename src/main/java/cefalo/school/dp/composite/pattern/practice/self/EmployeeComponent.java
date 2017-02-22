package cefalo.school.dp.composite.pattern.practice.self;

/**
 * Created by satyajit on 10/1/16.
 */
public abstract class EmployeeComponent {
    public void add(EmployeeComponent employeeComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(EmployeeComponent employeeComponent) {
        throw new UnsupportedOperationException();
    }

    public EmployeeComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String departmentName() {
        throw new UnsupportedOperationException();
    }

    public double getSalary() {
        throw new UnsupportedOperationException();
    }

    public double projectSalary() {
        throw new UnsupportedOperationException();
    }
}
