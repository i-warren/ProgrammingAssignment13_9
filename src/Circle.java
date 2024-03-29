public class Circle
        extends GeometricObject implements Comparable<Circle>{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " +
                getDateCreated() +
                " and the radius is " +
                radius);
    }

    /** Override compareTo() to evaluate radius*/
    @Override
    public int compareTo(Circle obj) {
        return Double.compare(this.radius, obj.radius);
    }

    /** Override equals(Object obj) to compare radius*/
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle){
            return this.radius == ((Circle)obj).radius;
        } else {
            return false;
        }
    }
}
