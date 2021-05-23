/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test;

/**
 *
 * @author deeepp
 */
public class Student {
    String name;
    int id;
    
   public Student(String name)
   {
       this.name=name;
       this.id=123;
   }
   
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
            
    {
      this.name=name;
      
    }
     public int getId()
     {
         return id;
     }
     
    
}
