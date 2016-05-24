package generics.employee;

import generics.Task;

public class EmployeeTaskImpl implements Task<Employee> {
    private Employee employee;

    public EmployeeTaskImpl(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void execute() {
        employee.calculateMonthlySalary();
    }

    @Override
    public Employee getResult() {
        return employee;
    }
}
