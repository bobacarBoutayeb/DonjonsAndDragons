package game;

import interactions.DatabaseManager;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseManager database = new DatabaseManager();
        database.createData("test", "warrior",15,5);
        database.readData();
        database.updateData("test", "wizard",10,50);
        database.readData();
        database.deleteData("test");
        database.readData();
        Game game = new Game();
        game.engine();
    }
}
