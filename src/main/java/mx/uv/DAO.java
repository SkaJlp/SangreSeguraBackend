package mx.uv;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public static boolean dameUsuarios() {
        Statement stm = null;
        ResultSet rs = null;
        Connection conn = null;
        conn = Conexion.getConnection();

        try {
           
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            rs = null;
            if (stm != null) {
                try {
                    stm.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                stm = null;
            }
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return true;
    }
}
