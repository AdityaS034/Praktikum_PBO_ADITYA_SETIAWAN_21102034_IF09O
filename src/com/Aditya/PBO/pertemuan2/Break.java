package com.Aditya.PBO.pertemuan2;
//Nama    : Aditya Setiawan
//NIM     : 21102034
public class Break {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 100){
            System.out.println("Perulangan ke-" + p);
            if (p == 50){
                System.out.println("Reflek Turu!");
                break;
            }
            p += 10;
        }
    }
}
