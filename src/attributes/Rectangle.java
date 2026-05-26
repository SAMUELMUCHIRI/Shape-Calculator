package attributes;

public class Rectangle extends Shape{
    private double width , height;

    public Rectangle(double width ,double height , String colour , ShapeType shapeType)
    {
        super( colour , shapeType);
        this.width =width ;
        this.height = height ;
    }


    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString()
    {
        return "\n\t Colour\t: "+getColour()+"\n\t Type\t: "+getShapeType()+"\n\t Area\t: "+calculateArea();
    }
}
