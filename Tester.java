package BuatBaru;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapa jumlah objek?");
        int n = in.nextInt();
        if (n > 10 || n < 1) {
            System.out.println("Tidak bisa melebihi 10 objek dan harus bernominal tidak sama dengan 0");
        } else if (n == 1) 
        {
            try {
                System.out.println("Silahkan Pilih 1 untuk membuat Cd atau 2 untuk membuat DVD");
                int pilihan = in.nextInt();
                if (pilihan == 1) {
                    Cd myCd = new Cd();
                    myCd.print();
                } else if (pilihan == 2) {
                    DVD myDVD = new DVD();
                    myDVD.print();
                } else {
                    System.out.println("Pilihan tidak valid");
                }

            } catch (Exception e) {
                System.out.println("Type data salah, hanya menerima angka");
            }
        } else if (n >= 2 && n <= 10) {
            for (int i = 1; i <= n; i++) {
                try {
                    System.out.println("Silahkan Pilih 1 untuk membuat Cd atau 2 untuk membuat DVD");
                    int pilihan = in.nextInt();
                    if (pilihan == 1) {
                        Cd myCd = new Cd();
                        myCd.print();
                    } else if (pilihan == 2) {
                        DVD myDVD = new DVD();
                        myDVD.print();
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                } catch (Exception e) {
                    System.out.println("Type data salah, hanya menerima angka");
                }
            }

            in.close();
        }

    }
}