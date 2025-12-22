//task 1
public class restangle {

    private double width;
    private double height;
    private int id;
    private static int idGen = 1;


    public restangle() {
        width = 1.0;
        height = 1.0;
        id = idGen++;
    }
    public restangle(double width, double height) {
        this();
        setWidth(width);
        setHeight(height);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    public int getId() {
        return id;
    }


    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Restangle{id=" + id +
                ", width=" + width +
                ", height=" + height + "}";
    }
}

