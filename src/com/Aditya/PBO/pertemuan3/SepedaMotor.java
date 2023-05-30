package com.Aditya.PBO.pertemuan3;
//Nama    : Aditya Setiawan
//NIM     : 21102034
public class  SepedaMotor{
    //Atribut
    //Jika menggunakan private maka menggunakan getter and setter untuk memanggilnya.
    //Getter and setter dipanggil pada method sehingga tidak dapat memanggil atribut (variable.atribut) karena bersifat private

    private String merek;
    private String tipe;
    private int harga;

    //Constructor
    public SepedaMotor(){}

    //Constructor Berparameter
    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    //Method

    //Getter and Setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void showInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
