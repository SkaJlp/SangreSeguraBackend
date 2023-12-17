package mx.uv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url = "jdbc:mysql://bahh1qqfgt63a6odemxa-mysql.services.clever-cloud.com:3306/bahh1qqfgt63a6odemxa";
    private static String driverName = "com.mysql.cj.jdbc.Driver"; 
    private static String username = "uprscmbmpp14utjr";
    private static String password = "e82X2glxPCOQxn2o87W6";
    // variable de conexion
    private static Connection connection = null;

    public static Connection getConnection(){
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println(" SQL:" + e);
        } catch (ClassNotFoundException e){
            System.out.println("Driver:" + e);
        }
        return connection;
    }
}