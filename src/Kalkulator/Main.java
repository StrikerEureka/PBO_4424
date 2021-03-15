package Kalkulator;

import Kalkulator.Kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runKalKulator();
    }

    private static void runKalKulator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = scanner.nextInt();

        System.out.println("\nHasil : ");

        Kalkulator kalkulator = new Kalkulator(angka1, angka2);
        System.out.println(angka1 + " + " + angka2 + " = " + kalkulator.tambah());
        System.out.println(angka1 + " / " + angka2 + " = " + kalkulator.bagi());
        System.out.println(angka1 + " - " + angka2 + " = " + kalkulator.kurang());
        System.out.println(angka1 + " x " + angka2 + " = " + kalkulator.kali());
        System.out.println(angka1 + " % " + angka2 + " = " + kalkulator.modulo());
    }
}
