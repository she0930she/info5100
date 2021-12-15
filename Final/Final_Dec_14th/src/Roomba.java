import apple.laf.JRSUIConstants;

//    int[][] dir= {{0,1},{1,0}, {-1,0}, {0,-1}};


public class Roomba implements iRobot{
    enum Direction  {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    int[][] room;
    int row = 0;
    int col = 0;
    Direction dir = Direction.DOWN;

    public Roomba(int[][] room) {
        this.room = room;
    }

    @Override
    public boolean move(){
        if(dir == Direction.UP){
            if(row -1 < 0 || room[row-1][col] == -1)  return false;
            row --;
        } else if(dir == Direction.DOWN){
            if(row+1> room.length-1-1 || room[row+1][col]==-1)  return false;
            row++;
        } else if (dir == Direction.RIGHT){
            if(col+1 > room[0].length-1-1 || room[row][col+1]==-1) return false;
            col++;
        }else {
            if (col-1< 0 || room[row][col-1]==-1) return false;
            col--;
        }
        return true;
    }

    @Override
    public void turnLeft(){
        if     (dir == Direction.DOWN)  dir = Direction.RIGHT;
        else if (dir == Direction.UP)  dir= Direction.LEFT;
        else if (dir == Direction.RIGHT)  dir= Direction.UP;
        else if (dir == Direction.LEFT)  dir= Direction.DOWN;
    }

    @Override
    public void turnRight(){
        if  (dir == Direction.DOWN)      dir = Direction.LEFT;
         else if (dir == Direction.UP)  dir= Direction.RIGHT;
        else if (dir == Direction.RIGHT)  dir= Direction.DOWN;
        else if (dir == Direction.LEFT)  dir= Direction.UP;
    }

    @Override
    public void clean(){
        this.room[row][col]= 1;
    }
}
