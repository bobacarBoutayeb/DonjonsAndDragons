package Game;
import java.util.Scanner;

public class Menu {

    // Nouveau perso
    public Player playerChoice(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a class: ");
        String choice = sc.nextLine();

        System.out.println(choice);

        return new Player();

//        if (choice == "guerrier"){
//            return new Player();
//        } else {
//            System.out.println("This class don't exist: ");
//            playerChoice();
//        }
    }

    // Afficher info perso

    // Les modifier

    // Quitter le jeu

}
