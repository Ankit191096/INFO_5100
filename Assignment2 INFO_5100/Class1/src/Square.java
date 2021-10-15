public class Square extends Shape{
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    int side;

    public Square(int side){
        this.setSide(side);
    }

    public  Square(String name , String color , int side){
        this.setName(name);
        this.setColor(color);
        this.setSide(side);
    }

    @Override
    public int getArea() {
        return side*side;
    }

    @Override
    public int getPerimeter(){
        return 4*side;
    }
}
