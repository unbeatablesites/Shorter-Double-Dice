import java.util.Random;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("HERE COME THE DICE!\n");

        Random rand = new Random();
        Random rand2 = new Random();

        do {

            int diceRoleOne2 = 1 + rand.nextInt(6);
            int diceRoleTwo1 = 1 + rand2.nextInt(6);
            System.out.println("Roll #1: " + diceRoleOne2);
            System.out.println("Roll #2: " + diceRoleTwo1);

        }while (diceRoleOne2 != diceRoleTwo1);



    }

}
