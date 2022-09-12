package character.hero;

public class HeroOutOfBound extends Exception{
    public HeroOutOfBound(){
        System.out.println("Hero is outside of the board");
    }
}
