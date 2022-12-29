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
public class StudentRecordExample {
    public static void main( String[] args ){
        StudentRecord afrilRecord = new StudentRecord();

        //Memberi nama siswa
        afrilRecord.setName("Afril");

        //Menampilkan nama siswa
        System.out.println(afrilRecord.getName() );

        //Menampilkan jumlah siswa
        System.out.println("Count= "+StudentRecord.getStudentCount());
    }
}
