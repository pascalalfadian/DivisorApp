package id.ac.unpar.informatika.divisorapp;

import java.util.Scanner;

public class DivisorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        System.out.print("Masukkan a: ");
        a = scanner.nextLong();
        System.out.print("Masukkan b: ");
        b = scanner.nextLon();
        if (b == 0) {
            System.out.println("b tidak boleh nol");
        } else {
            System.out.println("a/b=" + a/b);
        }
    }
}
