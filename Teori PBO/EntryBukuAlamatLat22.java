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
import Frentyusmelia151222.EntryBukuAlamat;
import java. util.Scanner;
public class EntryBukuAlamatLat22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        EntryBukuAlamat BukuAlamat = new EntryBukuAlamat();
        
        String [] nama = new String[100];
        String [] alamat = new String[100];
        String [] noHp = new String[100];
        String [] email = new String[100];
        
        int pilihan;
        int n,no;
        String yatidak = "";
        int jumlah = 0;
       
        
        System.out.println("MENU BUKU ALAMAT");
        System.out.println("1. Memasukkan Data");
        System.out.println("2. Menampilkan Data");
        System.out.println("3. Menghapus Data");
        System.out.println("4. Update Data");
        
        System.out.print("Masukkan Pilihan ");
        pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1 : 
                System.out.print("Masukkan Jumlah  : ");
                jumlah = input.nextInt();
                
                input.nextLine();
                
                System.out.println("=========MEMASUKKAN DATA=================");
                for (int i = 0; i < jumlah; i++) {
                System.out.println("Data ke- " +(i+1));
                System.out.print("Masukkan Nama : ");
                nama[i] = input.nextLine();
                System.out.print("Masukkan Alamat : ");
                alamat[i] = input.nextLine();
                System.out.print("Masukkan No Hp : ");
                noHp[i] = input.nextLine();
                System.out.print("Masukkan Email : ");
                email[i] = input.nextLine();
                
            }
                
                for (int i = 0; i < jumlah; i++) {
                    BukuAlamat.setNama(nama[i],i,alamat[i],noHp[i],email[i]);
                    System.out.println("=================================");
                    System.out.println("Nama : " +BukuAlamat.getNama(i));
                    System.out.println("Alamat : " +BukuAlamat.getAlamat(i));
                    System.out.println("No Hp : " +BukuAlamat.getNoHp(i));
                    System.out.println("Email : " +BukuAlamat.getEmail(i));

                }
                System.out.println("Data berhasil dimasukkan");
                break;
                
            case 2 :
                System.out.println("============MENAMPILKAN DATA==============");
                for (int i = 0; i < jumlah; i++) {
                    BukuAlamat.setNama(nama[i], i, alamat[i], noHp[i], email[i]);
                    System.out.println("=================================");
                    System.out.println("Nama : " +BukuAlamat.getNama(i));
                    System.out.println("Alamat : " +BukuAlamat.getAlamat(i));
                    System.out.println("No Hp : " +BukuAlamat.getNoHp(i));
                    System.out.println("Email : " +BukuAlamat.getEmail(i));
                    
                }
                
                break;
                
                case 3 :
                    System.out.println("=======MENGHAPUS DATA==============");
                    System.out.print("Input No Siswa yang Akan Dihapus: Input [1-"+jumlah+"]: ");
                    n = input.nextInt();
                    
                    no=n;
                    System.out.println("Ditemukan Data ke- "+no);
                    no=no-1;
                    
                    BukuAlamat.setNama(nama[no],no,alamat[no],noHp[no],email[no]);
                    System.out.println("===========================================");
                    System.out.println("Nama                  :"+BukuAlamat.getNama(no) );
                    System.out.println("Alamat                :"+BukuAlamat.getAlamat(no) );
                    System.out.println("Telepon               :"+BukuAlamat.getNoHp(no) );
                    System.out.println("Email                 :"+BukuAlamat.getEmail(no) );
                    System.out.println("===========================================");
                    
                    System.out.print("Yakin akan dihapus? [y]/[t] :");
                    yatidak = input.nextLine();
                    
                    
                    if ((yatidak=="tidak")||(yatidak=="t")||(yatidak=="T")){
                        System.out.println("Data Tidak Jadi di hapus");
                    }else{
                        nama[no]="";
                        alamat[no]="";
                        noHp[no]="";
                        email[no]="";
                    
                    BukuAlamat.setNama(nama[no],no,alamat[no],noHp[no],email[no]);
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                    System.out.println("Nama                  :"+BukuAlamat.getNama(no) );
                    System.out.println("Alamat                :"+BukuAlamat.getAlamat(no) );
                    System.out.println("Telepon               :"+BukuAlamat.getNoHp(no) );
                    System.out.println("Email                 :"+BukuAlamat.getEmail(no) );
                    
                    System.out.println("===========================================");
                        System.out.println("Data Berhasil Dihapus");
                    }
                    break;
                    
                case 4 :
                    System.out.println("==========UPDATE DATA=============");
                    System.out.print("Input No Siswa yang Akan Dihapus: Input [1-"+jumlah+"]: ");
                    n = input.nextInt();
                    
                    no=n;
                    System.out.println("Ditemukan Data ke- "+no);
                    no=no-1;
                    
                    BukuAlamat.setNama(nama[no],no,alamat[no],noHp[no],email[no]);
                    System.out.println("===========================================");
                    System.out.println("Nama                  :"+BukuAlamat.getNama(no) );
                    System.out.println("Alamat                :"+BukuAlamat.getAlamat(no) );
                    System.out.println("Telepon               :"+BukuAlamat.getNoHp(no) );
                    System.out.println("Email                 :"+BukuAlamat.getEmail(no) );
                    System.out.println("===========================================");
                    
                    System.out.print("Lanjutkan Proses Ubah Data [y]/[t] :");
                    yatidak = input.nextLine();
                    
                    input.nextLine();
                    
                    
                    if ((yatidak=="tidak")||(yatidak=="t")||(yatidak=="T")){
                        System.out.println("Data Tidak Jadi di ubah");
                    }else{
                        nama[no]="";
                        alamat[no]="";
                        noHp[no]="";
                        email[no]="";
                        
                     System.out.println("PROSES UBAH DATA Ke- " +no);
                    
                        System.out.print("Masukkan Nama : ");
                        nama[no] = input.nextLine();
                        System.out.print("Masukkan Alamat : ");
                        alamat[no] = input.nextLine();
                        System.out.print("Masukkan No Hp : ");
                        noHp[no] = input.nextLine();
                        System.out.print("Masukkan Email : ");
                        email[no] = input.nextLine();

                    

                    BukuAlamat.setNama(nama[no],no,alamat[no],noHp[no],email[no]);
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                    System.out.println("Nama                  :"+BukuAlamat.getNama(no) );
                    System.out.println("Alamat                :"+BukuAlamat.getAlamat(no) );
                    System.out.println("Telepon               :"+BukuAlamat.getNoHp(no) );
                    System.out.println("Email                 :"+BukuAlamat.getEmail(no) );
                    
                    System.out.println("===========================================");
                        System.out.println("Data Berhasil Diubah");
                    }
                    break;
                    
                default :
                    System.out.println("Data Berhasil Diubah");
       
        }    
        
    }
}
