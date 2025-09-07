/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nht.ultils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class JDBCConnector {

    private static JDBCConnector instance;
    private final Connection conn;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private JDBCConnector() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "hhthah05%HT");
    }

    public static JDBCConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new JDBCConnector();
        }
        return instance;
    }

    public Connection connect() {
        return this.conn;
    }

    public void close() throws SQLException {
        if (this.conn != null) {
            this.conn.close();
        }
    }
}
