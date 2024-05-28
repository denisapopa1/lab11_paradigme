package org.example;

import java.sql.*;
import java.util.Properties;

public class Class {
    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/lab11Db";
        Properties props = new Properties();
        props.put("user", "lab11");
        props.put("password", "pass11");
//props.put("useSSL", "false");
        DatabaseMetaData DriverManager = null;
        Connection conn = DriverManager.getConnection();
        return conn;
    }

    private static void forName(String s) {
    }

    private static void createUpdateDeleteDepartment(Connection conn) throws SQLException {
//CRUD = Create - Read - Update - Delete
//CREATE
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO DEPARTMENT (name) VALUES('dept java 1')");
        stmt.executeUpdate("INSERT INTO DEPARTMENT (name) VALUES('dept java 2')");
        Object java;
        ((Statement) stmt).executeUpdate("UPDATE DEPARTMENT SET name = 'dept java 22222' WHERE name = 'dept
                java 2'");
//DELETE
        stmt.executeUpdate("DELETE from DEPARTMENT where name = 'dept java 1'");
        stmt.close();
    }
    private static <ResultSet> void showAllDepartments(Connection conn) throws SQLException {
//READ
        Statement stmt = conn.createStatement();
        ResultSet results = (ResultSet) stmt.executeQuery("select * from DEPARTMENT");
        ResultSetMetaData rsmd = ((java.sql.ResultSet) results).getMetaData();
        int numberCols = rsmd.getColumnCount();

}
}
