package cgu.timetable.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/cgu_timetable  ";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws Exception {
        // ✅ Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // ✅ Return the connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
