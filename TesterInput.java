package BuatBaru;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CD/DVD");
        String type = input.nextLine();

        System.out.print("Nama : ");
        String name = input.nextLine();

        System.out.print("Number : ");
        int number = input.nextInt();

        System.out.print("Quantity : ");
        int quantity = input.nextInt();

        System.out.print("Price : ");
        double price = input.nextDouble();
        input.nextLine();

        if (type.equalsIgnoreCase("CD")) {
            
            System.out.print("Artist : ");
            String artist = input.nextLine();

            System.out.print("NumSongs : ");
            int numSongs = input.nextInt();
            input.nextLine();

            System.out.print("Label : ");
            String label = input.nextLine();

            Cd myCd = new Cd(artist, numSongs, label, number, name, quantity, price);
            System.out.println();
            myCd.print();
            input.nextLine();
        } else if (type.equalsIgnoreCase("DVD")) {
            
            System.out.print("Length : ");
            int length = input.nextInt();
            input.nextLine();

            System.out.print("Studio : ");
            String studio = input.nextLine();

            System.out.print("Rating : ");
            String rating = input.nextLine();

            DVD myDVD = new DVD(number, name, quantity, price, length, studio, rating);
            System.out.println();
            myDVD.print();
            input.nextLine();
        }
        input.close();
    }
}
