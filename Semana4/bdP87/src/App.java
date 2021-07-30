import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:sqlite:C:\\db87\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sql = "select * from departments";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Integer idDept = rs.getInt("department_id");
                String nomDept = rs.getString("department_name");
                Integer IdLoc = rs.getInt("location_id");
                System.out.println(idDept + " " + nomDept + " " + IdLoc);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Se ha presentado el error: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
