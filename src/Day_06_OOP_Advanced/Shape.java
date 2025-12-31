package Day_06_OOP_Advanced;

public abstract class Shape {
    abstract double area();
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(8 , 9);
        System.out.println("The area of the circle is " + circle.area());
        System.out.println( "The area of the rectangle is " + rectangle.area());

        //Polymorphism
        Shape s1 = new Rectangle(6 , 5);
        Shape s2 = new Circle(6);
        System.out.println("The area of s1 is " + s1.area());
        System.out.println("The area of s2 is " + s2.area());
    }
}
