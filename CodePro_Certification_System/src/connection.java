//import java.awt.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class connection {
//    static Connection connect;
//
//    public static Connection create() {
//        try {
//            // For loading of DRIVERS
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // URL of schema's we have created at MySQL
//            String url = "jdbc:mysql://localhost:3306/codePro";
//            String user = "root";
//            String pass = "huzaifa123";
//
//            // For communication with the databases
//            connect = DriverManager.getConnection(url, user, pass);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return connect;
//}
//}