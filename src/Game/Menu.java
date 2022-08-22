package Game;
import java.lang.reflect.AnnotatedArrayType;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Menu {

    // Nouveau perso
    public Player playerChoice(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a class: ");
        String choice = sc.nextLine();

        while (!Arrays.asList(Player.typePlayer).contains(choice))
        {
            System.out.println("This class doesn't exist. New answer : ");
            choice = sc.nextLine();
        }

        System.out.println(choice);

        if (choice.equals("warrior")){

            Player warrior = new Player();
            Random rn = new Random();
            warrior.setHealth(rn.nextInt(warrior.getMaxHealthWarrior() - warrior.getMinHealthWarrior() + 1) + warrior.getMinHealthWarrior());

            return warrior;
        } else {

            Player wizard = new Player();
            Random rn = new Random();
            wizard.setHealth(rn.nextInt(wizard.getMaxHealthWarrior() - wizard.getMinHealthWarrior() + 1) + wizard.getMinHealthWarrior());

            return wizard;
        }
    }

    // Afficher info perso

    // Les modifier

    // Quitter le jeu

}
