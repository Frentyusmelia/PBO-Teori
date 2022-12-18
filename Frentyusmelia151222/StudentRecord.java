/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia151222;

/**
 *
 * @author ACER
 */
public class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private static int studentCount;
    
    public StudentRecord()
    {
        studentCount++;
    }
    
    public StudentRecord(String temp)
    {
        this.name = temp;
        studentCount++;
    }
    
    public StudentRecord(String name, String address)
    {
        this.name = name;
        this.address = address;
        studentCount++;
    }
    
    public StudentRecord(double mGrade, double eGrade, double sGrade)
    {
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }
    
    public void setName(String name){
            this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAddress(String address){
            this.address = address;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAge(int age){
            this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setMathGrade(double mathGrade){
            this.mathGrade = mathGrade;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
            this.englishGrade = englishGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
            this.scienceGrade = scienceGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setAverage(double average){
            this.average = average;
    }
    
    public double getAverage(){
        average =(mathGrade+scienceGrade+englishGrade) /3;
        return average;
    }
    
    public int getStudentCount(){
        return studentCount;
    }
    
    public void print (String temp){
        System.out.println("Name                :"+name);
        System.out.println("Address             :"+address);
        System.out.println("Age                 :"+age); 
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name                :"+name);
        System.out.println("Math Grade          :"+mGrade);
        System.out.println("English Grade       :"+eGrade);
        System.out.println("Science Grade       :"+sGrade);
    }
    
}
