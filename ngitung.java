package bangun_ruang;

import java.util.Scanner;

public class ngitung {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("» Selamat Datang!!!");
        System.out.println("» ingin menghitung apaan tuh?");
        System.out.println("» Pilih Menu dibawah ini yaa!\n  1.Rectangle\n  2.Circle");
        String choose = x.nextLine();
        if (choose.equals("1")) {
            System.out.print("Nama : ");
            String name = x.nextLine();
            System.out.print("Color : ");
            String color = x.nextLine();
            System.out.println("» Ingin menghitung bangun datar atau bangunan 3D?\n  1.Rectangle ( Datar )\n  2.Cube ( 3D )");
            int choose2 = x.nextInt();
            x.nextLine();
            if (choose2 == 1) {
                System.out.print("Panjang : ");
                int length = x.nextInt();
                x.nextLine();
                System.out.print("Lebar : ");
                int width = x.nextInt();
                x.nextLine();

                rectangle rectangle = new rectangle(length, width, name, color);
                System.out.println("=====================");
                System.out.println("» Data Bangun Ruang «");
                System.out.println("=====================");
                rectangle.print();
                System.out.println("=====================");
                rectangle.luas();
                rectangle.keliling();

            } else if (choose2 == 2) {
                System.out.println();
                System.out.println("» Cube");
                System.out.print("Panjang :   ");
                int length = x.nextInt();
                System.out.print("Lebar :   ");
                int width = x.nextInt();
                System.out.print("Tinggi :   ");
                int height = x.nextInt();
                x.nextLine();

                cube cube = new cube(height, length, width, name, color);
                System.out.println("=====================");
                System.out.println("» Data Bangun Ruang «");
                System.out.println("=====================");
                cube.print();
                System.out.println("=====================");
                cube.volume(width, length, height);
                cube.luas(width, length, height);

            }

        } else if (choose.equals("2")) {
            System.out.println("lingkaran");

            System.out.print("Nama : ");
            String name = x.nextLine();
            System.out.print("Color : ");
            String color = x.nextLine();
            System.out.print("Jari-jari lingkaran : ");
            int radius = x.nextInt();
            x.nextLine();

            circle circle = new circle(radius, name, color);
            System.out.println("=====================");
            System.out.println("» Data Bangun Ruang «");
            System.out.println("=====================");
            circle.print();
            System.out.println("=====================");
            circle.luas();
            circle.keliling();
            x.close();

        }

        System.out.println("» Terimakasih telah menggunakan layanan kami!\n  Bantu kami untuk berkembang! Kritik dan saran anda kami utamakan!");
    }

}