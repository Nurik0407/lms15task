import java.time.LocalDateTime;

public class Circle {
    private final double PI = 3.14;
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  static void  area( double radius){
        final double PI = 3.14;
    System.out.println(PI*(radius*radius));
}
public static void circumference(double radius){
        final double PI = 3.14;
    System.out.println(PI*2*radius);
}

}
