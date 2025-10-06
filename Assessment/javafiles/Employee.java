package com.javafiles;

//Q1. Write a Java program to implement a custom immutable class Employee 
//with fields id, name, and salary.
final class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Alice", 75000);
        System.out.println(e);
    }
}
 
