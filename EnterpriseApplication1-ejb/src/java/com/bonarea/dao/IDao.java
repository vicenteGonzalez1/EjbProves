/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.dao;

import java.sql.SQLException;

/**
 *
 * @author alumne
 */
public interface IDao<T> {
    public int add(T model) throws SQLException;
}
