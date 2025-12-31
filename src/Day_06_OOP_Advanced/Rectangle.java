package Day_06_OOP_Advanced;

public class Rectangle extends Shape{

    double width ,length;
    Rectangle(double length , double width ){
        this.length = length;
        this.width = width ;
    }
    @Override
    double area(){
        return length * width ;
    }
}


