/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author djunior
 */
public class Program {
    public static void main(String [] args){
        
        Department obj = new Department(1, "Books");
        Seller seller = new Seller (21,"Bob","bob@gmail.com",new Date(),3000.0,obj);
        System.out.println(seller);
    }
}
