/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.bounty.dao.impl;

import com.dumbweb.bounty.dao.StudentDAO;
import com.dumbweb.bounty.db.DbConn;
import com.dumbweb.bounty.entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class StudentDAOImpl implements StudentDAO{
    private DbConn db = new DbConn();
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    
    @Override
    public void insert(Student s) throws ClassNotFoundException, SQLException {
        
        db.open();
        String sql = "INSERT INTO student WHERE firstname=?,lastname=?,address=?,contact=?,status=?";
        
        ps=db.initStatement(sql);
        
        ps.setString(1,s.getFirstName());
        ps.setString(2,s.getLastName());
        ps.setString(3,s.getAddress());
        ps.setString(4,s.getContact());
        ps.setBoolean(5,s.isStatus());
      
        rs = db.executeQuery();
        
        while(rs.next()){
            System.out.println("Inserted Successfully");
        }
        db.close();
        
    }

    @Override
    public void delete(int id) {
        
    }

    @Override
    public Student getById(int id) {
       
        return new Student();
    }

    @Override
    public List<Student> getAll() {

        List<Student> studentList = new ArrayList<>();
      try {

            String sql = "SELECT *FROM student ";

            db.open();
            ps = db.initStatement(sql);

            rs = db.executeQuery();

            while (rs.next()) {
                Student d = new Student();
                d.setId(rs.getInt(1));
                d.setFirstName(rs.getString(2));
                d.setLastName(rs.getString(3));
                d.setAddress(rs.getString(4));
                d.setContact(rs.getString(5));
                d.setStatus(rs.getBoolean(6));

                studentList.add(d);

            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return studentList;
    }

    @Override
    public int update(Student s) {
        
        return 1;
    }
    
}
