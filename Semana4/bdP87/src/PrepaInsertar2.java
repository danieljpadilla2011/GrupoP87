import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepaInsertar {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\db87\\hr.db";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del Departamento");
        String depName = sc.nextLine();
        System.out.println("Introduzca el Id de la Ubicación");
        Integer locId = sc.nextInt();
        try {
            Connection conn = DriverManager.getConnection(url);
            String sql = "insert into departments (department_name, location_id) values (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, depName);
            pstmt.setInt(2, locId);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Se ha Insertado un nuevo registro");
            }
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Se ha presentado el error: " + e.getMessage());
            e.printStackTrace();
        }
        sc.close();

    }
}
