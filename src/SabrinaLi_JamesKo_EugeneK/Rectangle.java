package SabrinaLi_JamesKo_EugeneK;

public class Rectangle extends Shape
{
    private int width;
    private int length;
    public Rectangle (int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width ;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }


}