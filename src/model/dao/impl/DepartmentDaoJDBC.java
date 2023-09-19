/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import java.sql.Connection;

/**
 *
 * @author djunior
 */
public class DepartmentDaoJDBC {
    
    private Connection conn;
    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }    
}
