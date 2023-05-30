//Nama    : Aditya Setiawan
//NIM     : 21102034
package com.Aditya.PBO.pertemuan6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Masukan Angka: ");
            int angka1 = input.nextInt();

            System.out.println("Masukan Angka Pembagi: ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + "=" + hasil + " (dibulatkan) ");
        }
        catch(ArithmeticException e){
            System.out.println("Kesalahan dalam perhitungan");
        }
        catch(InputMismatchException e){
            System.out.println("Kesalahan dalam input");
        }
        finally{
            System.out.println("finnaly akan terus berjalan");
        }
    }
}
