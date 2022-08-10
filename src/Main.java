import database.DbConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        DbConnection connection = new DbConnection();

        try (Connection cnx = connection.getConnection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}