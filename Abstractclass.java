abstract class Shape{
    abstract double area();
    void display(){
        System.out.println("Showing details of the shape");
    }
}
class Circle extends Shape{
        double radius;
        Circle(double radius){
            this.radius=radius;
        }
        @Override
        double area(){
            return Math.PI*radius*radius;
        }

}
public class Abstractclass{
    public static void main(String[] args){
        Circle circle=new Circle(5.0);
        System.out.println("Area of the circle with radius 5 is "+circle.area());
        circle.display();
    }
}