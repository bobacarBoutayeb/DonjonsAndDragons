package interactions;

import java.sql.*;

public class DatabaseConnect {
    protected Connection connection;

    protected void openDatabaseConnection() throws SQLException {
        System.out.println("Connection to the database...");
        connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/donjon",
                "zaibaker",
                "jenesaispas");
        System.out.println("Connection valid: " + connection.isValid(5));
    }
    protected void closeDatabaseConnection() throws SQLException{
        System.out.println("Closing database connection...");
        connection.close();
        System.out.println("Connection valid: " + connection.isValid(5));
    }
}

/*
package interactions;

import java.sql.*;

public class DatabaseManager {
    private final DatabaseConnect dbaccess;

    public DatabaseManager() throws SQLException {
         this.dbaccess = new DatabaseConnect();
         dbaccess.openDatabaseConnection();
    }
    public void createData(String heroName, String heroType, int heroHealth, int heroAttack) throws SQLException {
        System.out.println("Creating data...");
        int rowsInserted;
        try (PreparedStatement statement = dbaccess.connection.prepareStatement("""
                INSERT INTO donjon.hero(name, type, health, attack)
                VALUES (?,?,?,?)
                """)) {
            statement.setString(1, heroName);
            statement.setString(2, heroType);
            statement.setInt(3, heroHealth);
            statement.setInt(4, heroAttack);
            rowsInserted = statement.executeUpdate();
        }
        System.out.println("Rows inserted: " + rowsInserted);
    }
    public void readData() throws SQLException {
        System.out.println("Reading data...");
        try (PreparedStatement statement = dbaccess.connection.prepareStatement("""
                SELECT name,type,health,attack
                FROM hero
                """)) {
            ResultSet resultSet = statement.executeQuery();
            boolean empty = true;
            while (resultSet.next()){
                String heroName = resultSet.getString(1);
                String heroType = resultSet.getString(2);
                int heroHealth = resultSet.getInt(3);
                int heroAttack = resultSet.getInt(4);
                System.out.println("\t> " + heroName + " " + heroType + " " + heroHealth + " " + heroAttack);
                empty = false;
            }
            if (empty){
                System.out.println("\t (no data)");
            }
            }
    }
    public void updateData(String heroName, String newHeroType, int newHeroHealth, int newHeroAttack) throws SQLException {
        System.out.println("Updating data...");
        try (PreparedStatement statement = dbaccess.connection.prepareStatement("""
                UPDATE hero
                SET type = ?, health = ?, attack = ?
                WHERE name = ?
                """)) {
            statement.setString(1, newHeroType);
            statement.setInt(2, newHeroHealth);
            statement.setInt(3, newHeroAttack);
            statement.setString(4, heroName);
            int rowsUpdated;
            rowsUpdated = statement.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        }
    }
    public void deleteData(String heroName) throws SQLException {
        System.out.println("Deleting data...");
        try (PreparedStatement statement = dbaccess.connection.prepareStatement("""
                    DELETE FROM hero
                    WHERE name LIKE ?
                """)) {
            statement.setString(1, heroName);
            int rowsDeleted = statement.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);

        }

    }
}

 */