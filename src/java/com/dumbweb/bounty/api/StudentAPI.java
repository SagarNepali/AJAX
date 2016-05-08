/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.bounty.api;



import com.dumbweb.bounty.dao.StudentDAO;
import com.dumbweb.bounty.dao.impl.StudentDAOImpl;
import com.dumbweb.bounty.entity.Student;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("studentapi")
public class StudentAPI {

   private StudentDAO studentDAO = new StudentDAOImpl();
   

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> index() {

        return studentDAO.getAll();
    }

   
}
