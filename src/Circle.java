public class Circle {
    final double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static Double area(Circle circle) {
        return circle.getPi() * circle.getRadius() * circle.getRadius();
    }

    public static Double circumference(Circle circle) {
        return circle.getPi() * 2 * circle.getRadius();
    }
}
