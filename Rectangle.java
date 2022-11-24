public class Rectangle extends Shape
{
    private int width;
    private int height;
    private String name;
    
    public Rectangle(String theName, int theWidth, int theHeight)
    {
        super(theName);
        width = theWidth;
        height = theHeight;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "Rectangle with width " + width + " and height " + height;
    }
    
    public boolean equals(Rectangle other)
    {
        return width == other.getWidth() && height == other.getHeight();
    }
    
    public double getArea(){
        return (double)width * height;

    public int getPerimeter(){
        return (2*width + 2*height);
    }

    public int setWidth(int width){
        this.width = width
    }
}
