package Day_06_OOP_Advanced;

public class Circle extends Shape{

    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area (){
        return Math.PI * radius * radius ;
    }
}
