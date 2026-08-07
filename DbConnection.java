import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/studentdb";
        String username = "root";
        String password = "cse@123";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
