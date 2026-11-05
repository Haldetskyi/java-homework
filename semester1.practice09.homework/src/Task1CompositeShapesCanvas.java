
import java.util.Locale;

public class Task1CompositeShapesCanvas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Point2D center = new Point2D(0, 0);
        Circle2D circle = new Circle2D("Коло-А", center, 5);
        Rectangle2D rect = new Rectangle2D("Плита-Б", new Point2D(10, 5), 4, 6);
        RightTriangle2D triangle = new RightTriangle2D("Клин-В", new Point2D(-3, 2), 3, 4);
        center.translate(100, 100);
        System.out.println("Зовнішня точка змінена на " + center + ", центр кола: " + circle.getAnchorPoint());
        circle.getAnchorPoint().translate(50, 50);
        System.out.println("Змінили копію з геттера, центр кола: " + circle.getAnchorPoint());

        GeometryCanvas canvas = new GeometryCanvas("Інженерне креслення №1", 5);
        canvas.addShape(circle);
        canvas.addShape(rect);
        canvas.addShape(triangle);

        System.out.println();
        System.out.println("================ ГЕОМЕТРИЧНЕ ПОЛОТНО (КОМПОЗИЦІЯ + ABSTRACT) ================");
        System.out.print(canvas);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Сумарна площа креслення:    " + String.format("%.2f", canvas.getTotalArea()) + " кв.од.");
        System.out.println("Сумарний периметр:          " + String.format("%.2f", canvas.getTotalPerimeter()) + " од.");
        AbstractShape2D largest = canvas.findLargestShape();
        System.out.println("Найбільша фігура:           " + largest.getName() + " (S = " + String.format("%.2f", largest.getArea()) + ")");
        System.out.println("-> Переміщуємо всі фігури полотна на вектор (+5.0; -2.0)...");
        canvas.moveAllShapes(5.0, -2.0);
        System.out.println("Новий центр 'Коло-А': " + circle.getAnchorPoint());
        System.out.println("=============================================================================");
    }
}
class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(Point2D other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distanceTo(Point2D other) {
        double dx = other.x - x;
        double dy = other.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", x, y);
    }
}
abstract class AbstractShape2D {
    private final String name;
    private final Point2D anchorPoint;

    public AbstractShape2D(String name, Point2D anchorPoint) {
        this.name = name;
        this.anchorPoint = (anchorPoint != null) ? new Point2D(anchorPoint) : new Point2D(0, 0);
    }

    public String getName() {
        return name;
    }

    public Point2D getAnchorPoint() {
        return new Point2D(anchorPoint);
    }

    public void moveBy(double dx, double dy) {
        anchorPoint.translate(dx, dy);
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    protected String getDetails() {
        return "";
    }
    @Override
    public String toString() {
        String details = getDetails();
        String detailsPart = details.isEmpty() ? "" : ", " + details;
        return getClass().getSimpleName() + "[name='" + name + "', center=" + anchorPoint + detailsPart
                + " | S=" + String.format("%.2f", getArea())
                + ", P=" + String.format("%.2f", getPerimeter()) + "]";
    }
}

class Circle2D extends AbstractShape2D {
    private final double radius;

    public Circle2D(String name, Point2D center, double radius) {
        super(name, center);
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус має бути > 0");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    protected String getDetails() {
        return String.format("r=%.2f", radius);
    }
}

class Rectangle2D extends AbstractShape2D {
    private final double width;
    private final double height;

    public Rectangle2D(String name, Point2D center, double width, double height) {
        super(name, center);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Сторони мають бути > 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    protected String getDetails() {
        return String.format("%.2fx%.2f", width, height);
    }
}

class RightTriangle2D extends AbstractShape2D {
    private final double legA;
    private final double legB;

    public RightTriangle2D(String name, Point2D center, double legA, double legB) {
        super(name, center);
        if (legA <= 0 || legB <= 0) {
            throw new IllegalArgumentException("Катети мають бути > 0");
        }
        this.legA = legA;
        this.legB = legB;
    }

    public double getHypotenuse() {
        return Math.sqrt(legA * legA + legB * legB);
    }

    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    @Override
    public double getPerimeter() {
        return legA + legB + getHypotenuse();
    }

    @Override
    protected String getDetails() {
        return String.format("a=%.2f, b=%.2f, c=%.2f", legA, legB, getHypotenuse());
    }
}
class GeometryCanvas {
    private final String title;
    private final AbstractShape2D[] shapes;
    private int count;

    public GeometryCanvas(String title, int capacity) {
        this.title = title;
        this.shapes = new AbstractShape2D[capacity];
        this.count = 0;
    }

    public boolean addShape(AbstractShape2D shape) {
        if (shape == null || count >= shapes.length) {
            return false;
        }
        shapes[count] = shape;
        count++;
        return true;
    }

    public double getTotalArea() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += shapes[i].getArea();
        }
        return sum;
    }

    public double getTotalPerimeter() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += shapes[i].getPerimeter();
        }
        return sum;
    }

    public AbstractShape2D findLargestShape() {
        if (count == 0) {
            return null;
        }
        AbstractShape2D largest = shapes[0];
        for (int i = 1; i < count; i++) {
            if (shapes[i].getArea() > largest.getArea()) {
                largest = shapes[i];
            }
        }
        return largest;
    }

    public void moveAllShapes(double dx, double dy) {
        for (int i = 0; i < count; i++) {
            shapes[i].moveBy(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Полотно: '").append(title).append("' (Фігур: ").append(count).append("/").append(shapes.length).append(")\n");
        for (int i = 0; i < count; i++) {
            sb.append("  ").append(i + 1).append(". ").append(shapes[i]).append("\n");
        }
        return sb.toString();
    }
}