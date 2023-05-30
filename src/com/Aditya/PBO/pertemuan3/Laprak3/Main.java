package com.Aditya.PBO.pertemuan3.Laprak3;
//Nama    : Aditya Setiawan
//NIM     : 21102034
public class Main {
    public static void main(String[] args) {
        Koperasi Buku_Tulis = new Koperasi(5000, "Buku Tulis", 10, 5000*10);
        Koperasi Pensil = new Koperasi(3000, "Pensil", 20, 3000*20);
        int totalsemua = Buku_Tulis.getTotal_harga() + Pensil.getTotal_harga();
        System.out.println("KOPERASI ADITYA 034");
        System.out.println();
        Buku_Tulis.detailbarang();
        System.out.println();
        Pensil.detailbarang();
        System.out.println();
        System.out.println(
                "Total Harga Semua Barang : " + totalsemua
        );
    }
}
