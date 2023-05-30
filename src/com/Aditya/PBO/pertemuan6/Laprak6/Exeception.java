//Nama    : Aditya Setiawan
//NIM     : 21102034
package com.Aditya.PBO.pertemuan6.Laprak6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exeception {
    public static int jumlahBilangan(int bilangan1, int bilangan2) {
        return bilangan1 + bilangan2;
    }

    public static void main(String[] args) {
        System.out.println("Aditya Setiawan (21102034)");
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = input.nextInt();

            if (bilangan1 == 0) {
                throw new ArithmeticException("Bilangan pertama tidak boleh nol.");
            }

            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = input.nextInt();

            if (bilangan2 == 0) {
                throw new ArithmeticException("Bilangan kedua tidak boleh nol.");
            }

            int hasil = jumlahBilangan(bilangan1, bilangan2);
            System.out.println("Hasil penjumlahan: " + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Mohon masukkan bilangan bulat.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}