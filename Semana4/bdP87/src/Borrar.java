import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Borrar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db87\\hr.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sql = "delete from departments where department_id=15";
            int rows = stmt.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Departamento borrado");
            } else {
                System.out.println("Departamento no existe");
            }

        } catch (Exception e) {
            System.out.println("Se ha presentado el error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
