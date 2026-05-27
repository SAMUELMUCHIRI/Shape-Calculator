package attributes;
import  java.lang.Math;

public class Circle extends Shape  implements Resizable {
    private double radius;

    public Circle(double radius , String colour , ShapeType shapeType)
    {
        super( colour , shapeType);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return "\n\t Colour\t: "+getColour()+"\n\t Type\t: "+getShapeType()+"\n\t Area\t: "+calculateArea();
    }
    public void resize(double factor)
    {
        this.radius*=factor;
    }
}
