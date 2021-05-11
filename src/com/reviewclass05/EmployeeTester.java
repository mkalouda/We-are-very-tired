package com.reviewclass05;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employeeEva = new Employee();
        employeeEva.id="123f";
        employeeEva.name="Eva";
        employeeEva.department="IT";
        employeeEva.salary=150000;

        Employee employeeAli = new Employee();
        employeeAli.id="234a";
        employeeAli.name="Ali";
        employeeAli.department="IT";
        employeeAli.salary=20000;


        Employee[] employees = new Employee[2];
        employees[0]=employeeEva;
        employees[1]=employeeAli;

        for (Employee employee: employees){
            System.out.println("employee id:"+ employee.id);
            System.out.println("employee name:"+ employee.name);
            System.out.println("employee department:"+ employee.department);
            System.out.println("employee salary:"+ employee.salary);
            employee.drink();
            employee.work();
            System.out.println();
        }

    }

}
