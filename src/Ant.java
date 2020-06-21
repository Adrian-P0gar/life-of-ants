import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Ant{


    int positionX;
    int positionY;


    public abstract void setPosition(int x, int y, String[][] board);

    public abstract void setStep(String[][] board);


}
