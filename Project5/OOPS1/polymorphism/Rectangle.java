package polymorphism;

public class Rectangle extends Shape {

    double length,width;

    Rectangle (double length, double width){

        this.length = length;
        this.width = width;


    }
    @Override
    public double area(){
        System.out.print("Area for Rectangle :");
        return length * width;

    }

}
