package Game;

import java.util.Arrays;
import java.util.Scanner;

public interface Validation {
    Scanner sc = new Scanner(System.in);
    //    Game game = new Game();
    default String getValidChoice (String[] options) {
        String choice = ChoiceInputPrompted();
        while (!Arrays.asList(options).contains(choice)){
            System.out.println();
            System.out.println("That's not a valid choice");
            System.out.println("*** Please choose a correct one: ***");
            ChoiceInputPrompted();
        }
        return choice;
    }

    default String ChoiceInputPrompted(){
        System.out.println();
        System.out.println("*** Enter your choice: ***");
        
        return this.sc.nextLine().toLowerCase();
    }
}
