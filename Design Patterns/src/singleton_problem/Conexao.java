package singleton_problem;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {
	final static String DATABASE = "singleton_problem";
    public static Connection conectar() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/"+ DATABASE;
            return DriverManager.getConnection(url,"root","root");
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }
    }
}
