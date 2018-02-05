/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service;

import com.bonarea.model.Student;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import com.bonarea.dao.MySqlDao;
import com.bonarea.dao.StudentDao;
import com.bonarea.dao.StudentDaoUniverse;
import com.bonarea.dao.UniverseDao;
import java.util.List;

/**
 *
 * @author alumne
 */
@Stateless
public class StudentBean implements IStudentBeanLocal<Student> {

    @Inject
    @UniverseDao
    StudentDaoUniverse studentDao;
    
    @Override
    public int add(Student model) throws SQLException {
        return studentDao.add(model);
    }
    
    @Override
    public List<Student> getAll() throws SQLException {
        return studentDao.getAll();
    }    

    @Override
    public List<Student> getRange(int from, int to) throws SQLException {
        return studentDao.getRange(from, to);
    }

    @Override
    public int update(Student model) throws SQLException {
        return studentDao.update(model);
    }

    @Override
    public int delete(Student model) throws SQLException {
        return studentDao.delete(model);
    }
}
