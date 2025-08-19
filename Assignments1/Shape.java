package Assignments.Assignments1;
//Question 4:
//Create a class Shape with a method draw(). Create two subclasses Circle
//and Square that override the draw() method. In the main method, use a
//Shape reference to call the methods.
//[Using Polymorphism]
class Shape {
    void draw(){
        System.out.println("Drawing a Shape");
    }
}class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Circle");
    }

}class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Square");
    }

}
class Mains{
    public static void main(String[] args) {
        Shape s1 =new Circle();
        Shape s2 = new Square();
        s1.draw();
        s2.draw();
    }
}
