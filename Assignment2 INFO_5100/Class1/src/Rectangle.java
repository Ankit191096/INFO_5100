public class Rectangle extends Shape {
    private int width;
    private int height;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width){
        this.setWidth(width);
        this.setHeight(width);
    }

    public Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name , String color , int width , int height){
        this.setName(name);
        this.setColor(color);
        this.setWidth(width);
        this.setHeight(height);

    }

    @Override
    public int getArea() {
        return  height * width;
    }

    @Override
    public int getPerimeter(){
        return (2 * width) + (2 * height);
    }
}
