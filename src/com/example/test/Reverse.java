/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test;
import java.util.Scanner;


/**
 *
 * @author deeepp
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        Student[]studentList=new Student[3];
         for(int i=0;i<studentList.length;i++)
         {
             System.out.println("Please enter the Student Name ");
             String studentName=scan.nextLine();
             Student student=new Student(studentName);
             studentList[i]=student;
         }
         for(int i=0;i<studentList.length;i++)
         {
             int studentNumber=i+1;
                System.out.println("Student "+studentNumber+" "+studentList[i].getName());
     
         }
    }
    
    }  
        
    
    
