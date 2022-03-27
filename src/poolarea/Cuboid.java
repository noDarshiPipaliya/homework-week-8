package poolarea;

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double w, double l, double h) {
        super(w, l);
        if(h<0){
            h=0;
        }
        this.height=h;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public double getHeight(){
        return height;
    }


}
