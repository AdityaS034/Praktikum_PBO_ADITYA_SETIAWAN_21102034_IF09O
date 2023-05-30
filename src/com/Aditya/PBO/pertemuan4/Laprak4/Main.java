package com.Aditya.PBO.pertemuan4.Laprak4;
//Nama    : Aditya Setiawan
//NIM     : 21102034
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Menggunakan scanner untuk inputan dari keyboard
        Scanner input = new Scanner(System.in);
        //inisial menu
        WarungMakan wm = new WarungMakan();
        menu m = new menu();
        menu m1 = new menu();
        menu m2= new menu();
        menu m3= new menu();
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Nim : ");
        int nim = input.nextInt();
        wm.nama_warung = "Nasi Goreng Bang Adit";
        wm.alamat = "Kalapacung";
        wm.no_telp = "082138863590";
        m1.no_makanan = 1; m1.nama_makanan = "Nasi Goreng";
        m1.harga = 10000;
        m1.stock= 10;
        m2.no_makanan = 2;
        m2.nama_makanan = "Nasi Goreng Spesial";
        m2.harga = 15000;
        m2.stock= 4;
        m3.no_makanan = 3;
        m3.nama_makanan = "Nasi Goreng Spesial + Telur";
        m3.harga = 20000;
        m3.stock= 20;
        wm.detailWarung(); m1.detailMakanan();
        m2.detailMakanan();
        m3.detailMakanan();
        System.out.print("Masukkan Nomor Makanan yang ingin di beli :");
        m.no_makanan = input.nextInt();
//Menggunakan Percabangan
//untuk memilih menu 1
        if(m.no_makanan == 1){
            System.out.print("Masukkan Jumlah Pesanan :");
            wm.beliMakanan(m1, input.nextInt());
            m1.totalHarga();
            wm.cekStok(m1);
// untuk memilih menu 2
        }else if (m.no_makanan == 2){
            System.out.print("Masukkan Jumlah Pesanan :");
            wm.beliMakanan(m2, input.nextInt());
            m2.totalHarga();
            wm.cekStok(m2);
//untuk memilih menu 3
        }else if(m.no_makanan == 3){
            System.out.println("Masukkan Jumlah Pesanan :");
            wm.beliMakanan(m3, input.nextInt());
            m3.totalHarga();
            wm.cekStok(m3);
        }else{
            System.out.println("Ranono nang menu!!!");
        }
//berhenti memilih menu
        input.close();
    }
}
