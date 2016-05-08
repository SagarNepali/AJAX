/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.bounty.dao;

import com.dumbweb.bounty.entity.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface StudentDAO {
    
    void insert(Student s) throws SQLException,ClassNotFoundException;
    void delete(int id) throws SQLException,ClassNotFoundException;
    Student getById(int id);
    List<Student> getAll();
    int update(Student s)throws SQLException,ClassNotFoundException;
}
