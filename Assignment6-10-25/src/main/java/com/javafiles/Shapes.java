package com.javafiles;

//Q5. Implement an abstract class Shape with abstract methods area() and perimeter().
//Extend it into Circle and Rectangle.   

abstract class Shape {
 public abstract double area();
 public abstract double perimeter();
}

class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }

 @Override
 public double perimeter() {
     return 2 * Math.PI * radius;
 }
}

class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double area() {
     return length * width;
 }

 @Override
 public double perimeter() {
     return 2 * (length + width);
 }
}

public class Shapes {
 public static void main(String[] args) {
     Shape circle = new Circle(5);   
     Shape rectangle = new Rectangle(4, 6); 

     System.out.println("Circle area: " + circle.area());
     System.out.println("Circle perimeter: " + circle.perimeter());

     System.out.println("Rectangle area: " + rectangle.area());
     System.out.println("Rectangle perimeter: " + rectangle.perimeter());
 }
}

