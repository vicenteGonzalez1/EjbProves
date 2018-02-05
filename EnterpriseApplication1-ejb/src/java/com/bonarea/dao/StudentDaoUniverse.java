/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.dao;

import com.bonarea.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.sql.DataSource;

/**
 *
 * @author alumne
 */
@RequestScoped
@UniverseDao
public class StudentDaoUniverse implements IDao<Student>{

    @Resource(name="jdbc/connectionPoolUniverse")
    private DataSource dataSource;
    
    @Override
    public int add(Student model) throws SQLException {
        int result = 0;
        try (Connection con = dataSource.getConnection()) {
            String query = "insert into student(student_id, name, surname, dni)"
                    + " values (?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, model.getStudent_id());
            preparedStmt.setString(2, model.getName());
            preparedStmt.setString(3, model.getSurname());
            preparedStmt.setString(4, model.getCard_id());

            // execute the preparedstatement
            result = preparedStmt.executeUpdate();
        }
        return result;
    }

    @Override
    public int update(Student model) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Student model) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getRange(int from, int to) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
