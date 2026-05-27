import attributes.*;

public class Main{

    public static void main(String[]  args)
    {
        System.out.println("\nCreating Objects\n");
        Circle newCircle = new Circle(4,"Blue",ShapeType.CIRCLE);
        Rectangle newRectangle = new Rectangle(3.0 , 4.2 , "Green" , ShapeType.RECTANGLE);

        System.out.println("\nPrinting Information\n");
        newCircle.printInfo();
        newRectangle.printInfo();

        System.out.println("\nCalculating Area\n");
        System.out.println("Area of Circle\t" + newCircle.calculateArea());
        System.out.println("Area of Rectangle\t" + newRectangle.calculateArea());

        System.out.println("\nResizing Circle by Two and Printing Area\n");
        newCircle.resize(2.0);
        System.out.println("Area of Circle\t" + newCircle.calculateArea());

        System.out.println("\nTo String function applied to items\n");
        Shape[] shapes = {newCircle , newRectangle};
        for(Shape s : shapes)
        {
            System.out.println(s.toString());
        }


    }

}
