package com.Aditya.PBO.pertemuan3;
//Nama    : Aditya Setiawan
//NIM     : 21102034
public class Main {
    public static void main(String[] args) {
//        SepedaMotor Kawasaki = new SepedaMotor();
//        SepedaMotor Yamaha = new SepedaMotor();
//        SepedaMotor Honda = new SepedaMotor();

        // Ubah menjadi comment karena menggunakan private yaitu getter and setter pada atribut vespa
        // Karena pemanggilan (variable.atribut) tidak dapat karena private

//        Kawasaki.merek = "Kawasaki";
//        Kawasaki.tipe  = "R15";
//        Kawasaki.harga = 100000000;
//
//        Yamaha.merek = "Yamaha";
//        Yamaha.tipe  = "Mio";
//        Yamaha.harga = 10000000;
//
//        Honda.merek = "Honda";
//        Honda.tipe  = "Vario";
//        Honda.harga = 25000000;

//        SepedaMotor Kawasaki = new SepedaMotor("Kawasaki", "R15", 100000000);
//        SepedaMotor Yamaha = new SepedaMotor("Yamaha", "Mio", 10000000);
//        SepedaMotor Honda = new SepedaMotor("Honda", "Vario", 25000000);
//
//        Kawasaki.showInfo();
//        Yamaha.showInfo();
//        Honda.showInfo();

         //Lebih Sederhana
        SepedaMotor vespa = new SepedaMotor("vespa", "Vespa Metic", 40000000);
        vespa.showInfo();

        //Proses berjalannya Getter and Setter pada main
        //Sebelum Perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                " Dengan tipe (before) : " + vespa.getTipe()
        );

        //Melakukan Proses Perubahan
        vespa.setTipe("Sprint");

        //Lihat Hasil Perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                " Dengan tipe (after) : " + vespa.getTipe()
        );
    }
}
