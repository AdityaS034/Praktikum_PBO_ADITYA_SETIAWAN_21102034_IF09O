//Nama    : Aditya Setiawan
//NIM     : 21102034
package com.Aditya.PBO.pertemuan6;
public class TryCatch {
    public static void main(String[] args) {
        int[] angka = {
                1, 2, 3, 4, 5
        };
        System.out.print("Coba Index ke 4:");
        try{
            System.out.println(
                    angka[4]
            );
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukan melebihi batas!"
            );
        }
        System.out.print("Coba Index ke 5:");
        try{
            System.out.println(
                    angka[5]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukan melebihi batas!"
            );
        }
    }
}
