package com.javafiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee7 {
    private int id;
    private String name;
    private double salary;

    public Employee7(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }
    public static void main(String[] args) {
        List<Employee7> employees = new ArrayList<>();

        employees.add(new Employee7(101, "John", 50000));
        employees.add(new Employee7(102, "Alice", 75000));
        employees.add(new Employee7(103, "Bob", 60000));
        employees.add(new Employee7(104, "Daisy", 45000));

        System.out.println("Before Sorting:");
        for (Employee7 e : employees) {
            System.out.println(e);
        }

        // Sort by salary using Comparator
        Collections.sort(employees, new Comparator<Employee7>() {
            @Override
            public int compare(Employee7 e1, Employee7 e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        System.out.println("\nAfter Sorting by Salary:");
        for (Employee7 e : employees) {
            System.out.println(e);
        }
    }
}

