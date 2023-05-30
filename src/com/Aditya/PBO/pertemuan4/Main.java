package com.Aditya.PBO.pertemuan4;
//Nama    : Aditya Setiawan
//NIM     : 21102034
public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();

        manajer.nip = 181910024;
        manajer.nama = "Basuki";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(1000000);

        //Polimorfisme
        //Program mengetahui kondisi parameter meskipun nilainya sama!
        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus();
    }
}
