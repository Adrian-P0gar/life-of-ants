import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Drone extends Ant{
    int step = 0;
    int positionX;
    int positionY;
    private List<String> directionStep = new ArrayList<>();
    private Map<String, Integer> queenPosition;



    public Drone(Map<String, Integer> queenPosition, int step) {
        this.step = step;
        this.queenPosition = queenPosition;

    }

    @Override
    public void setPosition(int x, int y, String[][] board) {
        board[x][y] = "D";
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void setStep(String[][] board) {
        int queenX = queenPosition.get("positionX");
        int queenY = queenPosition.get("positionY");

        if(step == 0){
            board[positionX][positionY] = " ";

        if(positionX < queenX){
            this.positionX +=1;
        }
        else if(positionX > queenX){
            positionX-=1;
        }   else{
            System.out.println("is equal");

        if( positionX == queenX && positionY == queenY  ) {
                if(Queen.isWomansMoods()){
                    System.out.println("Am bagat mort-un coscig... Am dus tauru' la grajd...");
                    Queen.setWomansMoods(false);
                    step = 1;
                } else {
                    System.out.println("Blue balls...");
                    step = 10;
                }
            }}
        if(positionY < queenY){
            positionY+=1;
        }
        else if(positionY > queenY){
            positionY-=1;
        }
        board[positionX][positionY] = "D";}
        else{
            step +=1;
            board[positionX][positionY] = "D";
            if(step >= 10){
                board[positionX][positionY] = " ";
                positionY = Main.getRandomY();
                positionX = Main.getRandomX();
                step =0;
                board[positionX][positionY] = "D";
            }
        }

    }



}