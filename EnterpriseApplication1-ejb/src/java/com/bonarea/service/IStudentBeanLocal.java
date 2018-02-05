/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service;

import java.sql.SQLException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alumne
 */
@Local
public interface IStudentBeanLocal<T> {
    public int add(T model) throws SQLException;
    public List<T> getAll() throws SQLException;
}
