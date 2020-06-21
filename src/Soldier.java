import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Soldier extends Ant{

    int positionX;
    int positionY;
    String directionStep;
    int counterDirection;
    int step;
    public Soldier(int step) {
        this.step = step;
    }

    @Override
    public void setPosition(int x, int y, String[][] board) {
        board[x][y] = "S";
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void setStep(String[][] board) {
        cycleDirection();
        board[positionX][positionY] = " ";
        if(directionStep.equals("W") && (positionY+1) < AntColoni.getWidthBoard()){
            board[positionX][positionY+1] = "S";
            this.positionY +=1;
        }
        else if(directionStep.equals("E") && (positionY-1) >0){
            board[positionX][positionY-1] = "S";
            this.positionY -=1;
        }
        else if(directionStep.equals("N")&& (positionX-1) > 0){
            board[positionX -1][positionY] = "S";
            this.positionX -=1;
        }
        else if(directionStep.equals("S") && (positionX+1) < AntColoni.getHeightBoard()){
            board[positionX + 1][positionY] = "S";
            this.positionX +=1;
        }else {
            board[positionX][positionY] = "S";
        }


    }

    public void cycleDirection(){
        counterDirection++;
        if(counterDirection > 4){
            counterDirection = 1;
        }
        if(counterDirection == 1){
            directionStep = "N";
        }
        if(counterDirection == 2){
            directionStep = "E";
        }
        if(counterDirection == 3){
            directionStep = "S";
        }
        if(counterDirection == 4){
            directionStep = "W";
        }
    }


}