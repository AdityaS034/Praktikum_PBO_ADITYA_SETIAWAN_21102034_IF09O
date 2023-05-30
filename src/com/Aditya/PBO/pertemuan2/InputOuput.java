package com.Aditya.PBO.pertemuan2;
//Nama    : Aditya Setiawan
//NIM     : 21102034
import java.util.Scanner;
public class InputOuput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama anda : ");
        String nama = scanner.nextLine();
        System.out.println("Selamat Pagi " + nama );
    }
}
