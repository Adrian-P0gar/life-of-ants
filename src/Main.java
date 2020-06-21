import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static boolean queenMood;
    public static int counterStep;
    public static AntColoni coloni = new AntColoni(15, 15);
    public static Worker worker = new Worker(counterStep);
    public static Worker worker1 = new Worker(counterStep);
    public static Soldier soldier = new Soldier(counterStep);
    public static Queen queen = new Queen(counterStep, queenMood);
    public static Drone drone;

    public static void main(String[] args) {
        System.out.println("Start");

        setPositionForInsect();
        coloni.printColoni();

        while (true){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Press 1");

            String userImput = myObj.nextLine();  // Read user input
            if(userImput.equals("1")){

                makeStept();
            }
        }
    }
    public static void setPositionForInsect(){
        worker.setPosition(getRandomX(),getRandomY(),coloni.getDimensionColoni());
        worker1.setPosition(getRandomX(),getRandomY(),coloni.getDimensionColoni());
        soldier.setPosition(getRandomX(),getRandomY(), coloni.getDimensionColoni());
        queen.setPosition(getRandomX(),getRandomY(),coloni.getDimensionColoni());
        drone = new Drone(queen.getQueenPosition(), counterStep);
        drone.setPosition(getRandomX(),getRandomY(), coloni.getDimensionColoni());

    }
    public static void makeStept(){
        int randomNumber = 20;
        if(!Queen.isWomansMoods()){
            counterStep++;
            System.out.println("!!!!!!" + counterStep);
            if (counterStep == randomNumber){
            Queen.setWomansMoods(true);
            counterStep = 0;
            }
        }
       worker.setStep(coloni.getDimensionColoni());
       soldier.setStep(coloni.getDimensionColoni());
       queen.setStep(coloni.getDimensionColoni());
       drone.setStep(coloni.getDimensionColoni());
       coloni.printColoni();

   }
    public static int getRandomX(){

        return ThreadLocalRandom.current().nextInt(0, (AntColoni.getHeightBoard()-1));
    }
    public static int getRandomY(){
        return ThreadLocalRandom.current().nextInt(0,  (AntColoni.getWidthBoard()-1));
    }

}
