/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.dao;

import javax.enterprise.context.RequestScoped;
import com.bonarea.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author alumne
 */
@RequestScoped
@MySqlDao
public class StudentDao implements IDao<Student> {

    @Resource(name = "jdbc/myDataSource")
    private DataSource dataSource;

    public StudentDao() {
    }

    @Override
    public int add(Student model) throws SQLException {
        int result = 0;
        try (Connection con = dataSource.getConnection()) {
            String query = "insert into student(name, surname, card_id)"
                    + " values (?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, model.getName());
            preparedStmt.setString(2, model.getSurname());
            preparedStmt.setString(3, model.getCard_id());

            // execute the preparedstatement
            result = preparedStmt.executeUpdate();
        }
        return result;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        try (Connection con = dataSource.getConnection()) {
            String query = "Select * from student;";

            PreparedStatement st = con.prepareStatement(query);

            ResultSet rs = st.executeQuery();

            List<Student> studentList = new ArrayList<Student>();
            while (rs.next()) {
                Student student = new Student();
                student.setStudent_id(rs.getInt("student_id"));
                student.setCard_id(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setCard_id(rs.getString("card_id"));
                studentList.add(student);
            }
            return studentList;
        }
    }

    @Override
    public List<Student> getRange(int from, int to) throws SQLException {
        try (Connection con = dataSource.getConnection()) {
            String query = "SELECT * FROM student WHERE student_id BETWEEN ? AND ?;";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, from);
            st.setInt(2, to);
            ResultSet rs = st.executeQuery();
            List<Student> studentList = new ArrayList<Student>();
            while (rs.next()) {
                Student student = new Student();
                student.setStudent_id(rs.getInt("student_id"));
                student.setCard_id(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setCard_id(rs.getString("card_id"));
                studentList.add(student);
            }
            return studentList;
        }
    }

}
