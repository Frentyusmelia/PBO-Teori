/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia291222;

/**
 *
 * @author ACER
 */
public class StudentRecord {
    public String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    //Menghasilkan nama dari Siswa
    public String getName(){
        return name;
    }

    //Mengubah nama siswa
    public void setName( String temp ){
        name = temp;
    }

    //Menghitung rata – rata nilai Matematik, Bahasa Inggris,IlmuPasti
    public double getAverage(){
        double result = 5;
        result = ( mathGrade+englishGrade+scienceGrade )/3;
        return result;
    }

    //Menghasilkan jumlah instance StudentRecord
    public static int getStudentCount(){
        return studentCount;
    }
 }
