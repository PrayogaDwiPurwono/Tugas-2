package com.Tugas2;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persegi pertama  = new Persegi();
        Segitiga kedua   = new Segitiga();
        Lingkaran ketiga = new Lingkaran();

        int sisi, alas, tinggi, jarijari;
        int menu = input.nextInt();

        if(menu==1){
            sisi = input.nextInt();
            pertama.getLuas(sisi);
        }else if(menu==2){
            alas   = input.nextInt();
            tinggi = input.nextInt();
            kedua.getLuas(alas, tinggi);

        }else if(menu==3){
            jarijari = input.nextInt();
            ketiga.getLuas(jarijari);
        }else{
            System.out.print("Input yang anda masukan tidak sesuai");
        }
    }
}

class Persegi{
    void getLuas(int sisi){
        int hasil = sisi*sisi;
        System.out.print(hasil);
    }
}

class Segitiga{
    void getLuas(int alas, int tinggi){
        int hasil = (alas*tinggi)/2;
        System.out.print(hasil);
    }
}

class Lingkaran{
    void getLuas(int jarijari){
        if(jarijari == 7){
            double hitungLuas = 22/7 *jarijari *jarijari;
            int hasil = (int)hitungLuas;
            System.out.print((double)hasil);
        }else{
            double hitungLuas = 3.14 *jarijari *jarijari;
            int hasil  = (int)hitungLuas;
            System.out.print((double)hasil);
        }
    }
}
