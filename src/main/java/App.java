import java.util.Random;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("HERE COME THE DICE!\n");

        Random rand = new Random();
        Random rand2 = new Random();

        int diceRoleOne = rand.nextInt(6);
        int diceRoleTwo = rand2.nextInt(6);

        do {

            diceRoleOne = 1 + rand.nextInt(6);
            diceRoleTwo = 1 + rand2.nextInt(6);
            System.out.println("Roll #1: " + diceRoleOne);
            System.out.println("Roll #2: " + diceRoleTwo);

            System.out.println("The total is " + (diceRoleOne + diceRoleTwo) +"!");

        }while (diceRoleOne != diceRoleTwo);



    }

}
