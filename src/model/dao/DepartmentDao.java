/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.entities.Department;

/**
 *
 * @author djunior
 */
public interface DepartmentDao {
    void insert (Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department fingById(Integer id);
    List<Department> findAll();
    
    
    
}
