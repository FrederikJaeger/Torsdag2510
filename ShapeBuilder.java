import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    public ShapeBuilder() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    // 4.4: Beregn det samlede areal af alle shapes
    public double getTotalArea() {
        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
        }
        return totalArea;
    }
}
