package Question1;

public class Roomba implements iRobot {
    static class Points{
        int x, y;
        Points(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    final static int UNCLEANED = 0;
    final static int BLOCKED = -1;
    final static int CLEANED = 1;
    int [][] matrix ;
    Direction currentDirection;
    Points currentLocation;

    Roomba (Direction c,Points p,int[][] matrix){
        currentDirection = c;
        currentLocation = p;
        this.matrix = matrix;
    }
    @Override
    public boolean move() {
        int x = currentLocation.x;
        int y = currentLocation.y;
        if(currentDirection == Direction.DOWN){
            if(x + 1 <= matrix.length - 1 && matrix[x + 1][y] != -1){
                currentLocation.x = x+1;
                return true;
            }else return false;
        }else if(currentDirection == Direction.UP){
            if(x - 1 >= 0 && matrix[x - 1][y] != -1){
                currentLocation.x = x-1;
                return true;
            }else return false;
        }else if(currentDirection == Direction.RIGHT){
            if(y + 1 <= matrix[0].length - 1 && matrix[x][y + 1] != -1){
                currentLocation.y = y+1;
                return true;
            }else return false;
        }else if(currentDirection == Direction.LEFT){
            if(y - 1 >= 0 && matrix[x][y - 1] != -1){
                currentLocation.y = y-1;
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(currentDirection == Direction.UP)currentDirection = Direction.LEFT;
        else if(currentDirection == Direction.LEFT)currentDirection = Direction.DOWN;
        else if(currentDirection == Direction.DOWN)currentDirection = Direction.RIGHT;
        else if(currentDirection == Direction.RIGHT)currentDirection = Direction.UP;
    }

    @Override
    public void turnRight() {
        if(currentDirection == Direction.UP)currentDirection = Direction.RIGHT;
        else if(currentDirection == Direction.RIGHT)currentDirection = Direction.DOWN;
        else if(currentDirection == Direction.DOWN)currentDirection = Direction.LEFT;
        else if(currentDirection == Direction.LEFT)currentDirection = Direction.UP;
    }

    @Override
    public void clean() {
        if(matrix != null){
            matrix[currentLocation.x][currentLocation.y] = 1;
        }

    }

}
