import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker extends Ant{

    int positionX;
    int positionY;
   private List<String> directionStep = new ArrayList<>();
    int step;

    public Worker(int step) {

        this.step = step;
        directionStep.add("N");
        directionStep.add("S");
        directionStep.add("E");
        directionStep.add("W");
    }

    public List<String> getDirectionStep() {
        return directionStep;
    }

    @Override
    public void setPosition(int x, int y, String[][] board) {
       board[x][y] = "W";
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void setStep(String[][] board) {
        String directionStep = getRandomElement(this.directionStep);
        board[positionX][positionY] = " ";
        if(directionStep.equals("W") && (positionY+1) < AntColoni.getWidthBoard() ){
            board[positionX][positionY+1] = "W";
            this.positionY +=1;
        }
        else if(directionStep.equals("E") && (positionY-1) >0 ){
            board[positionX][positionY-1] = "W";
            this.positionY -=1;
        }
        else if(directionStep.equals("N") && (positionX-1) > 0){
            board[positionX-1][positionY] = "W";
            this.positionX -=1;
        }
        else if(directionStep.equals("S") && (positionX+1) < AntColoni.getHeightBoard()){
            board[positionX + 1][positionY] = "W";
            this.positionX +=1;
        }else {
            board[positionX][positionY] = "W";
        }


    }
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


}
