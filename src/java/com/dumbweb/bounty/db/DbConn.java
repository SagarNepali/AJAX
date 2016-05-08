/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.bounty.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DbConn {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void open() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/bounty", "root", "");

    }

    public void close() throws SQLException {

        if (con != null && !con.isClosed()) {
            con.close();
            con = null;
        }
    }

    public PreparedStatement initStatement(String sql) throws SQLException {

        ps = con.prepareStatement(sql);

        return ps;
    }

    public java.sql.ResultSet executeQuery() throws SQLException {

        rs = ps.executeQuery();

        return rs;
    }

    public int executeUpdate() throws SQLException {

        int rowsAffected = ps.executeUpdate();

        return rowsAffected;

    }

}
