import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3307/tabelas";
    private static final String USER = "root";
    private static final String PASSWORD = "2050";
    private static final String TABLE = "tabela";

    public static String getAll() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM "+ TABLE)) {
            
        	String content = "";
            while (rs.next()) {
                content += rs.getString("texto") + "\n";
            }
            return content;

        } catch (SQLException e) {
        	
        }
        return "Error: No database connection";
    }
    
    public static String getById(int id) {
        try {
        	Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        	String sql = "SELECT * FROM "+ TABLE +" WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        	
        	String content = "";
            while (rs.next()) {
                return rs.getString("texto");
            }
            return "Error: No value with id";

        } catch (SQLException e) {
            System.err.println("Database connection error occurred.");
            e.printStackTrace();
        }
        return "Error: No database connection";
    }
}
