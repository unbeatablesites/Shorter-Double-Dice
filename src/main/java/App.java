import java.util.Random;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("HERE COME THE DICE!\n");


        Random rand = new Random();

        int diceRoleOne = 1 + rand.nextInt(6);
        int diceRoleTwo = 1 + rand.nextInt(6);



    }

}
