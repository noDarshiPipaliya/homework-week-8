package cylinder;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double height) {
        super(radius);

        if (height < 0) {
            height = 0;
        }
        height = height;
    }

    public double getHeight() {
        return height;
    }
public double getVolume(){
        return super.getArea()*getHeight();
}

}