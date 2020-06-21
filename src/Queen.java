import java.util.HashMap;
import java.util.Map;

public class Queen extends Ant {

    int positionX;
    int positionY;
    int step;
    private static boolean womansMoods =true;
    boolean droneErect;
    Queen(int step, boolean moods){
        womansMoods = moods;
        this.step = step;
    }

    public static boolean isWomansMoods() {
        return womansMoods;
    }

    public static void setWomansMoods(boolean moods) {
        womansMoods = moods;
    }

    @Override
    public void setPosition(int x, int y, String[][] board) {
        this.positionX = x;
        this.positionY = y;
        board[x][y] = "Q";
    }
    public Map<String, Integer> getQueenPosition(){
        Map<String, Integer> position = new HashMap<>();
        position.put("positionX", positionX);
        position.put("positionY", positionY);
        return position;
    }
    @Override
    public void setStep(String[][] board) {
        board[positionX][positionY] = "Q";
    }
}
