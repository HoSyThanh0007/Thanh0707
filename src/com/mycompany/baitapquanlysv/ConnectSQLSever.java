/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapquanlysv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class ConnectSQLSever {
    public static void main(String[] args) {
        
        String connectionUrl =  "jdbc:sqlserver://localhost;encrypt=false;user=sa;password=123456;applicationName=LAPTOP-Q9EDFG23\\SQLEXPRESS;databaseName=DBBaiTapLon";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = (Statement) con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM SinhVien";
            ResultSet rs = stmt.executeQuery(SQL);
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MaSV") + "   " +rs.getString("HoVaTen"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
