package Minggu6;

import java.util.Scanner;
import java.util.Stack;

public class Makananku {
    Stack<String> daftarMakanan;
    Makananku(){
        daftarMakanan = new Stack<String>();
    }
    public String tambahMakanan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama makanan (isikan 'selesai' jika sudah) : ");
        String namaMakanan = scanner.nextLine();
        if(namaMakanan.equals("selesai")) {
            return namaMakanan;
        }
        this.daftarMakanan.push(namaMakanan);
        return  namaMakanan;
    }
    public void hapusMakanan() {
        String makananYangDibuang = this.daftarMakanan.pop();
        System.out.println(makananYangDibuang + " telah dihapus dari daftar makanan. (pop)");
        System.out.println();
    }
    public void makananPalingBaru() {
        String makananBaru = this.daftarMakanan.peek();
        System.out.println(makananBaru + " adalah makanan yang paling baru di input. (peek)");
    }
    public void cariMakanan(String namaMakanan) {
        Integer pos = (Integer) daftarMakanan.search(namaMakanan);
        if(pos == -1) {
            System.out.println(namaMakanan + " tidak ditemukan. (search)");
            System.out.println();
            return;
        }
        System.out.println(namaMakanan + " ditemukan. (search)");
        System.out.println();
    }
    public boolean cekMakanan() {
        if(this.daftarMakanan.empty()) {
            System.out.println("List makanan kosong. (empty)");
            return false;
        }
        System.out.println();
        System.out.println("Total ada " + this.daftarMakanan.size() + " makanan. (empty)");
        return true;
    }
}