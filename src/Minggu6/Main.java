package Minggu6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Makananku makananku = new Makananku();
        while (true) {
            String namaMakanan = makananku.tambahMakanan();
            if(namaMakanan.equals("selesai")) {
                break;
            }
        }
        if(!makananku.cekMakanan()){
            return;
        }
        makananku.makananPalingBaru();
        makananku.hapusMakanan();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Cari nama makanan (isikan 'selesai' jika sudah) : ");
            String namaMakanan = scanner.nextLine();
            if(namaMakanan.equals("selesai")) {
                break;
            }
            makananku.cariMakanan(namaMakanan);
        }
    }
}