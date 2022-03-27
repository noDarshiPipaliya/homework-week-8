package cylinder;

public class Circle {

    static final double PI = 3.14;
    double radius;

    public Circle(double radius){
        if(radius<0){
            radius=0;
        }
        radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (radius*radius*PI);
    }









}
