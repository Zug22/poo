import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSupabase {

    private static final String URL = "jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:5432/postgres";
    private static final String USER = "postgres.snghnxpdoffuasscqmms";
    private static final String PASSWORD = ""; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
