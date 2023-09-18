/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author djunior
 */
public class Program {
    public static void main(String [] args){
        
        
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        Seller seller = sellerDao.fingById(3);
        System.out.println(seller);
    }
}
