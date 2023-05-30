package com.Achmad.PBO.Pertemuan5;
//Nama    : Aditya Setiawan
//NIM     : 21102034
public class Barang {
    //Attribute
    String nama;
    int harga;

    //constructor
    public Barang(){}

    public Barang (String nama, int harga){
        this.nama = nama;
        this.harga= harga;
    }
    //Method
    public void ShowInfo(){
        System.out.println("nama Barang : "+this.nama);
        System.out.println("Harga Barang : "+this.harga);
    }
}