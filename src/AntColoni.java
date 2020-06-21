import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AntColoni {

        private static String[][] dimensionColoni;

        public AntColoni(int x, int y){
            this.dimensionColoni = new String[x][y];
            for(int i = 0; i< dimensionColoni.length; i++){
                for(int j = 0; j< dimensionColoni[i].length; j++){
                    dimensionColoni[i][j] = " ";
                }

            }
        }
        public static int getHeightBoard(){
            return dimensionColoni.length;
        }
        public static int getWidthBoard(){
            return dimensionColoni[0].length;
        }

    public String[][] getDimensionColoni() {
        return dimensionColoni;
    }

    public void printColoni(){

            for(int i=0; i<getHeightBoard(); i++){
                System.out.print( "\n");
                for(int j=0; j< getWidthBoard(); j++){
                    System.out.print( "|" + dimensionColoni[i][j]  + "|" );
                }
            }
        System.out.println("\n");
        }
    @Override
    public String toString() {
        return "AntColoni{" +
                "dimensionColoni=" + Arrays.toString(dimensionColoni) +
                '}';
    }
}