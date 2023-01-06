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
import Frentyusmelia151222.BukuAlamatLat2;
import java. util.Scanner;
import java.*;
import java.io.IOException;
public class EntryBukuAlamatLat2 {
    public static void main(String[] args) {
        BukuAlamatLat2 dataRecord = new BukuAlamatLat2();
        Scanner dataIn = new Scanner(System.in);
        int pil=0;
        int n=0;
        int no;
        String yatidak="";
        String [] nama = new String [100];
        String [] alamat = new String [100];
        String [] telepon = new String [100];
        String [] email = new String [100];
        
        do {
        System.out.println("==============================MENU==============================");
        System.out.println("1. Memasukkan Data");
        System.out.println("2. Menghapus Data");
        System.out.println("3. Menampilkan data");
        System.out.println("4. Update Data");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pil = dataIn.nextInt();
        
        switch(pil){
            case 1:
                System.out.print("Jumlah yang ingin diinputkan : ");
                n = dataIn.nextInt();
                
                for (int i = 0; i<n; i++){
                    System.out.println("Data ke "+(i+1));
                    System.out.print("Nama        :");
                    nama [i] = dataIn.next();
                    System.out.print("Alamat        :");
                    alamat [i] = dataIn.next();
                    System.out.print("Telepon        :");
                    telepon [i] = dataIn.next();
                    System.out.print("Email        :");
                    email [i] = dataIn.next();
                }
                for (int i = 0; i< n; i++){
                    dataRecord.setNama(nama[i], i, alamat[i], telepon[i], email[i]);
                }
                break;
            case 2:
                System.out.println("Menghapus Data");
                System.out.print("Input No Siswa yang Akan Dihapus: Input [1-"+n+"]: ");
                no= dataIn.nextInt();
                System.out.println("Ditemukan Data ke- "+no);
                no=no-1;
                dataRecord.setNama(nama[no], no, alamat[no], telepon[no], email[no]);
                    System.out.println("Nama        :"+dataRecord.getNama(no));
                    System.out.println("Alamat        :"+dataRecord.getAlamat(no));
                    System.out.println("Telepon       :"+dataRecord.getTelpon(no));
                    System.out.println("Email        :"+dataRecord.getEmail(no));
                System.out.println("===========================================");
                System.out.print("Yakin akan dihapus? [y]/[t] :");
                yatidak = dataIn.nextLine();
                
        if ((yatidak=="tidak")||(yatidak=="t")||(yatidak=="T")){
            System.out.println("Data Tidak Jadi di hapus");
        }else{
            nama[no]="";
            alamat[no]="";
            telepon[no]="";
            email[no]="";
             dataRecord.setNama(nama[no], no, alamat[no], telepon[no], email[no]);
                    System.out.println("Nama        :"+dataRecord.getNama(no));
                    System.out.println("Alamat        :"+dataRecord.getAlamat(no));
                    System.out.println("Telepon       :"+dataRecord.getTelpon(no));
                    System.out.println("Email        :"+dataRecord.getEmail(no));
            System.out.println("Data Berhasil Dihapus");
        }
                break;
            case 3:
                System.out.println("Keseluruhan  Data Buku Alamat");
                for(int  i=0; i<n; i++){
                    dataRecord.setNama(nama[i], i, alamat[i], telepon[i], email[i]);
                    System.out.println("Nama        :"+dataRecord.getNama(i));
                    System.out.println("Alamat        :"+dataRecord.getAlamat(i));
                    System.out.println("Telepon       :"+dataRecord.getTelpon(i));
                    System.out.println("Email        :"+dataRecord.getEmail(i));
                }
                break;
            case 4:
                System.out.println("Mengubah Data");
                System.out.print("Input data yang Akan Diubah datanya: Input [1-"+n+"]: ");
                no= dataIn.nextInt();
                System.out.println("Ditemukan Data ke- "+no);
                no=no-1;
                dataRecord.setNama(nama[no], no, alamat[no], telepon[no], email[no]);
                    System.out.println("Nama        :"+dataRecord.getNama(no));
                    System.out.println("Alamat        :"+dataRecord.getAlamat(no));
                    System.out.println("Telepon       :"+dataRecord.getTelpon(no));
                    System.out.println("Email        :"+dataRecord.getEmail(no));
                System.out.println("===========================================");
                System.out.print("Yakin akan dihapus? [y]/[t] :");
                yatidak = dataIn.nextLine();
                if ((yatidak=="tidak")||(yatidak=="t")||(yatidak=="T")){
            System.out.println("Data Tidak Jadi di ubah");
        }else{
            System.out.println("Proses Ubah Data ke: "+(no+1));
               System.out.print("Input Nama: ");
                     nama[no]= dataIn.nextLine();
               System.out.print("Input Alamat: ");
                       alamat[no]=dataIn.nextLine();
               System.out.print("Input telpon: ");
                       telepon[no]=dataIn.nextLine();
               System.out.print("Input Email: ");
                       email[no]=dataIn.nextLine();
                dataRecord.setNama(nama[no], no, alamat[no], telepon[no], email[no]);
                           System.out.println("Nama        :"+dataRecord.getNama(no));
                           System.out.println("Alamat        :"+dataRecord.getAlamat(no));
                           System.out.println("Telepon       :"+dataRecord.getTelpon(no));
                           System.out.println("Email        :"+dataRecord.getEmail(no));
                       System.out.println("===========================================");
                       System.out.println("Data Berhasil Diubah");
        }
                break;
        }
        }while(pil !=5);
    }
}
