/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia151222_Modul11;

/**
 *
 * @author ACER
 */
public class Person {
    protected String name; 
    protected String address; 

    /** 
    * Default constructor 
    */ 
    public Person(){ 
        System.out.println("Inside Person:Constructor"); 
        name = "Anna"; 
        address = "Padang"; 
    } 
     
    /** 
    * Constructor dengan dua parameter 
    */ 
    public Person( String name, String address ){ 
        this.name = name; 
        this.address = address; 
    } 
     
    /** 
    * Method accessor 
    */ 
    public String getName(){ 
        System.out.println("get Name Person");
        return name; 
    }
    
    public void setName( String name ){ 
        this.name = name; 
    } 
    
    public String getAddress(){ 
        return address; 
    }
     
    public void setAddress( String add ){ 
        this.address = add; 
    } 
    
    public static void main( String[] args){ 
        Person p = new Person (); 
    } 
}
