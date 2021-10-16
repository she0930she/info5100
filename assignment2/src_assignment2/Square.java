public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 2*(side+ side);
    }
}
