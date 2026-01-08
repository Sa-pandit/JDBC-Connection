import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String MySqlDriver = "com.mysql.cj.jdbc.Driver";
            String MySqlUrl = "jdbc:mysql://localhost:3306/test";
            System.out.println("Connecting to database...");

            Class.forName(MySqlDriver);
            Connection con = DriverManager.getConnection(MySqlUrl, "root", "root");

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}