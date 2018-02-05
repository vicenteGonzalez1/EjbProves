/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alumne
 */
public interface IDao<T> {
    public int add(T model) throws SQLException;
    public List<T> getAll() throws SQLException;
    public List<T> getRange(int from, int to) throws SQLException;
}
