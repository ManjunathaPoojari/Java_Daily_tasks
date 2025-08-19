package Assignments.Assignments1;
//Create a class Animal with a method sound(). Create a subclass Dog that inherits from
//Animal and prints "Dog barks"
//[Using Inheritance]
public class Animal {
    void sound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d =new Dog();
        d.sound();
    }
}
