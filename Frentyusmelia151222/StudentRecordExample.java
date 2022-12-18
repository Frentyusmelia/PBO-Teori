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
import java.util.Scanner;
public class StudentRecordExample {
    public static void main(String[] args) {
        
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord aliRecord = new StudentRecord("Ali","Bukit Tinggi");
        
        annaRecord.setName("Anna");
        annaRecord.setAddress("Padang");
        annaRecord.setAge(25);
        annaRecord.setMathGrade(70);
        annaRecord.setEnglishGrade(80);
        annaRecord.setScienceGrade(80);
        
        System.out.println("Nama        : "+annaRecord.getName());
        System.out.println("Alamat      : "+annaRecord.getAddress());
        System.out.println("Umur        : "+annaRecord.getAge());
        System.out.println("Matematika  : "+annaRecord.getMathGrade());
        System.out.println("B.Inggris   : "+annaRecord.getEnglishGrade());
        System.out.println("Pengetahuan : "+annaRecord.getScienceGrade());
        System.out.println("Rata-Rata   : "+annaRecord.getAverage());
        
        //ali
        aliRecord.print("");
        aliRecord.print(90,80,70);
        
        //Tampilkan jumlah siswa
        System.out.println("Jumlah Siswa        : "+ annaRecord.getStudentCount());
    }
}
