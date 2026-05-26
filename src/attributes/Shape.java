package attributes;

public abstract class Shape {
    private String colour ;
    private ShapeType shapeType;

    public Shape(String colour , ShapeType shapeType)
    {
        this.colour = colour ;
        this.shapeType = shapeType;
    }

    public String getColour()
    {
        return colour;
    }

    public ShapeType getShapeType()
    {
        return shapeType;
    }

    public void printInfo()
    {
        System.out.println("Colour \t: \t"+colour +"\nShapetype : \t"+shapeType);
    }

    public abstract double calculateArea();
}
