package MiniProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Operation{
    void addStudent(Student s);
    void deleteStudent(String id);
    void updateStudent(String id,Student s);
    List<Student> displayStudents();
}
class StudentDatabase implements Operation{
    List<Student> al =new ArrayList<>();

    @Override
    public void addStudent(Student s) {
        al.add(s);
        System.out.println("Student data Added");
    }
    @Override
    public void deleteStudent(String id) {
        for (int i=0;i< al.size();i++){
            Student s=al.get(i);
            if(s.id.equals((id))){
                al.remove(i);
                System.out.println("Deleted!");
                return;
            }
        }
        System.out.println("Not Found");
    }

    @Override
    public void updateStudent(String id, Student s) {
        for (int i=0;i<al.size();i++){
            if(al.get(i).id.equals((id))){
                al.set(i,s);
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Not Found");
    }

    @Override
    public List<Student> displayStudents() {
        return al;
    }
}
class StudentManagementSystem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDatabase db=new StudentDatabase();
        while(true){
            System.out.println("\n1.Add Student \n2.Delete Student\n3.Update Student\n4.View Student\n5.Exit\n");
            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter Student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Id: ");
                    String id=sc.nextLine();
                    System.out.print("Enter Student Registered course: ");
                    String course=sc.nextLine();
                    System.out.print("Enter Student Marks: ");
                    float marks =sc.nextFloat();
                    db.addStudent(new Student(name,id,course,marks));
                    break;
                case 2:
                    System.out.print("Enter Id to Delete: ");
                    String id1 = sc.nextLine();
                    db.deleteStudent(id1);
                    break;
                case 3:
                    System.out.print("Enter Id to Update: ");
                    String id2 = sc.nextLine();
                    System.out.print("Enter new name: ");
                    String n=sc.nextLine();
                    System.out.print("Enter Id: ");
                    String id3=sc.nextLine();
                    System.out.print("Enter Course: ");
                    String c=sc.nextLine();
                    System.out.print("Enter Marks: ");
                    float mark=sc.nextFloat();
                    db.updateStudent(id2,new Student(n,id3,c,mark));
                    break;
                case 4:
                    System.out.println("Student Details: \n");
                    for(Student s:db.displayStudents()){
                        s.display();
                        System.out.println("-------------------------------------");

                    }break;
                case 5:
                    System.out.println("Exiting...");
                    return;

            }
        }
    }
}























class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: "+name);
    }
}
class Student extends Person{
    String id;
    String course;
    float marks;
    Student(String name,String id,String course,float marks){
        super(name);
        this.id=id;
        this.course=course;
        this.marks=marks;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Id: "+id+"\nCourse: "+course+"\nMarks: "+marks);
    }
}