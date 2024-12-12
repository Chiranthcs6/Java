abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    final  double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    @Override
    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
class Trianlge extends Shape{
    final  double side1;
    final  double side2;
    final  double side3;
    public Trianlge(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    double calculateArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    double calculatePerimeter(){
        return side1+side2+side3;
    }
}
public class main{
    public static void main(String args[]){
        double r=4.0;
        Circle circle = new Circle(r);
        double ts1=3.0, ts2=4.0, ts3=5.0 ; 
        Trianlge trianlge= new Trianlge(ts1, ts2, ts3);
        System.out.println("Area of the circle "+circle.calculateArea());
        System.out.println("Perimeter of the circle "+circle.calculatePerimeter());
        System.out.println("\n Side of the triangle:" +ts1+","  +ts2+  ","+ts3);
        System.out.println("Area of the triangle:"+trianlge.calculateArea());
        System.out.println("Perimeter of the triangle:"+trianlge.calculatePerimeter());
     }
}