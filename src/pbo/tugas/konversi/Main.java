//Muhammad Raehan Parikesit (123200149)
package pbo.tugas.konversi;//paket file

import java.util.Scanner;//mengimport agar dapat melakukan input dan output

class Main{
    public static void main(String[] args){
        double celcius;
        int menu;
        Scanner input = new Scanner(System.in);
        boolean kondisi=true;
        System.out.println();
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input data");
        System.out.println("----------");
        System.out.print("Suhu dalam Celcius:");

        celcius=input.nextDouble();
        Konversi Konversi = new Konversi(celcius);
        
        System.out.println();
        do{
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   :");

            menu = input.nextInt();
            System.out.println();
            switch(menu){
                case 1:
                System.out.format("Suhu Dalam Celcius       : %.1f C\n", Konversi.HasilCelcius());//doule formatting float
                System.out.format("Dalam Fahrenheit         : %.1f F\n", Konversi.HasilFahrenheit());
                System.out.format("Dalam Reamur             : %.1f R\n", Konversi.HasilReamur());
                System.out.format("Dalam Kelvin             : %.1f K\n", Konversi.HasilKelvin());

                if (Konversi.HasilCelcius() <= 0) {
                    System.out.println();
                    System.out.println("Kondisi Air Beku.");
                    System.out.println();
                } else if (Konversi.HasilCelcius() >= 100) {
                    System.out.println();
                    System.out.println("Kondisi Air Mendidih.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Kondisi Air Normal.");
                    System.out.println();
                }
                break;
                case 2:
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius:");
                celcius = input.nextDouble();
                Konversi.InputCelcius(celcius);
                break;
                case 3:
                kondisi=false;
                break;
                default:
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
           
        }while(kondisi);
        input.close();
    }
} 