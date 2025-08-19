package Assignments.Assignments1;
//Write a Java program to create a class Student with data members name, rollNumber, and
//marks.
//Create objects of the class and display the details of two students.
public class Student {
    public String name;
    int rollNumber;
    float marks;

    public Student(String name,int rollNumber,float marks) {
        this.name = name;
        this.rollNumber=rollNumber;
        this.marks =marks;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Student s1 =new Student("Manju",28,90);
        Student s2 =new Student("uma",47,75.5f);
        System.out.println("Student 1 details:");
        s1.display();
        System.out.println("--------------------------");
        System.out.println("Student 2 details:");
        s2.display();
        System.out.println("--------------------------");

        //Create a class Student with a public variable name. In the main method, create an object
        //of Student and print the name.
        s1.name = "Poojari";
        System.out.println(s1.name);
    }
}
