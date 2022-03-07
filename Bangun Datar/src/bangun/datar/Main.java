package bangun.datar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang,lebar,tinggi,radian;
        int pilihMenu;
        
        do{
            System.out.println("========================================");
            System.out.println("                  MENU");
            System.out.println("========================================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Pilih : ");
            pilihMenu = input.nextInt();
            System.out.println("");
            System.out.println("----------------------------------------");
            
            switch(pilihMenu){
                case 0 -> System.out.println("              TERIMA KASIH");
                case 1 -> { 
                    System.out.print("Input Panjang            : ");
                    panjang = input.nextDouble();
                    System.out.print("Input Lebar              : ");
                    lebar = input.nextDouble();
                    System.out.print("Input Tinggi             : ");
                    tinggi = input.nextDouble();
                    System.out.println("----------------------------------------");
                    Balok balok = new Balok(tinggi, panjang, lebar);
                    System.out.println("Luas Persegi Panjang     = " + balok.menghitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + balok.menghitungKeliling());
                    System.out.println("Volume Balok             = " + balok.menghitungVolume());
                    System.out.println("Luas Permukaan Balok     = " + balok.menghitungLuas(tinggi));
                }
                case 2 -> {
                    System.out.print("Input Jari Jari       : ");
                    radian = input.nextDouble();
                    System.out.print("Input Tinggi          : ");
                    tinggi = input.nextDouble();
                    System.out.println("----------------------------------------");
                    Tabung tabung = new Tabung(tinggi,radian);
                    System.out.println("Luas Lingkaran        = " + tabung.menghitungLuas());
                    System.out.println("Keliling Lingkaran    = " + tabung.menghitungKeliling());
                    System.out.println("Volume Tabung         = " + tabung.menghitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.menghitungLuas(tinggi));
                } 
                default -> System.out.println("Tidak ada menu " + pilihMenu);
            }
            
            System.out.println("----------------------------------------");
            
            System.out.println("");
            if(pilihMenu != 0){
                System.out.print("Ulangi ? (Ya: 1 || Tidak: 0) : ");
                pilihMenu = input.nextInt();
            }
            
        }while(pilihMenu == 1);
        
    }
    
}
