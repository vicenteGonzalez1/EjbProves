/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.dao;

import javax.enterprise.context.RequestScoped;
import com.bonarea.model.Student;
import java.sql.Connection;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author alumne
 */
@RequestScoped
@MySqlDao
public class StudentDao implements IDao<Student> {
    
    @Resource(name="jdbc/mysql")
    private DataSource dataSource;

    public StudentDao(){}
    
    @Override
    public int add(Student model) throws SQLException {
        Connection con = dataSource.getConnection();
        con.close();
        return 0;
    }
    
}
