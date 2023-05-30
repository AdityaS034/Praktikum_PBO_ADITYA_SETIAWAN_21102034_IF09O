package com.Aditya.PBO.pertemuan2.Laprak2;
//Nama    : Aditya Setiawan
//NIM     : 21102034
import java.util.Scanner;
public class LAPRAK2 {
    public static void main(String[] args) {

        //UNGUIDED 1
        System.out.println("UNGUIDED 1");
        Scanner input = new Scanner(System.in);
        int batas;

        System.out.print("Masukkan batas bilangan: ");
        batas = input.nextInt();

        System.out.println("Bilangan genap antara 1 sampai " + batas + " adalah:");
        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap " + i + " ");
            }
        }

        //UNGUIDED 2
        System.out.println("UNGUIDED 2");
        Scanner entry = new Scanner(System.in);
        String nama;
        int umur, pilihanProgramStudi;

        System.out.println("Form Pendaftaran Mahasiswa");
        System.out.print("Masukkan nama lengkap Anda: ");
        nama = entry.nextLine();

        if (nama.length() == 0) {
            System.out.println("Error: Nama tidak boleh kosong!");
            System.exit(0);
        }

        System.out.print("Masukkan umur Anda: ");
        umur = entry.nextInt();

        if (umur < 17) {
            System.out.println("Error: Umur harus lebih dari atau sama dengan 17 tahun!");
            System.exit(0);
        }

        System.out.println("Pilihan Program Studi:");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Desain Komunikasi Visual");
        System.out.print("Masukkan pilihan Anda (1-3): ");
        pilihanProgramStudi = entry.nextInt();

        switch (pilihanProgramStudi) {
            case 1:
                System.out.println("Anda memilih Program Studi Teknik Informatika.");
                break;
            case 2:
                System.out.println("Anda memilih Program Studi Sistem Informasi.");
                break;
            case 3:
                System.out.println("Anda memilih Program Studi Desain Komunikasi Visual.");
                break;
            default:
                System.out.println("Error: Pilihan Program Studi tidak valid!");
                System.exit(0);
        }

        System.out.println("Terima kasih telah mendaftar!");
    }
}


